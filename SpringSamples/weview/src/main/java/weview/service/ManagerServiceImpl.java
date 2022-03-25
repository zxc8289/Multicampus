package weview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weview.dao.ManagerDao;
import weview.dto.ManagerDto;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerDao dao;
	
	@Override
	public boolean writemana(ManagerDto dto) {
		System.out.println("Service >> " + dto.getPoster2());
		return dao.writemana(dto)>0? true:false;
	}

}
