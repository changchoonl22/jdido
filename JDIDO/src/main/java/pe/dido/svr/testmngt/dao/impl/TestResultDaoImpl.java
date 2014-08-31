/**
 * 
 */
package pe.dido.svr.testmngt.dao.impl;

import java.util.ArrayList;
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
@Repository
public class TestResultDaoImpl implements TestResultDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#deleteTestResultById(pe.dido.svr.testmngt.model.TestResult)
	 */
	@Override
	public void deleteTestResultById(TestResult testResult) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#deleteTestResultList(java.util.List)
	 */
	@Override
	public void deleteTestResultList(List<TestResult> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#findTestResultById(int)
	 */
	@Override
	public TestResult findTestResultById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#findTestResultList(int)
	 */
	@Override
	public ArrayList<TestResult> findTestResultList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#insertTestResultById(pe.dido.svr.testmngt.model.TestResult)
	 */
	@Override
	public void insertTestResultById(TestResult testResult) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#insertTestResultList(java.util.List)
	 */
	@Override
	public void insertTestResultList(List<TestResult> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#updateTestResultById(pe.dido.svr.testmngt.model.TestResult)
	 */
	@Override
	public void updateTestResultById(TestResult testResult) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestResultMapper#updateTestResultList(java.util.List)
	 */
	@Override
	public void updateTestResultList(List<TestResult> updateList) {
		// TODO Auto-generated method stub

	}

}
