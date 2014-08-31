package pe.dido.svr.uidesign.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.uidesign.dao.UiAuthorDao;
import pe.dido.svr.uidesign.model.UiAuthorMap;

@Repository
public class UiAuthorDaoImpl implements UiAuthorDao {
	private static final Logger logger = LoggerFactory.getLogger(UiAuthorDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public void deleteUiAuthorMapById(UiAuthorMap uiAuthorMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUiAuthorMapList(List<UiAuthorMap> deleteList) {
		// TODO Auto-generated method stub

	}

	@Override
	public UiAuthorMap findUiAuthorMapById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UiAuthorMap> findUiAuthorMapList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUiAuthorMapById(UiAuthorMap uiAuthorMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUiAuthorMapList(List<UiAuthorMap> insertList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUiAuthorMapById(UiAuthorMap uiAuthorMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUiAuthorMapList(List<UiAuthorMap> updateList) {
		// TODO Auto-generated method stub

	}

}
