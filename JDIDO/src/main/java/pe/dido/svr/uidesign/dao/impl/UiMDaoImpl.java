/**
 * 
 */
package pe.dido.svr.uidesign.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.uidesign.dao.UiMDao;
import pe.dido.svr.uidesign.model.UiM;

/**
 * @author cclee
 *
 */
@Repository("uiMDao")
public class UiMDaoImpl implements UiMDao {
	private static final Logger logger = LoggerFactory.getLogger(UiMDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public UiM findById(HashMap searchVo) {	
		return sqlSession.selectOne("UiM.findById", searchVo);
	}	
		
	@Override
	public List<UiM> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UiM.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UiM.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UiM.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UiM.insert", objList);
	}	

}
