package com.care.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()  // Spring Security에 CORS 설정 적용
            .and()
            .authorizeRequests()
            .antMatchers("/root/**").authenticated()  // 인증된 사용자만 접근 가능
            .anyRequest().permitAll()  // 나머지 요청은 모두 허용
            .and()
            .csrf().disable();  // CSRF 보호 비활성화
    }
}
