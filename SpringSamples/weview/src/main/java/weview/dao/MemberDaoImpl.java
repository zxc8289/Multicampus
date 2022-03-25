package weview.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import weview.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession session;
	String ns = "Member.";

	@Override
	public int addmember(MemberDto mem) {
		int count = session.insert(ns + "addmember", mem);
		return count;
	}

	@Override
	public int getId(String id) {
		int count = session.selectOne(ns + "getId", id);
		return count;
	}

	@Override
	public MemberDto login(MemberDto mem) {		
		return session.selectOne(ns + "login", mem);
	}

	@Override
	public void update(MemberDto mem) {
		session.update(ns + "update", mem);
	}
}
