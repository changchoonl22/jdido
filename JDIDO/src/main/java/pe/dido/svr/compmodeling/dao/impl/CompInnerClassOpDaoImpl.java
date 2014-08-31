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

import pe.dido.svr.compmodeling.dao.CompInnerClassOpDao;
import pe.dido.svr.compmodeling.model.CompInnerClassOp;

/**
 * @author cclee
 *
 */
@Repository
public class CompInnerClassOpDaoImpl implements CompInnerClassOpDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#deleteCompInnerClassOpById(pe.dido.svr.compmodeling.model.CompInnerClassOp)
	 */
	@Override
	public void deleteCompInnerClassOpById(CompInnerClassOp compInnerClassOp) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#deleteCompInnerClassOpList(java.util.List)
	 */
	@Override
	public void deleteCompInnerClassOpList(List<CompInnerClassOp> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#findCompInnerClassOpById(int)
	 */
	@Override
	public CompInnerClassOp findCompInnerClassOpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#findCompInnerClassOpList(int)
	 */
	@Override
	public ArrayList<CompInnerClassOp> findCompInnerClassOpList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#insertCompInnerClassOpById(pe.dido.svr.compmodeling.model.CompInnerClassOp)
	 */
	@Override
	public void insertCompInnerClassOpById(CompInnerClassOp compInnerClassOp) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#insertCompInnerClassOpList(java.util.List)
	 */
	@Override
	public void insertCompInnerClassOpList(List<CompInnerClassOp> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#updateCompInnerClassOpById(pe.dido.svr.compmodeling.model.CompInnerClassOp)
	 */
	@Override
	public void updateCompInnerClassOpById(CompInnerClassOp compInnerClassOp) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassOpMapper#updateCompInnerClassOpList(java.util.List)
	 */
	@Override
	public void updateCompInnerClassOpList(List<CompInnerClassOp> updateList) {
		// TODO Auto-generated method stub

	}

}
