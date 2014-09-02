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

import pe.dido.svr.compmodeling.dao.CompMDao;
import pe.dido.svr.compmodeling.model.CompM;

/**
 * @author cclee
 *
 */
@Repository("compMDao")
public class CompMDaoImpl implements CompMDao {
	private static final Logger logger = LoggerFactory.getLogger(CompMDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public CompM findById(HashMap searchVo) {	
		return sqlSession.selectOne("CompM.findById", searchVo);
	}	
		
	@Override
	public List<CompM> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("CompM.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("CompM.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("CompM.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("CompM.insert", objList);
	}	

	
	
}
