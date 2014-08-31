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

import pe.dido.svr.reqmngt.dao.UpperDmndDmndMapDao;
import pe.dido.svr.reqmngt.model.UpperDmnd;

/**
 * @author cclee
 *
 */
@Repository
public class UpperDmndDmndDaoImpl implements UpperDmndDmndMapDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#deleteUpperDmndById(pe.dido.svr.reqmngt.model.UpperDmnd)
	 */
	@Override
	public void deleteUpperDmndById(UpperDmnd upperDmnd) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#deleteUpperDmndList(java.util.List)
	 */
	@Override
	public void deleteUpperDmndList(List<UpperDmnd> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#findUpperDmndById(int)
	 */
	@Override
	public UpperDmnd findUpperDmndById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#findUpperDmndList(int)
	 */
	@Override
	public ArrayList<UpperDmnd> findUpperDmndList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#insertUpperDmndById(pe.dido.svr.reqmngt.model.UpperDmnd)
	 */
	@Override
	public void insertUpperDmndById(UpperDmnd upperDmnd) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#insertUpperDmndList(java.util.List)
	 */
	@Override
	public void insertUpperDmndList(List<UpperDmnd> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#updateUpperDmndById(pe.dido.svr.reqmngt.model.UpperDmnd)
	 */
	@Override
	public void updateUpperDmndById(UpperDmnd upperDmnd) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.UpperDmndDmndMapMapper#updateUpperDmndList(java.util.List)
	 */
	@Override
	public void updateUpperDmndList(List<UpperDmnd> updateList) {
		// TODO Auto-generated method stub

	}

}
