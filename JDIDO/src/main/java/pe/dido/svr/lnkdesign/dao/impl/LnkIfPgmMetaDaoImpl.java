/**
 * 
 */
package pe.dido.svr.lnkdesign.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.lnkdesign.dao.LnkIfPgmMetaDao;
import pe.dido.svr.lnkdesign.model.LnkIfPgmMeta;

/**
 * @author cclee
 *
 */
@Repository("lnkIfPgmMetaDao")
public class LnkIfPgmMetaDaoImpl implements LnkIfPgmMetaDao  {
	private static final Logger logger = LoggerFactory.getLogger(LnkIfPgmMetaDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public LnkIfPgmMeta findById(HashMap searchVo) {	
		return sqlSession.selectOne("LnkIfPgmMeta.findById", searchVo);
	}	
		
	@Override
	public List<LnkIfPgmMeta> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("LnkIfPgmMeta.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("LnkIfPgmMeta.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("LnkIfPgmMeta.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("LnkIfPgmMeta.insert", objList);
	}	
	
	

}
