package weview.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weview.dto.DetailDto;

@Service
public class DetailDaoImpl  implements DetailDao{

	@Autowired
	SqlSession session;

	String ns = "Detail.";

	
	@Override
	public DetailDto getMovieDetail(int seq_movie) {
		// TODO Auto-generated method stub
		return session.selectOne(ns + "getDetailMovie", seq_movie);
	}

}
