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

import pe.dido.svr.clzmodeling.dao.ClassMDao;
import pe.dido.svr.clzmodeling.model.ClassM;

/**
 * @author cclee
 *
 */
@Repository
public class ClassMDaoImpl implements ClassMDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#deleteClassMById(pe.dido.svr.clzmodeling.model.ClassM)
	 */
	@Override
	public void deleteClassMById(ClassM classM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#deleteClassMList(java.util.List)
	 */
	@Override
	public void deleteClassMList(List<ClassM> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#findClassMById(int)
	 */
	@Override
	public ClassM findClassMById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#findClassMList(int)
	 */
	@Override
	public ArrayList<ClassM> findClassMList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#insertClassMById(pe.dido.svr.clzmodeling.model.ClassM)
	 */
	@Override
	public void insertClassMById(ClassM classM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#insertClassMList(java.util.List)
	 */
	@Override
	public void insertClassMList(List<ClassM> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#updateClassMById(pe.dido.svr.clzmodeling.model.ClassM)
	 */
	@Override
	public void updateClassMById(ClassM classM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.clzmodeling.persistence.ClassMMapper#updateClassMList(java.util.List)
	 */
	@Override
	public void updateClassMList(List<ClassM> updateList) {
		// TODO Auto-generated method stub

	}

}
