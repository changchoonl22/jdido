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

import pe.dido.svr.bizmodeling.dao.BizCncptDao;
import pe.dido.svr.bizmodeling.model.BizCncpt;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

/**
 * @author cclee
 *
 */
@Repository
public class BizCncptDaoImpl implements BizCncptDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#deleteBizCncptById(pe.dido.svr.bizmodeling.model.BizCncpt)
	 */
	@Override
	public void deleteBizCncptById(BizCncpt bizCncpt) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#deleteBizCncptList(java.util.List)
	 */
	@Override
	public void deleteBizCncptList(List<BizCncpt> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#findBizCncptById(int)
	 */
	@Override
	public BizCncpt findBizCncptById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#findBizCncptList(int)
	 */
	@Override
	public ArrayList<BizCncpt> findBizCncptList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#insertBizCncptById(pe.dido.svr.bizmodeling.model.BizCncpt)
	 */
	@Override
	public void insertBizCncptById(BizCncpt bizCncpt) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#insertBizCncptList(java.util.List)
	 */
	@Override
	public void insertBizCncptList(List<BizCncpt> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#updateBizCncptById(pe.dido.svr.bizmodeling.model.BizCncpt)
	 */
	@Override
	public void updateBizCncptById(BizCncpt bizCncpt) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptMapper#updateBizCncptList(java.util.List)
	 */
	@Override
	public void updateBizCncptList(List<BizCncpt> updateList) {
		// TODO Auto-generated method stub

	}

}
