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

import pe.dido.svr.bizmodeling.dao.BizCncptProcsMapDao;
import pe.dido.svr.bizmodeling.model.BizCncptProcsMap;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

/**
 * @author cclee
 *
 */
@Repository
public class BizCncptProcsMapDaoImpl implements BizCncptProcsMapDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#deleteBizCncptProcsMapById(pe.dido.svr.bizmodeling.model.BizCncptProcsMap)
	 */
	@Override
	public void deleteBizCncptProcsMapById(BizCncptProcsMap bizCncptProcsMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#deleteBizCncptProcsMapList(java.util.List)
	 */
	@Override
	public void deleteBizCncptProcsMapList(List<BizCncptProcsMap> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#findBizCncptProcsMapById(int)
	 */
	@Override
	public BizCncptProcsMap findBizCncptProcsMapById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#findBizCncptProcsMapList(int)
	 */
	@Override
	public ArrayList<BizCncptProcsMap> findBizCncptProcsMapList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#insertBizCncptProcsMapById(pe.dido.svr.bizmodeling.model.BizCncptProcsMap)
	 */
	@Override
	public void insertBizCncptProcsMapById(BizCncptProcsMap bizCncptProcsMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#insertBizCncptProcsMapList(java.util.List)
	 */
	@Override
	public void insertBizCncptProcsMapList(List<BizCncptProcsMap> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#updateBizCncptProcsMapById(pe.dido.svr.bizmodeling.model.BizCncptProcsMap)
	 */
	@Override
	public void updateBizCncptProcsMapById(BizCncptProcsMap bizCncptProcsMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizCncptProcsMapMapper#updateBizCncptProcsMapList(java.util.List)
	 */
	@Override
	public void updateBizCncptProcsMapList(List<BizCncptProcsMap> updateList) {
		// TODO Auto-generated method stub

	}

}
