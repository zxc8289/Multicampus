package weview.service;

import java.util.List;

import weview.dto.ReqDto;
import weview.dto.UpdateDto;

public interface ReqService {
	
	List<ReqDto> reqlist();
	
	boolean writereq(ReqDto dto);
	
	ReqDto getSeq(int seq);
	
	boolean update(ReqDto dto);

}
