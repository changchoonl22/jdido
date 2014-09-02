/**
 * 
 */
package pe.dido.svr.uidesign.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
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
@Repository("uiMenuPkgDao")
public class UiMenuPkgDaoImpl implements UiMenuPkgDao {
	private static final Logger logger = LoggerFactory.getLogger(UiMenuPkgDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public UiMenuPkg findById(HashMap searchVo) {	
		return sqlSession.selectOne("UiMenuPkg.findById", searchVo);
	}	
		
	@Override
	public List<UiMenuPkg> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UiMenuPkg.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UiMenuPkg.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UiMenuPkg.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UiMenuPkg.insert", objList);
	}	

}
