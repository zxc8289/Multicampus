package mul.camp.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.camp.a.dao.BbsDao;
import mul.camp.a.dto.BbsDto;

@Service
@Transactional
public class BbsService {

	@Autowired
	BbsDao dao;
	
	public List<BbsDto> getBbsList() {
		return dao.getBbsList();
	}
	
	public boolean writeBbs(BbsDto dto) {
		int n = dao.writeBbs(dto);
		return n>0?true:false;
	}
}













