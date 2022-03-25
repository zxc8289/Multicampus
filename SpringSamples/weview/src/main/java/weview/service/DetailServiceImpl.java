package weview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weview.dao.DetailDao;
import weview.dto.DetailDto;

@Service
public class DetailServiceImpl implements DetailService{

	@Autowired
	DetailDao dao;

	@Override
	public DetailDto getMovieDetail(int seq_movie) {
		return dao.getMovieDetail(seq_movie);
	}
	
	
}
