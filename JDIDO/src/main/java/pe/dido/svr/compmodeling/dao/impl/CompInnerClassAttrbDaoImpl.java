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

import pe.dido.svr.compmodeling.dao.CompInnerClassAttrbDao;
import pe.dido.svr.compmodeling.model.CompInnerClassAttrb;

/**
 * @author cclee
 *
 */
@Repository
public class CompInnerClassAttrbDaoImpl implements CompInnerClassAttrbDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#deleteCompInnerClassAttrbById(pe.dido.svr.compmodeling.model.CompInnerClassAttrb)
	 */
	@Override
	public void deleteCompInnerClassAttrbById(
			CompInnerClassAttrb compInnerClassAttrb) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#deleteCompInnerClassAttrbList(java.util.List)
	 */
	@Override
	public void deleteCompInnerClassAttrbList(
			List<CompInnerClassAttrb> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#findCompInnerClassAttrbById(int)
	 */
	@Override
	public CompInnerClassAttrb findCompInnerClassAttrbById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#findCompInnerClassAttrbList(int)
	 */
	@Override
	public ArrayList<CompInnerClassAttrb> findCompInnerClassAttrbList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#insertCompInnerClassAttrbById(pe.dido.svr.compmodeling.model.CompInnerClassAttrb)
	 */
	@Override
	public void insertCompInnerClassAttrbById(
			CompInnerClassAttrb compInnerClassAttrb) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#insertCompInnerClassAttrbList(java.util.List)
	 */
	@Override
	public void insertCompInnerClassAttrbList(
			List<CompInnerClassAttrb> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#updateCompInnerClassAttrbById(pe.dido.svr.compmodeling.model.CompInnerClassAttrb)
	 */
	@Override
	public void updateCompInnerClassAttrbById(
			CompInnerClassAttrb compInnerClassAttrb) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.compmodeling.persistence.CompInnerClassAttrbMapper#updateCompInnerClassAttrbList(java.util.List)
	 */
	@Override
	public void updateCompInnerClassAttrbList(
			List<CompInnerClassAttrb> updateList) {
		// TODO Auto-generated method stub

	}

}
