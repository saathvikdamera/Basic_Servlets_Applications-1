package com.Damera.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Damera.DTO.UserEduDTO;
import com.Damera.connectionfactory.ConnectionFactory;

public class UserEduDAO {
	
	private static final String INSERT_SQL = "insert into user_edu values (?,?,?,?)";
	
	public boolean saveEdu(UserEduDTO dto) throws Exception{
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
		pstmt.setString(1,dto.getEmail());
		pstmt.setString(2, dto.getHighestQualification());
		pstmt.setInt(3, dto.getPassoutYear());
		pstmt.setInt(4, dto.getPercentage());
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}
	
	public Boolean checkEmail(String email) throws Exception {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select * from user_edu where user_email = ?");
		pstmt.setString(1, email);
		
		ResultSet rs = pstmt.executeQuery();
		
		return rs.next();
	}

}
