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

import pe.dido.svr.lnkdesign.dao.LnkSysNodeDao;
import pe.dido.svr.lnkdesign.model.LnkSysNode;

/**
 * @author cclee
 *
 */
@Repository("lnkSysNodeDao")
public class LnkSysNodeDaoImpl implements LnkSysNodeDao {
	private static final Logger logger = LoggerFactory.getLogger(LnkSysNodeDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public LnkSysNode findById(HashMap searchVo) {	
		return sqlSession.selectOne("LnkSysNode.findById", searchVo);
	}	
		
	@Override
	public List<LnkSysNode> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("LnkSysNode.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("LnkSysNode.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("LnkSysNode.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("LnkSysNode.insert", objList);
	}	


}
