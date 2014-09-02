package pe.dido.svr.reqmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.reqmngt.model.DmndM;

public interface DmndMDao {

	public DmndM findById(HashMap searchVo);

	public List<DmndM> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}