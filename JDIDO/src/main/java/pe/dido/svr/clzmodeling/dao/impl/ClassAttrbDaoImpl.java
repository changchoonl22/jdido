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

import pe.dido.svr.clzmodeling.dao.ClassAttrbDao;
import pe.dido.svr.clzmodeling.model.ClassAttrb;

/**
 * @author cclee
 *
 */
@Repository
public class ClassAttrbDaoImpl implements ClassAttrbDao {
	private static final Logger logger = LoggerFactory.getLogger(ClassAttrbDaoImpl.class);	
	
	@Autowired	
	private SqlSession sqlSession;	
		
	@Override
	public ClassAttrb findById(HashMap searchVo) {	
		return sqlSession.selectOne("ClassAttrb.findById", searchVo);
	}	
		
	@Override
	public List<ClassAttrb> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("ClassAttrb.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("ClassAttrb.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("ClassAttrb.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("ClassAttrb.insert", objList);
	}	


}
