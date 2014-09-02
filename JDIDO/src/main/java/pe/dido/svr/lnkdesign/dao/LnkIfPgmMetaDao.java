package pe.dido.svr.lnkdesign.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.lnkdesign.model.LnkIfPgmMeta;

public interface LnkIfPgmMetaDao {

	public LnkIfPgmMeta findById(HashMap searchVo);

	public List<LnkIfPgmMeta> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}