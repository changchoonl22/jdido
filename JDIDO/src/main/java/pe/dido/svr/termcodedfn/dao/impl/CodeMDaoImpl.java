package pe.dido.svr.termcodedfn.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiconsoft.dashboard.dao.impl.PersonDAOImpl;

import pe.dido.svr.termcodedfn.dao.CodeMDao;
import pe.dido.svr.termcodedfn.model.CodeM;

@Repository
public class CodeMDaoImpl implements CodeMDao {
	private static final Logger logger = LoggerFactory.getLogger(CodeMDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public CodeM findById(HashMap searchVo) {
		return sqlSession.selectOne("codeM.findById",searchVo);
	}

	@Override
	public List<CodeM> findList(){//HashMap searchVo) {
		return sqlSession.selectList("codeM.findList");//,searchVo);
	}

	@Override
	public void saveList(List objList) {
		sqlSession.insert("codeM.insert", objList);
	}

}
