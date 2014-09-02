package pe.dido.svr.bizmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizRule;

public interface BizRuleDao {

	public BizRule findById(HashMap searchVo);

	public List<BizRule> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}