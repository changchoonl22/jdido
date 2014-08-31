/**
 * 
 */
package pe.dido.svr.ucsmodeling.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.ucsmodeling.dao.UcMDao;
import pe.dido.svr.ucsmodeling.model.UcM;

/**
 * @author cclee
 *
 */
@Repository
public class UcMDaoImpl implements UcMDao {
	private static final Logger logger = LoggerFactory.getLogger(UcMDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#deleteUcMById(pe.dido.svr.ucsmodeling.model.UcM)
	 */
	@Override
	public void deleteUcMById(UcM ucM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#deleteUcMList(java.util.List)
	 */
	@Override
	public void deleteUcMList(List<UcM> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#findUcMById(int)
	 */
	@Override
	public UcM findUcMById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#findUcMList(int)
	 */
	@Override
	public ArrayList<UcM> findUcMList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#insertUcMById(pe.dido.svr.ucsmodeling.model.UcM)
	 */
	@Override
	public void insertUcMById(UcM ucM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#insertUcMList(java.util.List)
	 */
	@Override
	public void insertUcMList(List<UcM> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#updateUcMById(pe.dido.svr.ucsmodeling.model.UcM)
	 */
	@Override
	public void updateUcMById(UcM ucM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcMMapper#updateUcMList(java.util.List)
	 */
	@Override
	public void updateUcMList(List<UcM> updateList) {
		// TODO Auto-generated method stub

	}

}
