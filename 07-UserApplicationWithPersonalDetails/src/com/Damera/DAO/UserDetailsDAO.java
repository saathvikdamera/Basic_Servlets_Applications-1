package com.Damera.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Damera.DTO.UserDetailsDTO;
import com.Damera.connectionfactory.ConnectionFactory;

public class UserDetailsDAO {
	
	private static final String INSERT_SQL = "insert into user_details values (?,?,?,?)";
	
	public boolean saveDetails(UserDetailsDTO dto) throws Exception{
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
		pstmt.setString(1,dto.getEmail());
		pstmt.setString(2, dto.getFatherName());
		pstmt.setString(3, dto.getMotherName());
		pstmt.setInt(4, dto.getNoOfSiblings());
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}
	
	public Boolean checkEmail(String email) throws Exception {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select * from user_details where user_email = ?");
		pstmt.setString(1, email);
		
		ResultSet rs = pstmt.executeQuery();
		
		return rs.next();
	}

}
