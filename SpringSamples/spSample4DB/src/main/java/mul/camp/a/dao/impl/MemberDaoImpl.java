package mul.camp.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mul.camp.a.dao.MemberDao;
import mul.camp.a.dto.MemberDto;

@Repository		// 저장소
public class MemberDaoImpl implements MemberDao{
	
	@Autowired // <- 객체 자동생성
	SqlSession sqlSession;
	
	String namespace = "Member.";			// namespace
	
	@Override
	public List<MemberDto> allmember() {
		List<MemberDto> list = sqlSession.selectList(namespace + "allmember");
		return list;
	}

	@Override
	public MemberDto getmember(MemberDto dto) {
		
		MemberDto mem = sqlSession.selectOne(namespace + "getmember", dto);
		return mem;
	}
}
