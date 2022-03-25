package weview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weview.dao.MemberDao;
import weview.dto.MemberDto;

@Service
public class MemberServiceimpl implements MemberService {

	@Autowired
	MemberDao dao;

	@Override
	public boolean addmember(MemberDto mem) {

		int count = dao.addmember(mem);
		return count > 0 ? true : false;
	}

	@Override
	public int getId(String id) {
		return dao.getId(id);
	}

	@Override
	public MemberDto login(MemberDto mem) {
		return dao.login(mem);
	}

	@Override
	public void update(MemberDto mem) {
		dao.update(mem);
	}

}
