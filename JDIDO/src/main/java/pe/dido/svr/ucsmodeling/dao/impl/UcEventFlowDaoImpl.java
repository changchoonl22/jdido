/**
 * 
 */
package pe.dido.svr.ucsmodeling.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.ucsmodeling.dao.UcEventFlowDao;
import pe.dido.svr.ucsmodeling.model.UcEventFlow;

/**
 * @author cclee
 *
 */
@Repository
public class UcEventFlowDaoImpl implements UcEventFlowDao {
	private static final Logger logger = LoggerFactory.getLogger(UcEventFlowDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#deleteUcEventFlowById(pe.dido.svr.ucsmodeling.model.UcEventFlow)
	 */
	@Override
	public void deleteUcEventFlowById(UcEventFlow ucEventFlow) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#deleteUcEventFlowList(java.util.List)
	 */
	@Override
	public void deleteUcEventFlowList(List<UcEventFlow> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#findUcEventFlowById(int)
	 */
	@Override
	public UcEventFlow findUcEventFlowById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#findUcEventFlowList(int)
	 */
	@Override
	public ArrayList<UcEventFlow> findUcEventFlowList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#insertUcEventFlowById(pe.dido.svr.ucsmodeling.model.UcEventFlow)
	 */
	@Override
	public void insertUcEventFlowById(UcEventFlow ucEventFlow) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#insertUcEventFlowList(java.util.List)
	 */
	@Override
	public void insertUcEventFlowList(List<UcEventFlow> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#updateUcEventFlowById(pe.dido.svr.ucsmodeling.model.UcEventFlow)
	 */
	@Override
	public void updateUcEventFlowById(UcEventFlow ucEventFlow) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcEventFlowMapper#updateUcEventFlowList(java.util.List)
	 */
	@Override
	public void updateUcEventFlowList(List<UcEventFlow> updateList) {
		// TODO Auto-generated method stub

	}

}
