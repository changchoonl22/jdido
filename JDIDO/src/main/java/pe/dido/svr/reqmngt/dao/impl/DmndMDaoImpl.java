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

import pe.dido.svr.reqmngt.dao.DmndMDao;
import pe.dido.svr.reqmngt.model.DmndM;

/**
 * @author cclee
 *
 */
@Repository
public class DmndMDaoImpl implements DmndMDao  {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public DmndM findById(HashMap searchVo) {	
		return sqlSession.selectOne("DmndM.findById", searchVo);
	}	
		
	@Override
	public List<DmndM> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("DmndM.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("DmndM.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("DmndM.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("DmndM.insert", objList);
	}	

}
