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


import pe.dido.svr.lnkdesign.dao.LnkOtrSysDao;
import pe.dido.svr.lnkdesign.model.LnkOtrSys;

/**
 * @author cclee
 *
 */
@Repository("lnkOtrSysDao")
public class LnkOtrSysDaoImpl implements LnkOtrSysDao {
	private static final Logger logger = LoggerFactory.getLogger(LnkOtrSysDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public LnkOtrSys findById(HashMap searchVo) {	
		return sqlSession.selectOne("LnkOtrSys.findById", searchVo);
	}	
		
	@Override
	public List<LnkOtrSys> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("LnkOtrSys.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("LnkOtrSys.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("LnkOtrSys.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("LnkOtrSys.insert", objList);
	}	


}
