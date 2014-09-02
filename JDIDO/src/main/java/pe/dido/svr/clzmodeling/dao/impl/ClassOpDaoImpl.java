/**
 * 
 */
package pe.dido.svr.clzmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.clzmodeling.dao.ClassOpDao;
import pe.dido.svr.clzmodeling.model.ClassOp;

/**
 * @author cclee
 *
 */
@Repository
public class ClassOpDaoImpl implements ClassOpDao {
	private static final Logger logger = LoggerFactory.getLogger(ClassOpDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public ClassOp findById(HashMap searchVo) {	
		return sqlSession.selectOne("ClassOp.findById", searchVo);
	}	
		
	@Override
	public List<ClassOp> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("ClassOp.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("ClassOp.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("ClassOp.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("ClassOp.insert", objList);
	}	
	

}
