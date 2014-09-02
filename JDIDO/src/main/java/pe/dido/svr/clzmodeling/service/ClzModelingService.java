package pe.dido.svr.clzmodeling.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.clzmodeling.model.ClassAttrb;
import pe.dido.svr.clzmodeling.model.ClassM;
import pe.dido.svr.clzmodeling.model.ClassOp;

public interface ClzModelingService {

	//ClassAttrbDao	
	public ClassAttrb findClassAttrbById(HashMap searchVo);

	public List<ClassAttrb> findClassAttrbList();

	public void saveClassAttrbList(HashMap procParam);

	//ClassMDao	
	public ClassM findClassMById(HashMap searchVo);

	public List<ClassM> findClassMList();

	public void saveClassMList(HashMap procParam);

	//ClassOpDao	
	public ClassOp findClassOpById(HashMap searchVo);

	public List<ClassOp> findClassOpList();

	public void saveClassOpList(HashMap procParam);

}