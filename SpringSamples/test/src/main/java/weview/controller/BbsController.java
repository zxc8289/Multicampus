package weview.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import weview.dto.MemberDto;

@Controller
public class BbsController {
	private static Logger logger = LoggerFactory.getLogger(BbsController.class);
	

	@RequestMapping(value = "bbslist.do", method = RequestMethod.GET)
	public String bbslist() {
		
		return "bbslist";
		
	}
	

}
