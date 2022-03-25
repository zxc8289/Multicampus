package mul.camp.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;

@RestController
public class HelloController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/base")
	public String base() {
		System.out.println("HelloController");
		return "base";
	}
	
	@RequestMapping(value = "/dbtest")
	public List<MemberDto> dbTest(){
		System.out.println("HelloController dbTest()");
	
		List<MemberDto> list = service.allMember();
		
		return list;
	}
	
	@RequestMapping(value = "/AddMember")
	public List<MemberDto> AddMember(){
		
		System.out.println("HelloController AddMember()");
		List<MemberDto> list = service.addMember();
		
		return list;
	}
}
