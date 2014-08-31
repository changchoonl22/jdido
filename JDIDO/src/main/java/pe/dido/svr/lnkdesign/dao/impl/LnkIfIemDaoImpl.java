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

import pe.dido.svr.lnkdesign.dao.LnkIfIemDao;
import pe.dido.svr.lnkdesign.model.LnkIfIem;

/**
 * @author cclee
 *
 */
@Repository
public class LnkIfIemDaoImpl implements LnkIfIemDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#deleteLnkIfIemById(pe.dido.svr.lnkdesign.model.LnkIfIem)
	 */
	@Override
	public void deleteLnkIfIemById(LnkIfIem lnkIfIem) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#deleteLnkIfIemList(java.util.List)
	 */
	@Override
	public void deleteLnkIfIemList(List<LnkIfIem> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#findLnkIfIemById(int)
	 */
	@Override
	public LnkIfIem findLnkIfIemById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#findLnkIfIemList(int)
	 */
	@Override
	public ArrayList<LnkIfIem> findLnkIfIemList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#insertLnkIfIemById(pe.dido.svr.lnkdesign.model.LnkIfIem)
	 */
	@Override
	public void insertLnkIfIemById(LnkIfIem lnkIfIem) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#insertLnkIfIemList(java.util.List)
	 */
	@Override
	public void insertLnkIfIemList(List<LnkIfIem> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#updateLnkIfIemById(pe.dido.svr.lnkdesign.model.LnkIfIem)
	 */
	@Override
	public void updateLnkIfIemById(LnkIfIem lnkIfIem) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfIemMapper#updateLnkIfIemList(java.util.List)
	 */
	@Override
	public void updateLnkIfIemList(List<LnkIfIem> updateList) {
		// TODO Auto-generated method stub

	}

}
