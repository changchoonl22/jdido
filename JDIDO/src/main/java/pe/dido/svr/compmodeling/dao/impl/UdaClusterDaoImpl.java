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

import pe.dido.svr.compmodeling.dao.UdaClusterDao;
import pe.dido.svr.compmodeling.model.UdaCluster;

/**
 * @author cclee
 *
 */
@Repository("udaClusterDao")
public class UdaClusterDaoImpl implements UdaClusterDao {
	private static final Logger logger = LoggerFactory.getLogger(UdaClusterDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public UdaCluster findById(HashMap searchVo) {	
		return sqlSession.selectOne("UdaCluster.findById", searchVo);
	}	
		
	@Override
	public List<UdaCluster> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("UdaCluster.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("UdaCluster.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("UdaCluster.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("UdaCluster.insert", objList);
	}	

	
	

}
