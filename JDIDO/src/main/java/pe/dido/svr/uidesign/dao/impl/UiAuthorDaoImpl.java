package pe.dido.svr.uidesign.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.uidesign.dao.UiAuthorDao;
import pe.dido.svr.uidesign.model.UiAuthor;

@Repository("uiAuthorDao")
public class UiAuthorDaoImpl implements UiAuthorDao {
	private static final Logger logger = LoggerFactory.getLogger(UiAuthorDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public UiAuthor findById(HashMap searchVo) {	
		return sqlSession.selectOne("UiAuthor.findById", searchVo);
	}	
		
	@Override
	public List<UiAuthor> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UiAuthor.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UiAuthor.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UiAuthor.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UiAuthor.insert", objList);
	}	

}
