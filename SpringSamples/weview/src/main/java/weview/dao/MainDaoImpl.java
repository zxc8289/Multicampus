package weview.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import weview.dto.MainDto;

@Repository
public class MainDaoImpl implements MainDao {

	@Autowired
	SqlSession session;
	
	String ns = "OrderTable.";
	String ns2 = "Banner.";
	String ns3 = "Search.";

	@Override
	public List<MainDto> orderByScore() {
		
		List<MainDto> dto = session.selectList(ns + "orderByScore");
		
		return dto;
	}

	@Override
	public List<MainDto> orderByDate() {
		
		List<MainDto> dto = session.selectList(ns + "orderByDate");
		
		return dto;
	}

	@Override
	public List<MainDto> orderByRunningTime() {
		
		List<MainDto> dto = session.selectList(ns + "orderByRunningTime");
		
		return dto;
	}

	@Override
	public MainDto getRandomMovie() {
		
		MainDto dto = session.selectOne(ns2 + "randomMovie");
		
		return dto;
	}

	@Override
	public List<MainDto> searchMovie(String keyword) {
		
		List<MainDto> dto = session.selectList(ns3 + "searchMovie", keyword);
		
		return dto;
	}

}
