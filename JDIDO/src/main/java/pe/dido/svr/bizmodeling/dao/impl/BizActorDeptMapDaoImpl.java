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

import pe.dido.svr.bizmodeling.dao.BizActorDeptMapDao;
import pe.dido.svr.bizmodeling.model.BizActorDeptMap;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

/**
 * @author cclee
 *
 */
@Repository
public class BizActorDeptMapDaoImpl implements BizActorDeptMapDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#deleteBizActorDeptMapById(pe.dido.svr.bizmodeling.model.BizActorDeptMap)
	 */
	@Override
	public void deleteBizActorDeptMapById(BizActorDeptMap bizActorDeptMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#deleteBizActorDeptMapList(java.util.List)
	 */
	@Override
	public void deleteBizActorDeptMapList(List<BizActorDeptMap> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#findBizActorDeptMapById(int)
	 */
	@Override
	public BizActorDeptMap findBizActorDeptMapById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#findBizActorDeptMapList(int)
	 */
	@Override
	public ArrayList<BizActorDeptMap> findBizActorDeptMapList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#insertBizActorDeptMapById(pe.dido.svr.bizmodeling.model.BizActorDeptMap)
	 */
	@Override
	public void insertBizActorDeptMapById(BizActorDeptMap bizActorDeptMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#insertBizActorDeptMapList(java.util.List)
	 */
	@Override
	public void insertBizActorDeptMapList(List<BizActorDeptMap> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#updateBizActorDeptMapById(pe.dido.svr.bizmodeling.model.BizActorDeptMap)
	 */
	@Override
	public void updateBizActorDeptMapById(BizActorDeptMap bizActorDeptMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorDeptMapMapper#updateBizActorDeptMapList(java.util.List)
	 */
	@Override
	public void updateBizActorDeptMapList(List<BizActorDeptMap> updateList) {
		// TODO Auto-generated method stub

	}

}
