package com.Damera.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Damera.DTO.UserAddressDTO;
import com.Damera.connectionfactory.ConnectionFactory;

public class UserAddressDAO {
	
	private static final String INSERT_SQL = "insert into user_address values (?,?,?,?)";
	
	public boolean saveAddress(UserAddressDTO dto) throws Exception{
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
		pstmt.setString(1,dto.getEmail());
		pstmt.setString(2, dto.getCity());
		pstmt.setString(3, dto.getState());
		pstmt.setString(4, dto.getCountry());
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}
	
	public Boolean checkEmail(String email) throws Exception {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select * from user_address where user_email = ?");
		pstmt.setString(1, email);
		
		ResultSet rs = pstmt.executeQuery();
		
		return rs.next();
	}

}
