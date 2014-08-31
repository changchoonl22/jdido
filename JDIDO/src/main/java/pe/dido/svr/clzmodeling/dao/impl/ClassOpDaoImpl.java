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

import pe.dido.svr.clzmodeling.dao.ClassOpDao;
import pe.dido.svr.clzmodeling.model.ClassOp;

/**
 * @author cclee
 *
 */
@Repository
public class ClassOpDaoImpl implements ClassOpDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#deleteClassOpById(pe.dido.svr.clzmodeling.model.ClassOp)
	 */
	@Override
	public void deleteClassOpById(ClassOp classOp) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#deleteClassOpList(java.util.List)
	 */
	@Override
	public void deleteClassOpList(List<ClassOp> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#findClassOpById(int)
	 */
	@Override
	public ClassOp findClassOpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#findClassOpList(int)
	 */
	@Override
	public ArrayList<ClassOp> findClassOpList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#insertClassOpById(pe.dido.svr.clzmodeling.model.ClassOp)
	 */
	@Override
	public void insertClassOpById(ClassOp classOp) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#insertClassOpList(java.util.List)
	 */
	@Override
	public void insertClassOpList(List<ClassOp> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#updateClassOpById(pe.dido.svr.clzmodeling.model.ClassOp)
	 */
	@Override
	public void updateClassOpById(ClassOp classOp) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassOpMapper#updateClassOpList(java.util.List)
	 */
	@Override
	public void updateClassOpList(List<ClassOp> updateList) {
		// TODO Auto-generated method stub

	}

}
