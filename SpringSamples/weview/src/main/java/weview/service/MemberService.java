package weview.service;


import weview.dto.MemberDto;

public interface MemberService {
	
	boolean addmember(MemberDto mem);	
	
	int getId(String id);
	
	MemberDto login(MemberDto mem);
	
	void update(MemberDto mem);
}
