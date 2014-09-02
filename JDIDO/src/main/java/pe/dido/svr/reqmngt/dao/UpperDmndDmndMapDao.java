package pe.dido.svr.reqmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.reqmngt.model.UpperDmndDmndMap;

public interface UpperDmndDmndMapDao {

	public UpperDmndDmndMap findById(HashMap searchVo);

	public List<UpperDmndDmndMap> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}