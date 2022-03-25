package weview.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import weview.dto.ListDto;
import weview.dto.ListParam;
import weview.service.ListService;


@Controller
public class ListController {
	
	private static Logger logger = LoggerFactory.getLogger(ListController.class);
	
	@Autowired
	ListService service;
	
	
	//전체장르
	@RequestMapping(value = "genrelist.do", method = RequestMethod.GET)
	public String genrelist(Model model){
		logger.info("genrelist()" + new Date());
		
		
		//코미디
		 List<ListDto> colist = service.comedylist();
		 model.addAttribute("colist", colist);
		 
		//로맨스
		 List<ListDto> rolist = service.romancelist();
		 model.addAttribute("rolist", rolist);
		
		//액션
		 List<ListDto> alist = service.actionlist();
		 model.addAttribute("alist", alist);
		
		 //sf
		 List<ListDto> sflist = service.SFlist();
		 model.addAttribute("sflist", sflist);
		 
		 //판타지
		 List<ListDto> flist = service.fantasylist();
		 model.addAttribute("flist", flist);
		 
		 //스릴러
		 List<ListDto> tlist = service.thrillerlist();
		 model.addAttribute("tlist", tlist);
 
		
		return "genrelist";
		
	}
	
	
	//코미디 페이지
	@RequestMapping(value = "comedy.do", method = RequestMethod.GET)
	public String comedy(Model model)
	{
		logger.info("comedy()" + new Date());
		
		//코미디 페이지 안 코미디 영화 리스트
		List<ListDto> coinlist = service.comedyinlist();
		 model.addAttribute("coinlist", coinlist);
		
		return "comedy";
		
	}
	
	
	//로맨스 페이지
	@RequestMapping(value = "romance.do", method = RequestMethod.GET)
	public String romance(Model model)
	{
		logger.info("romance()" + new Date());
		
		//로맨스 페이지 안 로맨스 영화 리스트
		List<ListDto> roinlist = service.romanceinlist();
		 model.addAttribute("roinlist", roinlist);
		
		return "romance";
		
	}
	
	//액션 페이지
	@RequestMapping(value = "action.do", method = RequestMethod.GET)
	public String action(Model model)
	{
		logger.info("action()" + new Date());
		
		//액션 페이지 안 액션 영화 리스트
		List<ListDto> ainlist = service.actioninlist();
		model.addAttribute("ainlist", ainlist);
		
		return "action";
		
	}
	
	//sf 페이지
	@RequestMapping(value = "sf.do", method = RequestMethod.GET)
	public String SF(Model model)
	{
		logger.info("sf()" + new Date());
		
		//sf 페이지 안 액션 영화 리스트
				List<ListDto> sfinlist = service.scifiinlist();
				model.addAttribute("sfinlist", sfinlist);
		
		
		return "sf";
		
	}
	
	//판타지 페이지
	@RequestMapping(value = "fantasy.do", method = RequestMethod.GET)
	public String fantasy(Model model)
	{
		logger.info("fantasy()" + new Date());
		
		//판타지 페이지 안 판타지 영화 리스트
		List<ListDto> finlist = service.fantasyinlist();
		model.addAttribute("finlist", finlist);

		
		return "fantasy";
		
	}
	
	//스릴러 페이지
	@RequestMapping(value = "thriller.do", method = RequestMethod.GET)
	public String thriller(Model model)
	{
		logger.info("thriller()" + new Date());
		
		//판타지 페이지 안 판타지 영화 리스트
		List<ListDto> tinlist = service.thrillerinlist();
		model.addAttribute("tinlist", tinlist);

		
		return "thriller";
		
	}
}
