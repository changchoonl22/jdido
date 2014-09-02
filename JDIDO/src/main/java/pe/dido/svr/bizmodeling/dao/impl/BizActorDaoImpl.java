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

import pe.dido.svr.bizmodeling.dao.BizActorDao;
import pe.dido.svr.bizmodeling.model.BizActor;


/**
 * @author cclee
 *
 */
@Repository("bizActorDao")
public class BizActorDaoImpl implements BizActorDao {
	private static final Logger logger = LoggerFactory.getLogger(BizActorDaoImpl.class);
	
	@Autowired	
	private SqlSession sqlSession;	
	
	@Override
	public BizActor findById(HashMap searchVo) {	
		return sqlSession.selectOne("BizActor.findById", searchVo);
	}	
		
	@Override
	public List<BizActor> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("BizActor.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("BizActor.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("BizActor.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("BizActor.insert", objList);
	}	
	


}
