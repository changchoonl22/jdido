package pe.dido.svr.uidesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.uidesign.model.UiM;

public interface UiMDao {

	public UiM findById(HashMap searchVo);

	public List<UiM> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}