/**
 * 
 */
package pe.dido.svr.clzmodeling.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.clzmodeling.dao.ClassAttrbDao;
import pe.dido.svr.clzmodeling.model.ClassAttrb;

/**
 * @author cclee
 *
 */
@Repository
public class ClassAttrbDaoImpl implements ClassAttrbDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#deleteClassAttrbById(pe.dido.svr.clzmodeling.model.ClassAttrb)
	 */
	@Override
	public void deleteClassAttrbById(ClassAttrb classAttrb) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#deleteClassAttrbList(java.util.List)
	 */
	@Override
	public void deleteClassAttrbList(List<ClassAttrb> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#findClassAttrbById(int)
	 */
	@Override
	public ClassAttrb findClassAttrbById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#findClassAttrbList(int)
	 */
	@Override
	public ArrayList<ClassAttrb> findClassAttrbList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#insertClassAttrbById(pe.dido.svr.clzmodeling.model.ClassAttrb)
	 */
	@Override
	public void insertClassAttrbById(ClassAttrb classAttrb) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#insertClassAttrbList(java.util.List)
	 */
	@Override
	public void insertClassAttrbList(List<ClassAttrb> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#updateClassAttrbById(pe.dido.svr.clzmodeling.model.ClassAttrb)
	 */
	@Override
	public void updateClassAttrbById(ClassAttrb classAttrb) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassAttrbMapper#updateClassAttrbList(java.util.List)
	 */
	@Override
	public void updateClassAttrbList(List<ClassAttrb> updateList) {
		// TODO Auto-generated method stub

	}

}
