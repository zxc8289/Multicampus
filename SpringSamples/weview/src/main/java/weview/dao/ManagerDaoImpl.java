package weview.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import weview.dto.ManagerDto;

@Repository
public class ManagerDaoImpl implements ManagerDao {

	@Autowired
	SqlSession session;
	
	String ns = "Mana.";
	
	@Override
	public int writemana(ManagerDto dto) {
		int a = session.insert(ns + "writemana", dto);
		
		return a;
	}

}
