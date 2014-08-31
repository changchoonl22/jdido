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

import pe.dido.svr.uidesign.dao.UiMenuPkgDao;
import pe.dido.svr.uidesign.model.UiMenuPkg;

/**
 * @author cclee
 *
 */
@Repository
public class UiMenuPkgDaoImpl implements UiMenuPkgDao {
	private static final Logger logger = LoggerFactory.getLogger(UiMenuPkgDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#deleteUiMenuPkgById(pe.dido.svr.uidesign.model.UiMenuPkg)
	 */
	@Override
	public void deleteUiMenuPkgById(UiMenuPkg uiMenuPkg) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#deleteUiMenuPkgList(java.util.List)
	 */
	@Override
	public void deleteUiMenuPkgList(List<UiMenuPkg> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#findUiMenuPkgById(int)
	 */
	@Override
	public UiMenuPkg findUiMenuPkgById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#findUiMenuPkgList(int)
	 */
	@Override
	public ArrayList<UiMenuPkg> findUiMenuPkgList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#insertUiMenuPkgById(pe.dido.svr.uidesign.model.UiMenuPkg)
	 */
	@Override
	public void insertUiMenuPkgById(UiMenuPkg uiMenuPkg) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#insertUiMenuPkgList(java.util.List)
	 */
	@Override
	public void insertUiMenuPkgList(List<UiMenuPkg> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#updateUiMenuPkgById(pe.dido.svr.uidesign.model.UiMenuPkg)
	 */
	@Override
	public void updateUiMenuPkgById(UiMenuPkg uiMenuPkg) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.uidesign.persistence.UiMenuPkgMapper#updateUiMenuPkgList(java.util.List)
	 */
	@Override
	public void updateUiMenuPkgList(List<UiMenuPkg> updateList) {
		// TODO Auto-generated method stub

	}

}
