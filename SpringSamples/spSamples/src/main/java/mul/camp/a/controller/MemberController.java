package mul.camp.a.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;

@Controller
public class MemberController {
	private static Logger logger = LoggerFactory.getLogger(MemberController.class);

	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login() {
		logger.info("HelloController login()" + new Date());
		
		return "login";
	}
	
	@RequestMapping(value = "regi.do", method = RequestMethod.GET)
	public String regi() {
		logger.info("HelloController regi()" + new Date());
		return "regi";
	}
	
	@RequestMapping(value = "regiAF.do", method = RequestMethod.POST)
	public String regiAF(MemberDto dto) {
		logger.info("HelloController regiAF()" + new Date());
		
		boolean b = service.addmember(dto);
		if(b==true) {
			System.out.println("가입되었음");
		}
		
		return "redirect:/login.do";
	}
	
}
