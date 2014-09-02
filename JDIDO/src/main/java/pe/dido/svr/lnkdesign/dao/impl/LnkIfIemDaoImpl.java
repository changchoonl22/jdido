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

import pe.dido.svr.lnkdesign.dao.LnkIfIemDao;
import pe.dido.svr.lnkdesign.model.LnkIfIem;

/**
 * @author cclee
 *
 */
@Repository("lnkIfIemDao")
public class LnkIfIemDaoImpl implements LnkIfIemDao {
	private static final Logger logger = LoggerFactory.getLogger(LnkIfIemDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public LnkIfIem findById(HashMap searchVo) {	
		return sqlSession.selectOne("LnkIfIem.findById", searchVo);
	}	
		
	@Override
	public List<LnkIfIem> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("LnkIfIem.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("LnkIfIem.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("LnkIfIem.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("LnkIfIem.insert", objList);
	}	

}
