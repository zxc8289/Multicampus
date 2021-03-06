package weview.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import weview.dto.MemberDto;
import weview.service.MemberService;

@Controller
public class MemberController {

	private static Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MemberService service;

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login() {
		logger.info("MemberController login() " + new Date());
		return "login";

	}

	// 회원가입 페이지 이동
	@RequestMapping(value = "regi.do", method = RequestMethod.GET)
	public String regi() {
		logger.info("MemberController regi() " + new Date());
		return "regi";
	}

	// 회원가입
	@RequestMapping(value = "regiAf.do", method = RequestMethod.POST)
	public String regiAf(MemberDto dto) {
		logger.info("MemberController regiAf() " + new Date());

		boolean b = service.addmember(dto);
		if (b == true) {
			System.out.println("가입되었음");
		}

		// return "login"; // login.jsp
		// return "login.do"; // login.do.jsp

		return "redirect:/login.do";
	}

	@ResponseBody
	@RequestMapping(value = "idcheck.do", method = RequestMethod.POST)
	public String idcheck(String id) {
		logger.info("MemberController idcheck() " + new Date());
		System.out.println("id:" + id);

		int count = service.getId(id);
		System.out.println("count:" + count);
		if (count > 0) { // 아이디가 있음
			return "NO";
		} else { // 아이디가 없음
			return "YES";
		}
	}

	@RequestMapping(value = "loginAf.do", method = RequestMethod.POST)
	public String loginAf(MemberDto dto, HttpServletRequest req) {
		logger.info("MemberController loginAf() " + new Date());

		MemberDto mem = service.login(dto);

		if (mem != null) {
			req.getSession().setAttribute("login", mem);
			return "redirect:/bbslist.do";
		} else {

			return "redirect:/login.do";
		}
	}
}
