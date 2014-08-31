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

import pe.dido.svr.ucsmodeling.dao.UcActorDao;
import pe.dido.svr.ucsmodeling.model.UcActorMap;

/**
 * @author cclee
 *
 */
@Repository
public class UcActorMapDaoImpl implements UcActorDao {
	private static final Logger logger = LoggerFactory.getLogger(UcActorMapDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#deleteUcActorMapById(pe.dido.svr.ucsmodeling.model.UcActorMap)
	 */
	@Override
	public void deleteUcActorMapById(UcActorMap ucActorMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#deleteUcActorMapList(java.util.List)
	 */
	@Override
	public void deleteUcActorMapList(List<UcActorMap> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#findUcActorMapById(int)
	 */
	@Override
	public UcActorMap findUcActorMapById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#findUcActorMapList(int)
	 */
	@Override
	public ArrayList<UcActorMap> findUcActorMapList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#insertUcActorMapById(pe.dido.svr.ucsmodeling.model.UcActorMap)
	 */
	@Override
	public void insertUcActorMapById(UcActorMap ucActorMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#insertUcActorMapList(java.util.List)
	 */
	@Override
	public void insertUcActorMapList(List<UcActorMap> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#updateUcActorMapById(pe.dido.svr.ucsmodeling.model.UcActorMap)
	 */
	@Override
	public void updateUcActorMapById(UcActorMap ucActorMap) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.ucsmodeling.persistence.UcActorMapMapper#updateUcActorMapList(java.util.List)
	 */
	@Override
	public void updateUcActorMapList(List<UcActorMap> updateList) {
		// TODO Auto-generated method stub

	}

}
