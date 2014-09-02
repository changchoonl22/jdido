/**
 * 
 */
package pe.dido.svr.ucsmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.ucsmodeling.dao.UcActorMapDao;
import pe.dido.svr.ucsmodeling.model.UcActorMap;

/**
 * @author cclee
 *
 */
@Repository("ucActorMapDao")
public class UcActorMapDaoImpl implements UcActorMapDao {
	private static final Logger logger = LoggerFactory.getLogger(UcActorMapDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	
	@Override
	public UcActorMap findById(HashMap searchVo) {	
		return sqlSession.selectOne("UcActorMap.findById", searchVo);
	}	
		
	@Override
	public List<UcActorMap> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UcActorMap.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UcActorMap.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UcActorMap.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UcActorMap.insert", objList);
	}	


}
