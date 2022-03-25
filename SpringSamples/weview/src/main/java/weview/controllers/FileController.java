package weview.controllers;

import java.io.File;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/file")
public class FileController {
    
    @Resource(name="uploadPath")
    String uploadPath;
    
    @RequestMapping(value="/upload", method=RequestMethod.GET)
    public String fileupload() {
        return "post/test_file.basic";
    }
    
    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public ModelAndView uploadForm(MultipartFile file, ModelAndView mv) {
 
        String fileName = file.getOriginalFilename();
        File target = new File(uploadPath, fileName);
        
        //경로 생성
        if ( ! new File(uploadPath).exists()) {
            new File(uploadPath).mkdirs();
        }
        //파일 복사
        try {
            FileCopyUtils.copy(file.getBytes(), target);
            mv.addObject("file", file);
        } catch(Exception e) {
            e.printStackTrace();
            mv.addObject("file", "error");
        }
        //View 위치 설정
        mv.setViewName("post/test_upload.basic");
        return mv;
    }
}