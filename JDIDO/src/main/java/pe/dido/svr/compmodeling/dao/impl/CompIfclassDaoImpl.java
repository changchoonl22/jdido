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

import pe.dido.svr.compmodeling.dao.CompIfclassDao;
import pe.dido.svr.compmodeling.model.CompIfclass;

/**
 * @author cclee
 *
 */
@Repository
public class CompIfclassDaoImpl implements CompIfclassDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#deleteCompIfclassById(pe.dido.svr.compmodeling.model.CompIfclass)
	 */
	@Override
	public void deleteCompIfclassById(CompIfclass compIfclass) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#deleteCompIfclassList(java.util.List)
	 */
	@Override
	public void deleteCompIfclassList(List<CompIfclass> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#findCompIfclassById(int)
	 */
	@Override
	public CompIfclass findCompIfclassById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#findCompIfclassList(int)
	 */
	@Override
	public ArrayList<CompIfclass> findCompIfclassList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#insertCompIfclassById(pe.dido.svr.compmodeling.model.CompIfclass)
	 */
	@Override
	public void insertCompIfclassById(CompIfclass compIfclass) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#insertCompIfclassList(java.util.List)
	 */
	@Override
	public void insertCompIfclassList(List<CompIfclass> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#updateCompIfclassById(pe.dido.svr.compmodeling.model.CompIfclass)
	 */
	@Override
	public void updateCompIfclassById(CompIfclass compIfclass) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompIfclassMapper#updateCompIfclassList(java.util.List)
	 */
	@Override
	public void updateCompIfclassList(List<CompIfclass> updateList) {
		// TODO Auto-generated method stub

	}

}
