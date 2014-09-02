package pe.dido.svr.clzmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.clzmodeling.model.ClassM;

public interface ClassMDao {

	public ClassM findById(HashMap searchVo);

	public List<ClassM> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}