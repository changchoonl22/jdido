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

import pe.dido.svr.lnkdesign.dao.LnkOtrSysDao;
import pe.dido.svr.lnkdesign.model.LnkOtrSys;

/**
 * @author cclee
 *
 */
@Repository
public class LnkOtrSysDaoImpl implements LnkOtrSysDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#deleteLnkOtrSysById(pe.dido.svr.lnkdesign.model.LnkOtrSys)
	 */
	@Override
	public void deleteLnkOtrSysById(LnkOtrSys lnkOtrSys) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#deleteLnkOtrSysList(java.util.List)
	 */
	@Override
	public void deleteLnkOtrSysList(List<LnkOtrSys> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#findLnkOtrSysById(int)
	 */
	@Override
	public LnkOtrSys findLnkOtrSysById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#findLnkOtrSysList(int)
	 */
	@Override
	public ArrayList<LnkOtrSys> findLnkOtrSysList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#insertLnkOtrSysById(pe.dido.svr.lnkdesign.model.LnkOtrSys)
	 */
	@Override
	public void insertLnkOtrSysById(LnkOtrSys lnkOtrSys) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#insertLnkOtrSysList(java.util.List)
	 */
	@Override
	public void insertLnkOtrSysList(List<LnkOtrSys> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#updateLnkOtrSysById(pe.dido.svr.lnkdesign.model.LnkOtrSys)
	 */
	@Override
	public void updateLnkOtrSysById(LnkOtrSys lnkOtrSys) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkOtrSysMapper#updateLnkOtrSysList(java.util.List)
	 */
	@Override
	public void updateLnkOtrSysList(List<LnkOtrSys> updateList) {
		// TODO Auto-generated method stub

	}

}
