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

import pe.dido.svr.bizmodeling.dao.BizActorDao;
import pe.dido.svr.bizmodeling.model.BizActor;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

/**
 * @author cclee
 *
 */
@Repository
public class BizActorDaoImpl implements BizActorDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#deleteBizActorById(pe.dido.svr.bizmodeling.model.BizActor)
	 */
	@Override
	public void deleteBizActorById(BizActor bizActor) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#deleteBizActorList(java.util.List)
	 */
	@Override
	public void deleteBizActorList(List<BizActor> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#findBizActorById(int)
	 */
	@Override
	public BizActor findBizActorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#findBizActorList(int)
	 */
	@Override
	public ArrayList<BizActor> findBizActorList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#insertBizActorById(pe.dido.svr.bizmodeling.model.BizActor)
	 */
	@Override
	public void insertBizActorById(BizActor bizActor) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#insertBizActorList(java.util.List)
	 */
	@Override
	public void insertBizActorList(List<BizActor> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#updateBizActorById(pe.dido.svr.bizmodeling.model.BizActor)
	 */
	@Override
	public void updateBizActorById(BizActor bizActor) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizActorMapper#updateBizActorList(java.util.List)
	 */
	@Override
	public void updateBizActorList(List<BizActor> updateList) {
		// TODO Auto-generated method stub

	}

}
