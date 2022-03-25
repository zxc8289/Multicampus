package weview.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import weview.dto.ManagerDto;
import weview.dto.ReqDto;
import weview.service.ManagerService;
import weview.utills.UploadFileUtils;

@Controller
public class ManagerController {

	private static Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	ManagerService service;

	@Resource(name = "uploadPath")
	private String uploadPath;

	// 요청 게시판 목록으로 이동
	@RequestMapping(value = "manawrite.do", method = RequestMethod.GET)
	public String manawrite() {
		logger.info("MemberController manawrite() " + new Date());

		return "manawrite";
	}

	@RequestMapping(value = "manawriteAf.do", method = RequestMethod.POST)
	public String manawriteAf(ManagerDto dto, MultipartFile file) throws Exception {
		logger.info("ManagerController login() " + new Date());
//		System.out.println(dto.toString());

		String imgUploadPath = uploadPath;
//		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		String fileName = null;

		if (file != null) {
			fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes());
		} else {
			fileName = uploadPath + File.separator + "none.png";
		}

		dto.setPoster(fileName);
		dto.setPoster2("s_" + fileName);
		/*
		 * dto.setPoster2( File.separator + "images" + ymdPath + File.separator + "s" +
		 * File.separator + "s_" + fileName);
		 */

		boolean a = service.writemana(dto);
		if (a == true) {
			System.out.println("성공적으로 추가하였습니다.");
		}
		
		
		return "redirect:/reqlist.do";
	}


	 
	 
	 
	 
	 
	 
	 
	 
}
