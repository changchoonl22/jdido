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

import pe.dido.svr.reqmngt.dao.DmndMDao;
import pe.dido.svr.reqmngt.model.DmndM;

/**
 * @author cclee
 *
 */
@Repository
public class DmndMDaoImpl implements DmndMDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#deleteDmndMById(pe.dido.svr.reqmngt.model.DmndM)
	 */
	@Override
	public void deleteDmndMById(DmndM dmndM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#deleteDmndMList(java.util.List)
	 */
	@Override
	public void deleteDmndMList(List<DmndM> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#findDmndMById(int)
	 */
	@Override
	public DmndM findDmndMById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#findDmndMList(int)
	 */
	@Override
	public ArrayList<DmndM> findDmndMList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#insertDmndMById(pe.dido.svr.reqmngt.model.DmndM)
	 */
	@Override
	public void insertDmndMById(DmndM dmndM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#insertDmndMList(java.util.List)
	 */
	@Override
	public void insertDmndMList(List<DmndM> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#updateDmndMById(pe.dido.svr.reqmngt.model.DmndM)
	 */
	@Override
	public void updateDmndMById(DmndM dmndM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndMMapper#updateDmndMList(java.util.List)
	 */
	@Override
	public void updateDmndMList(List<DmndM> updateList) {
		// TODO Auto-generated method stub

	}

}
