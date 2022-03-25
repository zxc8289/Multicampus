package mul.camp.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.service.BbsService;

@RestController
public class BbsController {

	@Autowired
	BbsService service;
	
	@RequestMapping(value = "/getBbsList", method = {RequestMethod.GET, RequestMethod.POST} )
	public List<BbsDto> getBbsList(){
		System.out.println("BbsController getBbsList " + new Date());
		
		List<BbsDto> list = service.getBbsList();
		return list;
	}
	
	@RequestMapping(value = "/bbswrite", method = {RequestMethod.GET, RequestMethod.POST} )
	public String bbswrite(BbsDto dto) {
		System.out.println("BbsController bbswrite " + new Date());
		
		boolean b = service.writeBbs(dto);
		if(b) {
			return "YES";
		}
		return "NO";
	}
	
}







