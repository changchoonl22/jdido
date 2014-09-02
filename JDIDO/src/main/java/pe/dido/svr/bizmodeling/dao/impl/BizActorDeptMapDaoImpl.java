/**
 * 
 */
package pe.dido.svr.bizmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.bizmodeling.dao.BizActorDeptMapDao;
import pe.dido.svr.bizmodeling.model.BizActorDeptMap;


/**
 * @author cclee
 *
 */
@Repository("bizActorDeptMapDao")
public class BizActorDeptMapDaoImpl implements BizActorDeptMapDao {
	private static final Logger logger = LoggerFactory.getLogger(BizActorDeptMapDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public BizActorDeptMap findById(HashMap searchVo) {	
		return sqlSession.selectOne("BizActorDeptMap.findById", searchVo);
	}	
		
	@Override
	public List<BizActorDeptMap> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("BizActorDeptMap.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("BizActorDeptMap.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("BizActorDeptMap.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("BizActorDeptMap.insert", objList);
	}	


}
