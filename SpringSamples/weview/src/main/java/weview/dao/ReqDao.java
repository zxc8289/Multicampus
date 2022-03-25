package weview.dao;

import java.util.List;

import weview.dto.ReqDto;
import weview.dto.UpdateDto;

public interface ReqDao {

	List<ReqDto> reqlist();
	
	int writereq(ReqDto dto);
	
	ReqDto getSeq(int seq);
	
	int update(ReqDto dto);
	
}
