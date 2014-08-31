package pe.dido.svr.bizmodeling.dao;

import java.util.ArrayList;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizRule;


public interface BizRuleDao {

	void deleteBizRuleById(BizRule bizRule);
	void deleteBizRuleList(List<BizRule> deleteList);
	//BizRuleMapper
	BizRule findBizRuleById(int id);
	ArrayList<BizRule> findBizRuleList(int id);
	void insertBizRuleById(BizRule bizRule);
	void insertBizRuleList(List<BizRule> insertList);
	void updateBizRuleById(BizRule bizRule);
	void updateBizRuleList(List<BizRule> updateList);

}