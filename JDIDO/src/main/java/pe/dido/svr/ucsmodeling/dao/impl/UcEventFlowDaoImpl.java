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

import pe.dido.svr.ucsmodeling.dao.UcEventFlowDao;
import pe.dido.svr.ucsmodeling.model.UcEventFlow;

/**
 * @author cclee
 *
 */
@Repository("ucEventFlowDao")
public class UcEventFlowDaoImpl implements UcEventFlowDao {
	private static final Logger logger = LoggerFactory.getLogger(UcEventFlowDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public UcEventFlow findById(HashMap searchVo) {	
		return sqlSession.selectOne("UcEventFlow.findById", searchVo);
	}	
		
	@Override
	public List<UcEventFlow> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UcEventFlow.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UcEventFlow.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UcEventFlow.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UcEventFlow.insert", objList);
	}	
	

}
