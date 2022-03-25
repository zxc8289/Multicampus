package weview.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import weview.dao.MainDao;
import weview.dto.MainDto;

@Repository
public class MainServiceImpl implements MainService {
	
	@Autowired
	MainDao dao;

	@Override
	public List<MainDto> orderByScore() {
		return dao.orderByScore();
	}

	@Override
	public List<MainDto> orderByDate() {
		return dao.orderByDate();
	}

	@Override
	public List<MainDto> orderByRunningTime() {
		return dao.orderByRunningTime();
	}

	@Override
	public MainDto getRandomMovie() {
		return dao.getRandomMovie();
	}

	@Override
	public List<MainDto> searchMovie(String keyword) {
		return dao.searchMovie(keyword);
	}

}
