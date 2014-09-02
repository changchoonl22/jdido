package pe.dido.svr.compmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.compmodeling.model.CompInnerClassOp;

public interface CompInnerClassOpDao {

	public CompInnerClassOp findById(HashMap searchVo);

	public List<CompInnerClassOp> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}