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

import pe.dido.svr.reqmngt.dao.DeptDao;
import pe.dido.svr.reqmngt.model.Dept;

/**
 * @author cclee
 *
 */
@Repository
public class DeptDaoImpl implements DeptDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public Dept findById(HashMap searchVo) {	
		return sqlSession.selectOne("Dept.findById", searchVo);
	}	
		
	@Override
	public List<Dept> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("Dept.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("Dept.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("Dept.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("Dept.insert", objList);
	}	

}
