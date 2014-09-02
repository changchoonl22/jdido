package pe.dido.svr.reqmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.reqmngt.model.DmndDeptMap;

public interface DmndDeptMapDao {

	public DmndDeptMap findById(HashMap searchVo);

	public List<DmndDeptMap> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}