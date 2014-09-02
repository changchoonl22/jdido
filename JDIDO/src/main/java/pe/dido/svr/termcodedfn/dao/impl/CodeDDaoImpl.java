package pe.dido.svr.termcodedfn.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.dido.svr.termcodedfn.dao.CodeDDao;
import pe.dido.svr.termcodedfn.model.CodeD;

@Repository("codeDDao")
public class CodeDDaoImpl implements CodeDDao {
	private static final Logger logger = LoggerFactory.getLogger(CodeDDaoImpl.class);

	@Autowired
	private SqlSession sqlSession;

	@Override
	public CodeD findById(HashMap searchVo) {
		return sqlSession.selectOne("codeD.findById",searchVo);
	}

	@Override
	public List<CodeD> findList(){//HashMap searchVo) {
		return sqlSession.selectList("codeD.findList");//,searchVo);
	}

	@Override
	public void saveList(List objList) {
		sqlSession.insert("codeD.insert", objList);
	}

}
