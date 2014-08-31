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

import pe.dido.svr.lnkdesign.dao.LnkIfPgmMetaDao;
import pe.dido.svr.lnkdesign.model.LnkIfPgmMeta;

/**
 * @author cclee
 *
 */
@Repository
public class LnkIfPgmMetaDaoImpl implements LnkIfPgmMetaDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#deleteLnkIfPgmMetaById(pe.dido.svr.lnkdesign.model.LnkIfPgmMeta)
	 */
	@Override
	public void deleteLnkIfPgmMetaById(LnkIfPgmMeta lnkIfPgmMeta) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#deleteLnkIfPgmMetaList(java.util.List)
	 */
	@Override
	public void deleteLnkIfPgmMetaList(List<LnkIfPgmMeta> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#findLnkIfPgmMetaById(int)
	 */
	@Override
	public LnkIfPgmMeta findLnkIfPgmMetaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#findLnkIfPgmMetaList(int)
	 */
	@Override
	public ArrayList<LnkIfPgmMeta> findLnkIfPgmMetaList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#insertLnkIfPgmMetaById(pe.dido.svr.lnkdesign.model.LnkIfPgmMeta)
	 */
	@Override
	public void insertLnkIfPgmMetaById(LnkIfPgmMeta lnkIfPgmMeta) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#insertLnkIfPgmMetaList(java.util.List)
	 */
	@Override
	public void insertLnkIfPgmMetaList(List<LnkIfPgmMeta> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#updateLnkIfPgmMetaById(pe.dido.svr.lnkdesign.model.LnkIfPgmMeta)
	 */
	@Override
	public void updateLnkIfPgmMetaById(LnkIfPgmMeta lnkIfPgmMeta) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkIfPgmMetaMapper#updateLnkIfPgmMetaList(java.util.List)
	 */
	@Override
	public void updateLnkIfPgmMetaList(List<LnkIfPgmMeta> updateList) {
		// TODO Auto-generated method stub

	}

}
