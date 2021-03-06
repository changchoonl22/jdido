/**
 * 
 */
package pe.dido.svr.reqmngt.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.reqmngt.dao.DmndDeptMapDao;
import pe.dido.svr.reqmngt.model.DmndDeptMap;

/**
 * @author cclee
 *
 */
@Repository
public class DmndDeptMapDaoImpl implements DmndDeptMapDao  {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public DmndDeptMap findById(HashMap searchVo) {	
		return sqlSession.selectOne("DmndDeptMap.findById", searchVo);
	}	
		
	@Override
	public List<DmndDeptMap> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("DmndDeptMap.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("DmndDeptMap.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("DmndDeptMap.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("DmndDeptMap.insert", objList);
	}	

}
