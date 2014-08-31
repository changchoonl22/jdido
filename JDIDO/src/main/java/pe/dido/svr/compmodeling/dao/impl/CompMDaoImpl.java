/**
 * 
 */
package pe.dido.svr.compmodeling.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.compmodeling.dao.CompMDao;
import pe.dido.svr.compmodeling.model.CompM;

/**
 * @author cclee
 *
 */
@Repository
public class CompMDaoImpl implements CompMDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#deleteCompMById(pe.dido.svr.compmodeling.model.CompM)
	 */
	@Override
	public void deleteCompMById(CompM compM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#deleteCompMList(java.util.List)
	 */
	@Override
	public void deleteCompMList(List<CompM> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#findCompMById(int)
	 */
	@Override
	public CompM findCompMById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#findCompMList(int)
	 */
	@Override
	public ArrayList<CompM> findCompMList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#insertCompMById(pe.dido.svr.compmodeling.model.CompM)
	 */
	@Override
	public void insertCompMById(CompM compM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#insertCompMList(java.util.List)
	 */
	@Override
	public void insertCompMList(List<CompM> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#updateCompMById(pe.dido.svr.compmodeling.model.CompM)
	 */
	@Override
	public void updateCompMById(CompM compM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompMMapper#updateCompMList(java.util.List)
	 */
	@Override
	public void updateCompMList(List<CompM> updateList) {
		// TODO Auto-generated method stub

	}

}
