package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.Err_typeVO;
import com.spring.dto.ThermalVO;

public class Err_typeDAOImpl implements Err_typeDAO{

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Err_typeVO> selectSearchErr_typeList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Err_typeVO selectErr_typeByErr_type_num(String err_type_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertErr_type(Err_typeVO err_type) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateErr_type(Err_typeVO err_type_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteErr_type(String err_type_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
