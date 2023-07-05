package com.Damera.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Damera.BookDto.BookDto;
import com.Damera.cFactory.ConnectionFactory;

public class BookDao {
	
	public boolean saveBook(BookDto dto) throws Exception {
		
		Connection con = ConnectionFactory.provideConnection();
		
		PreparedStatement pstmt = con.prepareStatement("insert into books values(?,?,?)");
		pstmt.setInt(1, dto.getBookId());
		pstmt.setString(2, dto.getBookName());
		pstmt.setDouble(3, dto.getPrice());
		
		int count = pstmt.executeUpdate();
		
		return count > 0;
		
	}

}
