package mul.camp.a.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mul.camp.a.dto.MemberDto;

@Repository	
public class MemberDaoimpl implements MemberDao {
	
	@Autowired
	SqlSession session;
	
	String ns = "Member.";

	@Override
	public int addmember(MemberDto mem) {
		int count = session.insert(ns + "addmember", mem);
		return count;
	}
}
