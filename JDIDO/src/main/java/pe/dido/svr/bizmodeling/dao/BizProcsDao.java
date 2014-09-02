package pe.dido.svr.bizmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.bizmodeling.model.BizProcs;

public interface BizProcsDao {

	public BizProcs findById(HashMap searchVo);

	public List<BizProcs> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}