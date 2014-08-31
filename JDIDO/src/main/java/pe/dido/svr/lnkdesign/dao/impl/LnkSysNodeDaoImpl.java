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

import pe.dido.svr.lnkdesign.dao.LnkSysNodeDao;
import pe.dido.svr.lnkdesign.model.LnkSysNode;

/**
 * @author cclee
 *
 */
@Repository
public class LnkSysNodeDaoImpl implements LnkSysNodeDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#deleteLnkSysNodeById(pe.dido.svr.lnkdesign.model.LnkSysNode)
	 */
	@Override
	public void deleteLnkSysNodeById(LnkSysNode lnkSysNode) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#deleteLnkSysNodeList(java.util.List)
	 */
	@Override
	public void deleteLnkSysNodeList(List<LnkSysNode> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#findLnkSysNodeById(int)
	 */
	@Override
	public LnkSysNode findLnkSysNodeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#findLnkSysNodeList(int)
	 */
	@Override
	public ArrayList<LnkSysNode> findLnkSysNodeList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#insertLnkSysNodeById(pe.dido.svr.lnkdesign.model.LnkSysNode)
	 */
	@Override
	public void insertLnkSysNodeById(LnkSysNode lnkSysNode) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#insertLnkSysNodeList(java.util.List)
	 */
	@Override
	public void insertLnkSysNodeList(List<LnkSysNode> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#updateLnkSysNodeById(pe.dido.svr.lnkdesign.model.LnkSysNode)
	 */
	@Override
	public void updateLnkSysNodeById(LnkSysNode lnkSysNode) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.lnkdesign.persistence.LnkSysNodeMapper#updateLnkSysNodeList(java.util.List)
	 */
	@Override
	public void updateLnkSysNodeList(List<LnkSysNode> updateList) {
		// TODO Auto-generated method stub

	}

}
