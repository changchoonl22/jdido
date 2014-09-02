/**
 * 
 */
package pe.dido.svr.compmodeling.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.compmodeling.dao.CompIfclassDao;
import pe.dido.svr.compmodeling.model.CompIfclass;

/**
 * @author cclee
 *
 */
@Repository("compIfclassDao")
public class CompIfclassDaoImpl implements CompIfclassDao  {
	private static final Logger logger = LoggerFactory.getLogger(CompIfclassDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public CompIfclass findById(HashMap searchVo) {	
		return sqlSession.selectOne("CompIfclass.findById", searchVo);
	}	
		
	
	@Override
	public List<CompIfclass> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("CompIfclass.findList");//,searchVo);
	}	
		
	
	@Override
	public void insert(List objList) {	
		sqlSession.insert("CompIfclass.insert", objList);
	}	
		
	
	@Override
	public void update(List objList) {	
		sqlSession.update("CompIfclass.insert", objList);
	}	
		
	
	@Override
	public void delete(List objList) {	
		sqlSession.delete("CompIfclass.insert", objList);
	}	


}
