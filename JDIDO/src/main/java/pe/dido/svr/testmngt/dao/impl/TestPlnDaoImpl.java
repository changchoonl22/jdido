/**
 * 
 */
package pe.dido.svr.testmngt.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.testmngt.dao.TestPlnDao;
import pe.dido.svr.testmngt.model.TestPln;

/**
 * @author cclee
 *
 */
@Repository("testPlnDao")
public class TestPlnDaoImpl implements TestPlnDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public TestPln findById(HashMap searchVo) {	
		return sqlSession.selectOne("TestPln.findById", searchVo);
	}	
		
	@Override
	public List<TestPln> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("TestPln.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("TestPln.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("TestPln.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("TestPln.insert", objList);
	}	

}
