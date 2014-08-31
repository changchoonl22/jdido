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

import pe.dido.svr.compmodeling.dao.CompImplClassDao;
import pe.dido.svr.compmodeling.model.CompImplClass;

/**
 * @author cclee
 *
 */
@Repository
public class CompImplClassDaoImpl implements CompImplClassDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#deleteCompImplClassById(pe.dido.svr.compmodeling.model.CompImplClass)
	 */
	@Override
	public void deleteCompImplClassById(CompImplClass compImplClass) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#deleteCompImplClassList(java.util.List)
	 */
	@Override
	public void deleteCompImplClassList(List<CompImplClass> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#findCompImplClassById(int)
	 */
	@Override
	public CompImplClass findCompImplClassById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#findCompImplClassList(int)
	 */
	@Override
	public ArrayList<CompImplClass> findCompImplClassList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#insertCompImplClassById(pe.dido.svr.compmodeling.model.CompImplClass)
	 */
	@Override
	public void insertCompImplClassById(CompImplClass compImplClass) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#insertCompImplClassList(java.util.List)
	 */
	@Override
	public void insertCompImplClassList(List<CompImplClass> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#updateCompImplClassById(pe.dido.svr.compmodeling.model.CompImplClass)
	 */
	@Override
	public void updateCompImplClassById(CompImplClass compImplClass) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompImplClassMapper#updateCompImplClassList(java.util.List)
	 */
	@Override
	public void updateCompImplClassList(List<CompImplClass> updateList) {
		// TODO Auto-generated method stub

	}

}
