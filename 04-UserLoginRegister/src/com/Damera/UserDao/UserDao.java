package com.Damera.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Damera.connection.ConnectionFactory;
import com.Damera.dto.UserDto;

public class UserDao {
	
	public boolean saveUser(UserDto dto) throws Exception {
		Connection con = ConnectionFactory.provideConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into users values(?,?,?,?,?,?)");
		pstmt.setString(1, dto.getFirstname());
		pstmt.setString(2, dto.getLastname());
		pstmt.setString(3, dto.getEmail());
		pstmt.setString(4, dto.getPassword());
		pstmt.setString(5, dto.getGender());
		pstmt.setString(6, dto.getRole());
		
		int count = pstmt.executeUpdate();
		
		return count > 0;
	}
	
	public String retriveUser(String email,String password) throws Exception {
		Connection con = ConnectionFactory.provideConnection();
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from users where userEmail = '" +email + "' and userPassword = '" + password+"'");
		
		if(rs.next()) {
			return rs.getString(6);
		}
		else {
		    return "User not found!!!!";
		}
	}

}
