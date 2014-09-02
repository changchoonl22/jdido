package pe.dido.svr.reqmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.reqmngt.model.Dept;

public interface DeptDao {

	public Dept findById(HashMap searchVo);

	public List<Dept> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}