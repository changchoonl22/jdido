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

import pe.dido.svr.bizmodeling.dao.BizRuleDao;
import pe.dido.svr.bizmodeling.model.BizRule;

/**
 * @author cclee
 *
 */
@Repository("bizRuleDao")
public class BizRuleDaoImpl implements BizRuleDao {
	private static final Logger logger = LoggerFactory.getLogger(BizRuleDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public BizRule findById(HashMap searchVo) {	
		return sqlSession.selectOne("BizRule.findById", searchVo);
	}	
		
	@Override
	public List<BizRule> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("BizRule.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("BizRule.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("BizRule.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("BizRule.insert", objList);
	}	


}
