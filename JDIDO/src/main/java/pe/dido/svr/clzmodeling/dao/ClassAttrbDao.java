package pe.dido.svr.clzmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.clzmodeling.model.ClassAttrb;

public interface ClassAttrbDao {

	public ClassAttrb findById(HashMap searchVo);

	public List<ClassAttrb> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}