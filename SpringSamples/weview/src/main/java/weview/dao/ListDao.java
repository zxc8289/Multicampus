package weview.dao;

import java.util.List;

import weview.dto.ListDto;


public interface ListDao {
	
	List<ListDto> genrelist();
	
	List<ListDto> comedylist();
	
	List<ListDto> romancelist();
	
	List<ListDto> actionlist();
	
	List<ListDto> SFlist();
	
	List<ListDto> fantasylist();
	
	List<ListDto> thrillerlist();

	List<ListDto> comedyinlist();

	List<ListDto> romanceinlist();

	List<ListDto> actioninlist();

	List<ListDto> scifiinlist();

	List<ListDto> fantasyinlist();

	List<ListDto> thrillerinlist();
	

}
