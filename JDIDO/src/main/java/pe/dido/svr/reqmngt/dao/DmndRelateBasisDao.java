package pe.dido.svr.reqmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.reqmngt.model.DmndRelateBasis;

public interface DmndRelateBasisDao {

	public DmndRelateBasis findById(HashMap searchVo);

	public List<DmndRelateBasis> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}