package weview.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import weview.controllers.ReqController;
import weview.dto.ReqDto;
import weview.dto.UpdateDto;
import weview.service.ReqService;

@Controller
public class ReqController {
	
	private static Logger logger = LoggerFactory.getLogger(ReqController.class);

	@Autowired
	ReqService service;
	
	
	// 요청 게시판 목록으로 이동
	@RequestMapping(value="reqlist.do", method = RequestMethod.GET )
	public String reqlist(Model model) {
		logger.info("ReqController reqlist() " + new Date());
		
		List<ReqDto> list = service.reqlist();
		model.addAttribute("reqlist", list);
		
		return "reqlist"; 				
	}

	
	// 요청 작성 페이지로 이동
	@RequestMapping(value="reqwrite.do", method = RequestMethod.GET )
	public String reqwrite() {
		logger.info("ReqController reqwrite() " + new Date());
		
		return "reqwrite"; 				
	}
	
	
	// 요청 작성 후 게시판 목록으로 이동
	@RequestMapping(value="reqwriteAf.do", method = RequestMethod.POST )			
	public String reqwriteAf(ReqDto dto) {
		logger.info("ReqController reqwriteAf() " + new Date());															

		service.writereq(dto);
		
		return "redirect:/reqlist.do"; 				
	}
	
	
	// 요청 글 보기
	@RequestMapping(value="reqdetail.do", method = RequestMethod.GET)
	public String reqdetail(Model model, int seq_request) {
		logger.info("ReqController reqdetail() " + new Date());
		
		ReqDto req = service.getSeq(seq_request); 
		
		model.addAttribute("req", req);
	
		return "reqdetail"; 				
	}
	
	
	// 요청 글 > 게시판 목록
	@RequestMapping(value="reqdetailAf.do", method = RequestMethod.GET )			
	public String reqdetailAf() {
		logger.info("ReqController reqdetailAf() " + new Date());
														

		return "redirect:/reqlist.do"; 				
	}	
	
	// 로그인 없이 작성페이지 이동시 로그인 페이지로 이동
	@RequestMapping(value="loginer.do", method = RequestMethod.GET) 
	public String loginer(HttpServletResponse response, HttpServletRequest request) throws IOException { logger.info("ReqController loginer() " + new Date());
	  
	  request.setCharacterEncoding("UTF-8");
	  
		/* alert문구 한글 표시 방법 */
	  //PrintWriter out = response.getWriter(); out.println("<script charset=\"utf-8\">alert('login please');</script>");
	  //out.println("<script>location.href='login.do';</script>");
	  
	  	return "message";
	  
	 }
	 
	
	// 수정 페이지로 이동
	@RequestMapping(value="reqmodify.do", method = RequestMethod.GET )
	public String reqmodify(Model model, int seq_request) {
		logger.info("ReqController reqmodify() " + new Date());
		
		ReqDto req = service.getSeq(seq_request); 
		
		model.addAttribute("req", req);			
		
		return "reqmodify"; 				
	}
	  
		
	// 	수정 완료 후 요청 게시판 목록으로 이동
	@RequestMapping(value="reqmodifyAf.do", method = RequestMethod.GET )			
	public String reqmodifyAf(ReqDto dto) {
		logger.info("ReqController reqmodifyAf() " + new Date());
		
		service.update(dto);
		
		return "redirect:/reqlist.do"; 				
	}	
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
