/**
 * 
 */
package pe.dido.svr.bizmodeling.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.bizmodeling.dao.BizRuleDao;
import pe.dido.svr.bizmodeling.model.BizRule;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

/**
 * @author cclee
 *
 */
@Repository
public class BizRuleDaoImpl implements BizRuleDao {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#deleteBizRuleById(pe.dido.svr.bizmodeling.model.BizRule)
	 */
	@Override
	public void deleteBizRuleById(BizRule bizRule) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#deleteBizRuleList(java.util.List)
	 */
	@Override
	public void deleteBizRuleList(List<BizRule> deleteList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#findBizRuleById(int)
	 */
	@Override
	public BizRule findBizRuleById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#findBizRuleList(int)
	 */
	@Override
	public ArrayList<BizRule> findBizRuleList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#insertBizRuleById(pe.dido.svr.bizmodeling.model.BizRule)
	 */
	@Override
	public void insertBizRuleById(BizRule bizRule) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#insertBizRuleList(java.util.List)
	 */
	@Override
	public void insertBizRuleList(List<BizRule> insertList) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#updateBizRuleById(pe.dido.svr.bizmodeling.model.BizRule)
	 */
	@Override
	public void updateBizRuleById(BizRule bizRule) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see pe.dido.svr.bizmodeling.persistence.BizRuleMapper#updateBizRuleList(java.util.List)
	 */
	@Override
	public void updateBizRuleList(List<BizRule> updateList) {
		// TODO Auto-generated method stub

	}

}
