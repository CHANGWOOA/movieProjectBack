package com.care.project.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.care.project.main.dto.MemberDTO;
import com.care.project.main.service.MemberService;

@CrossOrigin(origins = "*")
@RestController
public class MemberController {
	@Autowired
	private MemberService ms;
	
	// 회원가입
	@PostMapping(value = "/register", produces = "text/plain;charset=UTF-8")
    public String register(@RequestBody MemberDTO memberDTO) {
        try {
            ms.registerMember(memberDTO);
            return "회원가입 성공";
        } catch (Exception e) {
        	e.printStackTrace();
            return "회원가입 실패: " + e.getMessage();
        }
    }

    // 로그인
    @PostMapping(value = "/login", produces = "text/plain;charset=UTF-8")
    public String login(@RequestBody MemberDTO memberDTO) {
        MemberDTO loginUser = ms.loginMember(memberDTO);
        if (loginUser != null) {
            return "로그인 성공";
        } else {
            return "아이디 또는 비밀번호가 일치하지 않습니다.";
        }
    }

    // 회원 정보 수정
    @PutMapping(value = "/update", produces = "text/plain;charset=UTF-8")
    public String updateMember(@RequestBody MemberDTO memberDTO) {
        try {
            ms.updateMember(memberDTO);
            return "회원정보 수정 성공";
        } catch (Exception e) {
            return "회원정보 수정 실패: " + e.getMessage();
        }
    }

    // 회원 탈퇴
    @DeleteMapping(value = "/delete", produces = "text/plain;charset=UTF-8")
    public String deleteMember(@RequestParam String userId) {
        try {
            ms.deleteMember(userId);
            return "회원탈퇴 성공";
        } catch (Exception e) {
            return "회원탈퇴 실패: " + e.getMessage();
        }
    }

    // 사용자 정보 조회
    @GetMapping(value = "/info", produces = "application/json;charset=UTF-8")
    public MemberDTO getMemberInfo(@RequestParam String userId) {
        return ms.getMemberInfo(userId);
    }
}