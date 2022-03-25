package weview.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import weview.dto.DetailDto;
import weview.service.DetailService;

@Controller
public class DetailController {
	@Autowired
	DetailService service;

	
	@RequestMapping(value = "detailpage.do")
	public String detailpage(Model model, int seq_movie)
	{
		
		DetailDto dto = service.getMovieDetail(seq_movie);
		model.addAttribute("detail", dto);

		return "detailpage";
	}


}
