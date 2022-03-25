package weview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weview.dao.ReqDao;
import weview.dto.ReqDto;
import weview.dto.UpdateDto;

@Service
public class ReqServiceImpl implements ReqService {

	@Autowired
	ReqDao dao;
	
	
	@Override
	public List<ReqDto> reqlist() {
		return dao.reqlist();
	}


	@Override
	public boolean writereq(ReqDto dto) {									// service에 게시글 데이터 추가
		return dao.writereq(dto)>0? true:false;
	}


	@Override
	public ReqDto getSeq(int seq) {
		return dao.getSeq(seq);
	}


	@Override
	public boolean update(ReqDto dto) {
		return dao.update(dto)>0? true:false;
	}

	
	
}
