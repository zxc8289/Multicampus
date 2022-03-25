package weview.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import weview.dto.ListDto;

@Repository
public class ListDaoImpl implements ListDao{
	
	@Autowired
	SqlSession session;
	
	String ns = "Genrelist.";

	@Override
	public List<ListDto> genrelist() {
		return session.selectList(ns + "genrelist");
	}

	@Override
	public List<ListDto> comedylist() {
		return session.selectList(ns + "colist");
	}

	@Override
	public List<ListDto> romancelist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "rolist");
	}

	@Override
	public List<ListDto> actionlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "alist");
	}

	@Override
	public List<ListDto> SFlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "sflist");
	}

	@Override
	public List<ListDto> fantasylist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "flist");
	}

	@Override
	public List<ListDto> thrillerlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "tlist");
	}

	@Override
	public List<ListDto> comedyinlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "coinlist");
	}

	@Override
	public List<ListDto> romanceinlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "roinlist");
	}

	@Override
	public List<ListDto> actioninlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "ainlist");
	}

	@Override
	public List<ListDto> scifiinlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "sfinlist");
	}

	@Override
	public List<ListDto> fantasyinlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "finlist");
	}

	@Override
	public List<ListDto> thrillerinlist() {
		// TODO Auto-generated method stub
		return session.selectList(ns + "tinlist");
	}

}
