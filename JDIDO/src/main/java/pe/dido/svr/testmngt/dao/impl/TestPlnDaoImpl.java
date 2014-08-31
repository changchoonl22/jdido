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

import pe.dido.svr.testmngt.dao.TestPlnDao;
import pe.dido.svr.testmngt.model.TestPln;

/**
 * @author cclee
 *
 */
@Repository
public class TestPlnDaoImpl implements TestPlnDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#deleteTestPlnById(pe.dido.svr.testmngt.model.TestPln)
	 */
	@Override
	public void deleteTestPlnById(TestPln testPln) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#deleteTestPlnList(java.util.List)
	 */
	@Override
	public void deleteTestPlnList(List<TestPln> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#findTestPlnById(int)
	 */
	@Override
	public TestPln findTestPlnById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#findTestPlnList(int)
	 */
	@Override
	public ArrayList<TestPln> findTestPlnList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#insertTestPlnById(pe.dido.svr.testmngt.model.TestPln)
	 */
	@Override
	public void insertTestPlnById(TestPln testPln) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#insertTestPlnList(java.util.List)
	 */
	@Override
	public void insertTestPlnList(List<TestPln> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#updateTestPlnById(pe.dido.svr.testmngt.model.TestPln)
	 */
	@Override
	public void updateTestPlnById(TestPln testPln) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.testmngt.persistence.TestPlnMapper#updateTestPlnList(java.util.List)
	 */
	@Override
	public void updateTestPlnList(List<TestPln> updateList) {
		// TODO Auto-generated method stub

	}

}
