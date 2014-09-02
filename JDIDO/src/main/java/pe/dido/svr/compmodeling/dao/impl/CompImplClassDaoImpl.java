/**
 * 
 */
package pe.dido.svr.compmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.compmodeling.dao.CompImplClassDao;
import pe.dido.svr.compmodeling.model.CompImplClass;

/**
 * @author cclee
 *
 */
@Repository("compImplClassDao")
public class CompImplClassDaoImpl implements CompImplClassDao  {
	private static final Logger logger = LoggerFactory.getLogger(CompImplClassDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public CompImplClass findById(HashMap searchVo) {	
		return sqlSession.selectOne("CompImplClass.findById", searchVo);
	}	
		
	@Override
	public List<CompImplClass> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("CompImplClass.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("CompImplClass.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("CompImplClass.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("CompImplClass.insert", objList);
	}	

	
}
