package com.semi.spring.security.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi.spring.member.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/security")
@Controller
public class SecurityController {

	// 필드방식 의존성 주입
	//@Autowired
	private MemberService mService;
	
	//@Autowired
	private BCryptPasswordEncoder passwordEncoder;
		
	// 생성자에 의해 자동 의존성 주입 방식
	// 단, 생성자가 여러개면 @Autowired어노테이션 필요
	public SecurityController(MemberService mService , BCryptPasswordEncoder passwordEncoder) {
		this.mService = mService;
		this.passwordEncoder = passwordEncoder;
	}
	
	@RequestMapping("/accessDenied")
	public String accessDenied(Model m) {
		m.addAttribute("errorMsg","접근 불가능한 페이지입니다.");
		return "common/errorPage";
	}
}
