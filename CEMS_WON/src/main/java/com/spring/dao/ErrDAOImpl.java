package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.ErrVO;
import com.spring.dto.ThermalVO;

public class ErrDAOImpl implements ErrDAO{

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<ErrVO> selectSearchErrList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ErrVO selectErrByErr_num(String err_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertErr(ErrVO err) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateErr(ErrVO err_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteErr(String err_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
}
