package org.ryuuzakiumi.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.ryuuzakiumi.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *  스프링에서 객체 생성하는 방법은 
 *  @Controller
 *  @Service
 *  @Repository
 *  @Component
 * 
 */
@Controller
public class BoardController {
	//데이터 흐름
	//controller -> service -> repository -> mybatis -> DB
	
	@Autowired
	private BoardService boardService;
	
	
	//하나의 요청에 하나의 메소드 원칙
	@GetMapping({"/board", "/"})
	public String board(Model model) {
		List<Map<String, Object>> list = boardService.boardList();
		model.addAttribute("list", list);
		
		return "board";		//WEB-INF/views/board.jsp
		
	}
	
	@GetMapping("/detail")
	public String detail(HttpServletRequest request, Model model) {
		String no = request.getParameter("ni");
		Map<String, Object> detail = boardService.detail(no); //나중에 정수로 변경할 예정
		model.addAttribute("detail", detail);
		//System.out.println(detail);
		return "detail";
	}
}
