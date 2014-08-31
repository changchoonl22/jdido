/**
 * 
 */
package pe.dido.svr.bizmodeling.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.bizmodeling.dao.BizProcsDao;
import pe.dido.svr.bizmodeling.model.BizProcs;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

/**
 * @author cclee
 *
 */
@Repository
public class BizProcsDaoImpl implements BizProcsDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#deleteBizProcsById(pe.dido.svr.bizmodeling.model.BizProcs)
	 */
	@Override
	public void deleteBizProcsById(BizProcs bizProcs) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#deleteBizProcsList(java.util.List)
	 */
	@Override
	public void deleteBizProcsList(List<BizProcs> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#findBizProcsById(int)
	 */
	@Override
	public BizProcs findBizProcsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#findBizProcsList(int)
	 */
	@Override
	public ArrayList<BizProcs> findBizProcsList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#insertBizProcsById(pe.dido.svr.bizmodeling.model.BizProcs)
	 */
	@Override
	public void insertBizProcsById(BizProcs bizProcs) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#insertBizProcsList(java.util.List)
	 */
	@Override
	public void insertBizProcsList(List<BizProcs> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#updateBizProcsById(pe.dido.svr.bizmodeling.model.BizProcs)
	 */
	@Override
	public void updateBizProcsById(BizProcs bizProcs) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizProcsMapper#updateBizProcsList(java.util.List)
	 */
	@Override
	public void updateBizProcsList(List<BizProcs> updateList) {
		// TODO Auto-generated method stub

	}

}
