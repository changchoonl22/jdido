package pe.dido.svr.clzmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.clzmodeling.model.ClassOp;

public interface ClassOpDao {

	public ClassOp findById(HashMap searchVo);

	public List<ClassOp> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}