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

import pe.dido.svr.bizmodeling.dao.BizCncptProcsMapDao;
import pe.dido.svr.bizmodeling.model.BizCncptProcsMap;


/**
 * @author cclee
 *
 */
@Repository("bizCncptProcsMapDaol")
public class BizCncptProcsMapDaoImpl implements BizCncptProcsMapDao {
	private static final Logger logger = LoggerFactory.getLogger(BizCncptProcsMapDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public BizCncptProcsMap findById(HashMap searchVo) {	
		return sqlSession.selectOne("BizCncptProcsMap.findById", searchVo);
	}	
		
	@Override
	public List<BizCncptProcsMap> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("BizCncptProcsMap.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("BizCncptProcsMap.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("BizCncptProcsMap.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("BizCncptProcsMap.insert", objList);
	}	


}
