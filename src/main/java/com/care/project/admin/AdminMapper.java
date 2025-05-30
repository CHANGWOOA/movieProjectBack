package com.care.project.admin;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.care.project.main.dto.MovieDTO;

@Mapper
public interface AdminMapper {
	// 모든 영화 데이터 삽입
	public int insertMovie(@Param("movie") MovieDTO movie);
	// 기존 영화 찾기
	public MovieDTO findByMovieId(@Param("movieId") int movieId);
	// 기존 영화 업데이트
	public void updateMovie(@Param("movie") MovieDTO movie);
	public int editMovie(@Param("movie") MovieDTO movie);
	public int getscheduleId();
	public void insertSeat(@Param("scheduleId") int scheduleId, @Param("seatId") String seatId);
	public int deleteMovie(@Param("movieId") int movieId);
	public List<Map<String, Object>> getPayment();
}