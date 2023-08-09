package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import com.spring.dto.CctvVO;

public interface CctvDAO {

	public List<CctvVO> selectSearchCctvList()throws SQLException;
	public CctvVO selectCctvByCctv_num(String cctv_num)throws SQLException;
	
	public void insertCctv(CctvVO cctv) throws SQLException;
	
	public void updateCctv(CctvVO cctv_num) throws SQLException;
	
	public void deleteCctv(String cctv_num) throws SQLException;

}
