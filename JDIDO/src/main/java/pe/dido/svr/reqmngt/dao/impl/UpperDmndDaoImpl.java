/**
 * 
 */
package pe.dido.svr.reqmngt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.reqmngt.dao.UpperDmndDao;
import pe.dido.svr.reqmngt.model.UpperDmnd;

/**
 * @author cclee
 *
 */
@Repository
public class UpperDmndDaoImpl implements UpperDmndDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#deleteUpperDmndById(pe.dido.svr.reqmngt.model.UpperDmnd)
	 */
	@Override
	public void deleteUpperDmndById(UpperDmnd upperDmnd) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#deleteUpperDmndList(java.util.List)
	 */
	@Override
	public void deleteUpperDmndList(List<UpperDmnd> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#findUpperDmndById(int)
	 */
	@Override
	public UpperDmnd findUpperDmndById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#findUpperDmndList(int)
	 */
	@Override
	public ArrayList<UpperDmnd> findUpperDmndList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#insertUpperDmndById(pe.dido.svr.reqmngt.model.UpperDmnd)
	 */
	@Override
	public void insertUpperDmndById(UpperDmnd upperDmnd) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#insertUpperDmndList(java.util.List)
	 */
	@Override
	public void insertUpperDmndList(List<UpperDmnd> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#updateUpperDmndById(pe.dido.svr.reqmngt.model.UpperDmnd)
	 */
	@Override
	public void updateUpperDmndById(UpperDmnd upperDmnd) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndMapper#updateUpperDmndList(java.util.List)
	 */
	@Override
	public void updateUpperDmndList(List<UpperDmnd> updateList) {
		// TODO Auto-generated method stub

	}

}
