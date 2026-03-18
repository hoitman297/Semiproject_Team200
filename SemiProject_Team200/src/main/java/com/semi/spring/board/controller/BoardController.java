package com.semi.spring.board.controller;

import javax.servlet.ServletContext;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.semi.spring.board.model.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
//@RequestMapping("/board") lol/board , /overwatch/board, /battleground/board 구성
public class BoardController {

	private final BoardService boardService;
	private final ResourceLoader resourceLoader;
	private final ServletContext application; // application scope
	/*
	 * ResourceLoader
	 *  - 스프링에서 제공하는 자원 로딩 클래스
	 *  - classpath, file시스템, url등 다양한 경로상의 자원을 
	 *  "동일한" 인터페이스로 로드(입력)하는 메서드를 제공한다.
	 */
	
	// BoardType전역객체 설정
	// - 어플리케이션 전역에서 사용할 수 있는 BoardType 객체 추가
	// - 서버 가동중 1회만 수행되도록 설정
	
	// LOL
	@GetMapping("/lol/board")
	public String selectLolList() {
		
		
		return null;
	}
	
	// OVERWATCH
	@GetMapping("/overwatch/board")
	public String selectOverwatchList() {
		
		
		return null;
	}
	
	// BATTLEGROUND
	@GetMapping("/battleground/board")
	public String selectBattlegroundList() {
		
		
		return null;
	}
	
	
}
