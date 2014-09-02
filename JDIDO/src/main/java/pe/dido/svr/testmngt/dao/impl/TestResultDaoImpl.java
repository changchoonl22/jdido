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

import pe.dido.svr.testmngt.dao.TestResultDao;
import pe.dido.svr.testmngt.model.TestResult;

/**
 * @author cclee
 *
 */
@Repository("testResultDao")
public class TestResultDaoImpl implements TestResultDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public TestResult findById(HashMap searchVo) {	
		return sqlSession.selectOne("TestResult.findById", searchVo);
	}	
		
	@Override
	public List<TestResult> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("TestResult.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("TestResult.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("TestResult.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("TestResult.insert", objList);
	}	


}
