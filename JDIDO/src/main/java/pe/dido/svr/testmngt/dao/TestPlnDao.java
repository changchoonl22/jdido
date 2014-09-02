package pe.dido.svr.testmngt.dao;

import java.util.HashMap;
import java.util.List;

import pe.dido.svr.testmngt.model.TestPln;

public interface TestPlnDao {

	public TestPln findById(HashMap searchVo);

	public List<TestPln> findList();

	public void insert(List objList);

	public void update(List objList);

	public void delete(List objList);

}