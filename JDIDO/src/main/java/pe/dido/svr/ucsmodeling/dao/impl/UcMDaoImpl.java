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

import pe.dido.svr.ucsmodeling.dao.UcMDao;
import pe.dido.svr.ucsmodeling.model.UcM;

/**
 * @author cclee
 *
 */
@Repository("ucMDao")
public class UcMDaoImpl implements UcMDao  {
	private static final Logger logger = LoggerFactory.getLogger(UcMDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public UcM findById(HashMap searchVo) {	
		return sqlSession.selectOne("UcM.findById", searchVo);
	}	
		
	@Override
	public List<UcM> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UcM.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UcM.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UcM.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UcM.insert", objList);
	}	

}
