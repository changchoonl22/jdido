package pe.dido.svr.ucsmodeling.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.ucsmodeling.model.UcM;

public interface UcMDao {

	public UcM findById(HashMap searchVo);

	public List<UcM> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}