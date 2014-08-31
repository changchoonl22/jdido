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

import pe.dido.svr.bizmodeling.dao.BizPkgDao;
import pe.dido.svr.bizmodeling.model.BizPkg;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

/**
 * @author cclee
 *
 */
@Repository
public class BizPkgDaoImpl implements BizPkgDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#deleteBizPkgById(pe.dido.svr.bizmodeling.model.BizPkg)
	 */
	@Override
	public void deleteBizPkgById(BizPkg bizPkg) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#deleteBizPkgList(java.util.List)
	 */
	@Override
	public void deleteBizPkgList(List<BizPkg> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#findBizPkgById(int)
	 */
	@Override
	public BizPkg findBizPkgById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#findBizPkgList(int)
	 */
	@Override
	public ArrayList<BizPkg> findBizPkgList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#insertBizPkgById(pe.dido.svr.bizmodeling.model.BizPkg)
	 */
	@Override
	public void insertBizPkgById(BizPkg bizPkg) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#insertBizPkgList(java.util.List)
	 */
	@Override
	public void insertBizPkgList(List<BizPkg> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#updateBizPkgById(pe.dido.svr.bizmodeling.model.BizPkg)
	 */
	@Override
	public void updateBizPkgById(BizPkg bizPkg) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizPkgMapper#updateBizPkgList(java.util.List)
	 */
	@Override
	public void updateBizPkgList(List<BizPkg> updateList) {
		// TODO Auto-generated method stub

	}

}
