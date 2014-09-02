package pe.dido.svr.ucsmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.ucsmodeling.model.UcEventFlow;

public interface UcEventFlowDao {

	public UcEventFlow findById(HashMap searchVo);

	public List<UcEventFlow> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}