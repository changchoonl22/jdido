package pe.dido.svr.uidesign.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.uidesign.dao.UiAuthorMapDao;
import pe.dido.svr.uidesign.model.UiAuthorMap;

@Repository("uiAuthorMapDao")
public class UiAuthorMapDaoImpl implements UiAuthorMapDao {
	private static final Logger logger = LoggerFactory.getLogger(UiAuthorMapDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public UiAuthorMap findById(HashMap searchVo) {	
		return sqlSession.selectOne("UiAuthorMap.findById", searchVo);
	}	
		
	@Override
	public List<UiAuthorMap> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UiAuthorMap.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UiAuthorMap.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UiAuthorMap.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UiAuthorMap.insert", objList);
	}	


}
