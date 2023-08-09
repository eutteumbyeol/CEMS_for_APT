package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.CctvVO;

public class CctvDAOImpl implements CctvDAO{

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<CctvVO> selectSearchCctvList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CctvVO selectCctvByCctv_num(String cctv_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCctv(CctvVO cctv) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCctv(CctvVO cctv_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCctv(String cctv_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
