package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.StorageVO;

public class StorageDAOImpl implements StorageDAO{

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<StorageVO> selectSearchStorageList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StorageVO selectStorageByStorage_num(String Storage_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertStorage(StorageVO storage) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStorage(StorageVO storage_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteStorage(String storage_num) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}
