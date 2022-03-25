package mul.camp.a.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;



@RestController   // @Controller + @ResponsBody -> Restful
public class HelloController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/base", method = RequestMethod.GET)
	public String base() {
		System.out.println("HelloContoller base()");
		return "base";
	}
	
	@RequestMapping(value = "/connParamGet")
	public String connParamGet(String title) {
		System.out.println("HelloContoller connParamGet()");
		System.out.println("title:" + title);
		return "통신성공";
	}
	
	@RequestMapping(value = "/getMember", method = RequestMethod.POST)
	public MemberDto getMember(MemberDto mem) { // @RequestBody 잊지말고 넣기, 리액트네이티브할때는 빼주기
		System.out.println("HelloContoller getMember()");
		System.out.println(mem.toString());
		
		MemberDto dto = new MemberDto("abc", "123", "AAA", "aa@naver.com", 1);
		
		return dto;
		
		
	}
	
	@RequestMapping(value = "/getMemberList")
	public ArrayList<MemberDto> getMemberList(MemberDto dto){
		System.out.println("HelloController getMemberList()");
		System.out.println(dto.toString());
		
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		list.add(new MemberDto("abc", "123", "AAA", "aa@naver.com", 1));
		list.add(new MemberDto("abb", "1323", "AAA", "aa@naver.com", 3));
		list.add(new MemberDto("a2bc", "123", "AAA", "aa@naver.com", 4));
		return list;
	}
	
	@RequestMapping(value = "/dbTest", method = RequestMethod.GET)
	public List<MemberDto> dbTest(MemberDto dto){
		System.out.println("HelloController dbTest()");
		
		List<MemberDto> list = service.allMember();
		
		return list;
	}
	
	@RequestMapping(value = "/allMember", method = RequestMethod.GET)
	public List<MemberDto> allMember(){
		System.out.println("HelloController allMember()");
		
		List<MemberDto> list = service.allMember();
		
		return list;
	}
	
}
