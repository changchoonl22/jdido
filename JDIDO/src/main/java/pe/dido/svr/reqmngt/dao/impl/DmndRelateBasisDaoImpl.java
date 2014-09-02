/**
 * 
 */
package pe.dido.svr.reqmngt.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.reqmngt.dao.DmndRelateBasisDao;
import pe.dido.svr.reqmngt.model.DmndRelateBasis;

/**
 * @author cclee
 *
 */
@Repository
public class DmndRelateBasisDaoImpl implements DmndRelateBasisDao  {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public DmndRelateBasis findById(HashMap searchVo) {	
		return sqlSession.selectOne("DmndRelateBasis.findById", searchVo);
	}	
		
	@Override
	public List<DmndRelateBasis> findList(){//HashMap searchVo) {	
		return sqlSession.selectList("DmndRelateBasis.findList");//,searchVo);
	}	
		
	@Override
	public void insert(List objList) {	
		sqlSession.insert("DmndRelateBasis.insert", objList);
	}	
		
	@Override
	public void update(List objList) {	
		sqlSession.update("DmndRelateBasis.insert", objList);
	}	
		
	@Override
	public void delete(List objList) {	
		sqlSession.delete("DmndRelateBasis.insert", objList);
	}	


}
