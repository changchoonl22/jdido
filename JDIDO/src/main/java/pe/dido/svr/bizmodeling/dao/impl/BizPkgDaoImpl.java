/**
 * 
 */
package pe.dido.svr.bizmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.bizmodeling.dao.BizPkgDao;
import pe.dido.svr.bizmodeling.model.BizPkg;


/**
 * @author cclee
 *
 */
@Repository("bizPkgDao")
public class BizPkgDaoImpl implements BizPkgDao {
	private static final Logger logger = LoggerFactory.getLogger(BizPkgDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public BizPkg findById(HashMap searchVo) {	
		return sqlSession.selectOne("BizPkg.findById", searchVo);
	}	
		
	@Override
	public List<BizPkg> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("BizPkg.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("BizPkg.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("BizPkg.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("BizPkg.insert", objList);
	}	

}
