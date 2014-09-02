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

import pe.dido.svr.compmodeling.dao.CompInnerClassAttrbDao;
import pe.dido.svr.compmodeling.model.CompInnerClassAttrb;

/**
 * @author cclee
 *
 */
@Repository("compInnerClassAttrbDao")
public class CompInnerClassAttrbDaoImpl implements CompInnerClassAttrbDao  {
	private static final Logger logger = LoggerFactory.getLogger(CompInnerClassAttrbDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public CompInnerClassAttrb findById(HashMap searchVo) {	
		return sqlSession.selectOne("CompInnerClassAttrb.findById", searchVo);
	}	
		
	@Override
	public List<CompInnerClassAttrb> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("CompInnerClassAttrb.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("CompInnerClassAttrb.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("CompInnerClassAttrb.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("CompInnerClassAttrb.insert", objList);
	}	

	
	

}
