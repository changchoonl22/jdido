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

import pe.dido.svr.lnkdesign.dao.LnkIfPgmDao;
import pe.dido.svr.lnkdesign.model.LnkIfPgm;

/**
 * @author cclee
 *
 */
@Repository("lnkIfPgmDao")
public class LnkIfPgmDaoImpl implements LnkIfPgmDao  {
	private static final Logger logger = LoggerFactory.getLogger(LnkIfPgmDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public LnkIfPgm findById(HashMap searchVo) {	
		return sqlSession.selectOne("LnkIfPgm.findById", searchVo);
	}	
		
	@Override
	public List<LnkIfPgm> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("LnkIfPgm.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("LnkIfPgm.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("LnkIfPgm.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("LnkIfPgm.insert", objList);
	}	


}
