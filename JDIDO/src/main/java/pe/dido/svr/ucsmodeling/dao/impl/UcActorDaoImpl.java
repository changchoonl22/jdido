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

@Repository
public class UcActorDaoImpl implements UcActorDao {
	private static final Logger logger = LoggerFactory.getLogger(UcActorDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public void deleteUcActorMapById(UcActorMap ucActorMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUcActorMapList(List<UcActorMap> deleteList) {
		// TODO Auto-generated method stub

	}

	@Override
	public UcActorMap findUcActorMapById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UcActorMap> findUcActorMapList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUcActorMapById(UcActorMap ucActorMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUcActorMapList(List<UcActorMap> insertList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUcActorMapById(UcActorMap ucActorMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUcActorMapList(List<UcActorMap> updateList) {
		// TODO Auto-generated method stub

	}

}
