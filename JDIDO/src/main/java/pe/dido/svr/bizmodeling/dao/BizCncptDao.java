package pe.dido.svr.bizmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizCncpt;

public interface BizCncptDao {

	public BizCncpt findById(HashMap searchVo);

	public List<BizCncpt> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}