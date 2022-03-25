package weview.dao;

import java.util.List;

import weview.dto.MainDto;

public interface MainDao {

	public List<MainDto> orderByScore();

	public List<MainDto> orderByDate();

	public List<MainDto> orderByRunningTime();
	
	public MainDto getRandomMovie();
	
	public List<MainDto> searchMovie(String keyword);
}
