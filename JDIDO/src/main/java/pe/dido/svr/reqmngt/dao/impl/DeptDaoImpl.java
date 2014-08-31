/**
 * 
 */
package pe.dido.svr.reqmngt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.reqmngt.dao.DeptDao;
import pe.dido.svr.reqmngt.model.Dept;

/**
 * @author cclee
 *
 */
@Repository
public class DeptDaoImpl implements DeptDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#deleteDeptById(pe.dido.svr.reqmngt.model.Dept)
	 */
	@Override
	public void deleteDeptById(Dept dept) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#deleteDeptList(java.util.List)
	 */
	@Override
	public void deleteDeptList(List<Dept> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#findDeptById(int)
	 */
	@Override
	public Dept findDeptById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#findDeptList(int)
	 */
	@Override
	public ArrayList<Dept> findDeptList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#insertDeptById(pe.dido.svr.reqmngt.model.Dept)
	 */
	@Override
	public void insertDeptById(Dept dept) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#insertDeptList(java.util.List)
	 */
	@Override
	public void insertDeptList(List<Dept> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#updateDeptById(pe.dido.svr.reqmngt.model.Dept)
	 */
	@Override
	public void updateDeptById(Dept dept) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.reqmngt.persistence.DeptMapper#updateDeptList(java.util.List)
	 */
	@Override
	public void updateDeptList(List<Dept> updateList) {
		// TODO Auto-generated method stub

	}

}
