package com.Damera.Dao;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Damera.ConnectionFactory.ConnectionFactory;
import com.Damera.Dto.RecordsDTO;

public class RecordsDAO {

	public boolean saveRecord(RecordsDTO dto) throws IOException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(" insert into records(user_name,user_email,user_phno) values(?,?,?);");
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getEmail());
		pstmt.setLong(3, dto.getPhone());
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}
	
	public List<RecordsDTO> retrieveRecords() throws IOException, SQLException{
		List<RecordsDTO> lstOfDto = new ArrayList<>();
		Connection conn = ConnectionFactory.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from records");
		while(rs.next()) {
			RecordsDTO dto = new RecordsDTO(); 
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setEmail(rs.getString(3));
			dto.setPhone(rs.getInt(4));
			lstOfDto.add(dto);
		}
		return lstOfDto;
	}
	
	public RecordsDTO getRecordById(int id) throws IOException, SQLException {
		RecordsDTO dto = new RecordsDTO();
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select * from records where user_id = ?");
		pstmt.setInt(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setEmail(rs.getString(3));
			dto.setPhone(rs.getLong(4));
		}
		
		return dto;
	}
	
	public boolean updateRecord(RecordsDTO dto) throws IOException, SQLException {
		String updateSQL = "update records set user_name = ? , user_email = ? , user_phno = ? where user_id = ?";
		Connection conn = ConnectionFactory.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement(updateSQL);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getEmail());
		pstmt.setLong(3, dto.getPhone());
		pstmt.setInt(4, dto.getId());
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}
	
	public boolean deleteRecord(int id) throws IOException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("delete from records where user_id = ?");
		pstmt.setInt(1, id);
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}
	
}
