package org.ryuuzakiumi.controller;

import java.util.List;
import java.util.Map;

import org.ryuuzakiumi.dto.MemberDTO;
import org.ryuuzakiumi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;  //만들어야 합니다.
	
	//  /member
	@GetMapping("/member")
	public String member(Model model) {
		//service가 줍니다. Model에 값을 붙입니다.
		List<MemberDTO> lists = memberService.memberList();  //만들어야 합니다.
		model.addAttribute("list", lists);
				
		return "member";  //만들어야 합니다.
		//현업에서는 이름이 다르지만(복잡한 이름) 배우는 단계라 간단히
	}
	
//	@GetMapping("/member2")
//	public String member2(Model model) {
//		List<Map<String, Object>> lists = memberService.memberList2();
//		model.addAttribute("list", lists);
//		
//		return "member";
//	}
	
	
	@GetMapping("/member2") public ModelAndView member2() { List<Map<String,
	Object>> lists = memberService.memberList2();
	
	ModelAndView mv = new ModelAndView("member"); //jsp file name
	mv.addObject("list", lists);
	
	return mv; 
	
	}
	
	
	@GetMapping("member3")
	public @ResponseBody String member3() {
		
		List<MemberDTO> lists = memberService.memberList();
		
		return lists.get(0).toString();
	}

}
