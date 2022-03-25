package weview.dao;

import weview.dto.MemberDto;

public interface MemberDao {
	int addmember(MemberDto mem);

	int getId(String id);

	MemberDto login(MemberDto mem);

	void update(MemberDto mem);
}
