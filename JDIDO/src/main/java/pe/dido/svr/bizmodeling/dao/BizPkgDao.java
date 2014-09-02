package pe.dido.svr.bizmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizPkg;

public interface BizPkgDao {

	public BizPkg findById(HashMap searchVo);

	public List<BizPkg> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}