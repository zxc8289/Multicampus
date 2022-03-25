package weview.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import weview.dto.ReqDto;
import weview.dto.UpdateDto;

@Repository
public class ReqDaoImpl implements ReqDao {

	@Autowired
	SqlSession session;
	
	String ns = "Req.";											// Req.이 뭘 의미 하나요?
	
	@Override
	public List<ReqDto> reqlist() {		
		return session.selectList(ns + "reqlist"); 		// ns + "reqlist" == Req.reqlist
	}

	@Override
	public int writereq(ReqDto dto) {
		return session.insert(ns + "writereq", dto);
	}

	@Override
	public ReqDto getSeq(int seq) {		
		return session.selectOne(ns + "getSeq", seq);
	}

	@Override
	public int update(ReqDto dto) {
		return session.update(ns + "update", dto);
	}

}
