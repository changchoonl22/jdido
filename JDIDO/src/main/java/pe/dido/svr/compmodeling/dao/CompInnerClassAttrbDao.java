package pe.dido.svr.compmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompInnerClassAttrb;

public interface CompInnerClassAttrbDao {

	public CompInnerClassAttrb findById(HashMap searchVo);

	public List<CompInnerClassAttrb> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}