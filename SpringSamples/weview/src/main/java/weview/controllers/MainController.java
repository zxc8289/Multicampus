package weview.controllers;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import weview.dto.MainDto;
import weview.service.MainService;

@Controller
public class MainController {
	
	private static Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	MainService service;
	
	@RequestMapping(value = "mainpage.do", method = RequestMethod.GET)
	public String main(Model model)
	{
		logger.info("MainController mainPage()" + new Date());
		
		MainDto randomMovie = service.getRandomMovie();
		
		model.addAttribute("ranmov", randomMovie);
		
		List<MainDto> ObS = service.orderByScore();
		
		model.addAttribute("obs", ObS);
		
		List<MainDto> ObD = service.orderByDate();
		
		model.addAttribute("obd", ObD);
		
		List<MainDto> ObR = service.orderByRunningTime();
		
		model.addAttribute("obr", ObR);
		
		return "mainpage";
		
	}
	
	@RequestMapping(value = "search.do", method = RequestMethod.GET)
	public String search(Model model, String keyword)
	{
		List<MainDto> searchList = service.searchMovie(keyword);
		
		model.addAttribute("searchlist", searchList);
		
		return "search";
	}
	
	@RequestMapping(value = "testjsp.do", method = RequestMethod.GET)
	public String testjsp()
	{
		return "testjsp";
	}
	
}
