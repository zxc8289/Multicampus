package weview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weview.dao.ListDao;
import weview.dto.ListDto;
import weview.service.ListService;

@Service
public class ListServiceImpl implements ListService{
	
	@Autowired
	ListDao dao;

	@Override
	public List<ListDto> genrelist() {
		return dao.genrelist();
	}

	@Override
	public List<ListDto> comedylist() {
		// TODO Auto-generated method stub
		return dao.comedylist();
	}

	@Override
	public List<ListDto> romancelist() {
		// TODO Auto-generated method stub
		return dao.romancelist();
	}

	@Override
	public List<ListDto> actionlist() {
		// TODO Auto-generated method stub
		return dao.actionlist();
	}

	@Override
	public List<ListDto> SFlist() {
		// TODO Auto-generated method stub
		return dao.SFlist();
	}

	@Override
	public List<ListDto> fantasylist() {
		// TODO Auto-generated method stub
		return dao.fantasylist();
	}

	@Override
	public List<ListDto> thrillerlist() {
		// TODO Auto-generated method stub
		return dao.thrillerlist();
	}

	//장르 페이지 안 장르 DTO (ex: 코미디 영화 장르 페이지 안 코미디 영화 DB)
	
	@Override
	public List<ListDto> comedyinlist() {
		// TODO Auto-generated method stub
		return dao.comedyinlist();
	}

	@Override
	public List<ListDto> romanceinlist() {
		// TODO Auto-generated method stub
		return  dao.romanceinlist();
	}

	@Override
	public List<ListDto> actioninlist() {
		// TODO Auto-generated method stub
		return dao.actioninlist();
	}

	@Override
	public List<ListDto> scifiinlist() {
		// TODO Auto-generated method stub
		return dao.scifiinlist();
	}

	@Override
	public List<ListDto> fantasyinlist() {
		// TODO Auto-generated method stub
		return dao.fantasyinlist();
	}

	@Override
	public List<ListDto> thrillerinlist() {
		// TODO Auto-generated method stub
		return dao.thrillerinlist();
	}

}
