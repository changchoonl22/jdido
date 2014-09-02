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

import pe.dido.svr.reqmngt.dao.UpperDmndDmndMapDao;
import pe.dido.svr.reqmngt.model.UpperDmnd;
import pe.dido.svr.reqmngt.model.UpperDmndDmndMap;

/**
 * @author cclee
 *
 */
@Repository
public class UpperDmndDmndMapDaoImpl implements UpperDmndDmndMapDao  {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public UpperDmndDmndMap findById(HashMap searchVo) {	
		return sqlSession.selectOne("UpperDmndDmndMap.findById", searchVo);
	}	
		
	@Override
	public List<UpperDmndDmndMap> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UpperDmndDmndMap.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UpperDmndDmndMap.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UpperDmndDmndMap.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UpperDmndDmndMap.insert", objList);
	}	

}
