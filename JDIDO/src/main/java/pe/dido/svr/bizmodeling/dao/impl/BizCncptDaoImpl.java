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

import pe.dido.svr.bizmodeling.dao.BizCncptDao;
import pe.dido.svr.bizmodeling.model.BizCncpt;


/**
 * @author cclee
 *
 */
@Repository("bizCncptDao")
public class BizCncptDaoImpl implements BizCncptDao {
	private static final Logger logger = LoggerFactory.getLogger(BizCncptDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public BizCncpt findById(HashMap searchVo) {	
		return sqlSession.selectOne("BizCncpt.findById", searchVo);
	}	
		
	@Override
	public List<BizCncpt> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("BizCncpt.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("BizCncpt.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("BizCncpt.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("BizCncpt.insert", objList);
	}	



}
