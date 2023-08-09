package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.ThermalVO;

public class ThermalDAOImpl implements ThermalDAO{

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<ThermalVO> selectSearchThermalList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ThermalVO selectThermalByThermal_num(String thermal_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertThermal(ThermalVO thermal) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateThermal(ThermalVO thermal_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteThermal(String thermal_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
