/**
 * 
 */
package pe.dido.svr.lnkdesign.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.lnkdesign.dao.LnkIfPgmDao;
import pe.dido.svr.lnkdesign.model.LnkIfPgm;

/**
 * @author cclee
 *
 */
@Repository
public class LnkIfPgmDaoImpl implements LnkIfPgmDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#deleteLnkIfPgmById(pe.dido.svr.lnkdesign.model.LnkIfPgm)
	 */
	@Override
	public void deleteLnkIfPgmById(LnkIfPgm lnkIfPgm) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#deleteLnkIfPgmList(java.util.List)
	 */
	@Override
	public void deleteLnkIfPgmList(List<LnkIfPgm> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#findLnkIfPgmById(int)
	 */
	@Override
	public LnkIfPgm findLnkIfPgmById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#findLnkIfPgmList(int)
	 */
	@Override
	public ArrayList<LnkIfPgm> findLnkIfPgmList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#insertLnkIfPgmById(pe.dido.svr.lnkdesign.model.LnkIfPgm)
	 */
	@Override
	public void insertLnkIfPgmById(LnkIfPgm lnkIfPgm) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#insertLnkIfPgmList(java.util.List)
	 */
	@Override
	public void insertLnkIfPgmList(List<LnkIfPgm> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#updateLnkIfPgmById(pe.dido.svr.lnkdesign.model.LnkIfPgm)
	 */
	@Override
	public void updateLnkIfPgmById(LnkIfPgm lnkIfPgm) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMapper#updateLnkIfPgmList(java.util.List)
	 */
	@Override
	public void updateLnkIfPgmList(List<LnkIfPgm> updateList) {
		// TODO Auto-generated method stub

	}

}
