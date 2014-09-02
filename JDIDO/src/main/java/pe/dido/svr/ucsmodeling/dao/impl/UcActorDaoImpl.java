package pe.dido.svr.ucsmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.ucsmodeling.dao.UcActorDao;
import pe.dido.svr.ucsmodeling.model.UcActor;

@Repository("ucActorDao")
public class UcActorDaoImpl implements UcActorDao  {
	private static final Logger logger = LoggerFactory.getLogger(UcActorDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public UcActor findById(HashMap searchVo) {	
		return sqlSession.selectOne("UcActor.findById", searchVo);
	}	
		
	@Override
	public List<UcActor> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UcActor.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UcActor.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UcActor.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UcActor.insert", objList);
	}	


}
