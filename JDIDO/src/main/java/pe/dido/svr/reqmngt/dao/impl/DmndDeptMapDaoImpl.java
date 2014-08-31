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

import pe.dido.svr.reqmngt.dao.DmndDeptMapDao;
import pe.dido.svr.reqmngt.model.DmndDeptMap;

/**
 * @author cclee
 *
 */
@Repository
public class DmndDeptMapDaoImpl implements DmndDeptMapDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#deleteDmndDeptMapById(pe.dido.svr.reqmngt.model.DmndDeptMap)
	 */
	@Override
	public void deleteDmndDeptMapById(DmndDeptMap dmndDeptMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#deleteDmndDeptMapList(java.util.List)
	 */
	@Override
	public void deleteDmndDeptMapList(List<DmndDeptMap> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#findDmndDeptMapById(int)
	 */
	@Override
	public DmndDeptMap findDmndDeptMapById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#findDmndDeptMapList(int)
	 */
	@Override
	public ArrayList<DmndDeptMap> findDmndDeptMapList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#insertDmndDeptMapById(pe.dido.svr.reqmngt.model.DmndDeptMap)
	 */
	@Override
	public void insertDmndDeptMapById(DmndDeptMap dmndDeptMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#insertDmndDeptMapList(java.util.List)
	 */
	@Override
	public void insertDmndDeptMapList(List<DmndDeptMap> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#updateDmndDeptMapById(pe.dido.svr.reqmngt.model.DmndDeptMap)
	 */
	@Override
	public void updateDmndDeptMapById(DmndDeptMap dmndDeptMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DmndDeptMapMapper#updateDmndDeptMapList(java.util.List)
	 */
	@Override
	public void updateDmndDeptMapList(List<DmndDeptMap> updateList) {
		// TODO Auto-generated method stub

	}

}
