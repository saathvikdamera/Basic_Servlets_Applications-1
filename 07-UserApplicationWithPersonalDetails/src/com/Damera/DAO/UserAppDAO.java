package com.Damera.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Damera.DTO.UserAppDTO;
import com.Damera.connectionfactory.ConnectionFactory;

public class UserAppDAO {
	
	private static final String INSERT_SQL = "insert into user_app values (?,?,?,?,?)";
	
	public boolean saveUser(UserAppDTO dto) throws Exception{
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
		pstmt.setString(1,dto.getfName());
		pstmt.setString(2, dto.getlName());
		pstmt.setString(3, dto.getEmail());
		pstmt.setString(4, dto.getPwd());
		pstmt.setString(5, dto.getGender());
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}
	
	public boolean retrieveUser(String email,String pwd) throws Exception {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select * from user_app where email = ? and pwd = ?");
		pstmt.setString(1, email);
		pstmt.setString(2, pwd);
		
		ResultSet rs = pstmt.executeQuery();
		
		return rs.next();
	}
	
	public String checkEmail(String email) throws Exception {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select * from user_app where email = ?");
		pstmt.setString(1, email);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			return rs.getString("email");
		}else {
			return "Email doesn't exists";
		}
	}
	
	public boolean updatePassword(String email,String nPwd) throws Exception {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("update user_app set pwd = ? where email = ? ");
		pstmt.setString(1, nPwd);
		pstmt.setString(2, email);
		
		int count = pstmt.executeUpdate();
		
		return count>0;
	}

}
