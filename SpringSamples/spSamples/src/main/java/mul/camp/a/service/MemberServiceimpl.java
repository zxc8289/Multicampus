package mul.camp.a.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.camp.a.dao.MemberDao;
import mul.camp.a.dto.MemberDto;

@Service
public class MemberServiceimpl implements MemberService {
	@Autowired
	MemberDao dao;

	@Override
	public boolean addmember(MemberDto mem) {
		
		int count = dao.addmember(mem);
		
		return count>0 ? true:false;	// 삼항연산자 카운트의 값이 0보다클경우 true 작을때는 false
	}
}
