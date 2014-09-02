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

import pe.dido.svr.bizmodeling.dao.BizProcsDao;
import pe.dido.svr.bizmodeling.model.BizProcs;


/**
 * @author cclee
 *
 */
@Repository("bizProcsDao")
public class BizProcsDaoImpl implements BizProcsDao {
	private static final Logger logger = LoggerFactory.getLogger(BizProcsDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public BizProcs findById(HashMap searchVo) {	
		return sqlSession.selectOne("BizProcs.findById", searchVo);
	}	
		
	@Override
	public List<BizProcs> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("BizProcs.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("BizProcs.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("BizProcs.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("BizProcs.insert", objList);
	}	

	
}
