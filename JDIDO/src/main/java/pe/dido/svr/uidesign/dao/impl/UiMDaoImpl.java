/**
 * 
 */
package pe.dido.svr.uidesign.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.uidesign.dao.UiMDao;
import pe.dido.svr.uidesign.model.UiM;

/**
 * @author cclee
 *
 */
@Repository
public class UiMDaoImpl implements UiMDao {
	private static final Logger logger = LoggerFactory.getLogger(UiMDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#deleteUiMById(pe.dido.svr.uidesign.model.UiM)
	 */
	@Override
	public void deleteUiMById(UiM uiM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#deleteUiMList(java.util.List)
	 */
	@Override
	public void deleteUiMList(List<UiM> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#findUiMById(int)
	 */
	@Override
	public UiM findUiMById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#findUiMList(int)
	 */
	@Override
	public ArrayList<UiM> findUiMList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#insertUiMById(pe.dido.svr.uidesign.model.UiM)
	 */
	@Override
	public void insertUiMById(UiM uiM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#insertUiMList(java.util.List)
	 */
	@Override
	public void insertUiMList(List<UiM> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#updateUiMById(pe.dido.svr.uidesign.model.UiM)
	 */
	@Override
	public void updateUiMById(UiM uiM) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMMapper#updateUiMList(java.util.List)
	 */
	@Override
	public void updateUiMList(List<UiM> updateList) {
		// TODO Auto-generated method stub

	}

}
