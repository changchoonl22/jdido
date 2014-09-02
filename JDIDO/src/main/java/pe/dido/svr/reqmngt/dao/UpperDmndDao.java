package pe.dido.svr.reqmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.reqmngt.model.UpperDmnd;

public interface UpperDmndDao {

	public UpperDmnd findById(HashMap searchVo);

	public List<UpperDmnd> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}