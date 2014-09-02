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

import pe.dido.svr.compmodeling.dao.CompInnerClassOpDao;
import pe.dido.svr.compmodeling.model.CompInnerClassOp;

/**
 * @author cclee
 *
 */
@Repository("compInnerClassOpDao")
public class CompInnerClassOpDaoImpl implements CompInnerClassOpDao {
	private static final Logger logger = LoggerFactory.getLogger(CompInnerClassOpDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public CompInnerClassOp findById(HashMap searchVo) {	
		return sqlSession.selectOne("CompInnerClassOp.findById", searchVo);
	}	
		
	@Override
	public List<CompInnerClassOp> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("CompInnerClassOp.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("CompInnerClassOp.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("CompInnerClassOp.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("CompInnerClassOp.insert", objList);
	}	
	
	

}
