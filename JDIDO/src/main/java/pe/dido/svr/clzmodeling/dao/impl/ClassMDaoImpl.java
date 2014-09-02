/**
 * 
 */
package pe.dido.svr.clzmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.clzmodeling.dao.ClassMDao;
import pe.dido.svr.clzmodeling.model.ClassM;

/**
 * @author cclee
 *
 */
@Repository
public class ClassMDaoImpl implements ClassMDao {
	private static final Logger logger = LoggerFactory.getLogger(ClassMDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public ClassM findById(HashMap searchVo) {	
		return sqlSession.selectOne("ClassM.findById", searchVo);
	}	
		
	@Override
	public List<ClassM> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("ClassM.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("ClassM.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("ClassM.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("ClassM.insert", objList);
	}	


}
