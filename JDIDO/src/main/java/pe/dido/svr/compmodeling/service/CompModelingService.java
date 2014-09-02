package pe.dido.svr.compmodeling.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pe.dido.svr.compmodeling.model.CompIfclass;
import pe.dido.svr.compmodeling.model.CompImplClass;
import pe.dido.svr.compmodeling.model.CompInnerClassAttrb;
import pe.dido.svr.compmodeling.model.CompInnerClassOp;
import pe.dido.svr.compmodeling.model.CompM;
import pe.dido.svr.compmodeling.model.UdaCluster;

public interface CompModelingService {

	//CompIfclassDao		
	public CompIfclass findCompIfclassById(HashMap searchVo);

	public List<CompIfclass> findCompIfclassList();

	public void saveCompIfclassList(HashMap procParam);

	//CompImplClassDao	
	public CompImplClass findCompImplClassById(HashMap searchVo);

	public List<CompImplClass> findCompImplClassList();

	public void saveCompImplClassList(HashMap procParam);

	//CompInnerClassAttrbDao	
	public CompInnerClassAttrb findCompInnerClassAttrbById(HashMap searchVo);

	public List<CompInnerClassAttrb> findCompInnerClassAttrbList();

	public void saveCompInnerClassAttrbList(HashMap procParam);

	//CompInnerClassOpDao	
	public CompInnerClassOp findCompInnerClassOpById(HashMap searchVo);

	public List<CompInnerClassOp> findCompInnerClassOpList();

	public void saveCompInnerClassOpList(HashMap procParam);

	//CompMDao	
	public CompM findCompMById(HashMap searchVo);

	public List<CompM> findCompMList();

	public void saveCompMList(HashMap procParam);

	//UdaClusterDao	
	public UdaCluster findUdaClusterById(HashMap searchVo);

	public List<UdaCluster> findUdaClusterList();

	public void saveUdaClusterList(HashMap procParam);

}