package com.Damera.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Damera.DTO.EmployeeDTO;
import com.Damera.connectionfactory.ConnectionFactory;

public class EmployeeDAO {
	
	private static final String INSERT_SQL = "INSERT INTO EMPLOYEE(emp_name,emp_email,gender,dept,exp) values(?,?,?,?,?)";
	
	public boolean saveEmployee(EmployeeDTO dto) throws Exception {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
		pstmt.setString(1,dto.getEname());
		pstmt.setString(2, dto.getEmail());
		pstmt.setString(3, dto.getGender());
		pstmt.setString(4, dto.getDept());
		pstmt.setInt(5, dto.getExp());
		
		int count = pstmt.executeUpdate();
		
		return count > 0;
	}
	
	public List<EmployeeDTO> retrieveEmployee(EmployeeDTO dto) throws Exception{
		List<EmployeeDTO> lstOfEmp = new ArrayList<>();
		StringBuilder sb = new StringBuilder("select * from employee where 1=1");
		
		if(dto.getDept() != null && dto.getDept().length() != 0) {
			sb.append(" and dept = '" + dto.getDept() +"'");
		}
		if(dto.getGender() != null && dto.getGender().length() != 0) {
			sb.append(" and gender = '" +dto.getGender()+"'");
		}
		if(dto.getExp() != null) {
			sb.append(" and exp = " + dto.getExp());
		}
		String s = String .valueOf(sb);
		Connection conn = ConnectionFactory.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(s);
		while(rs.next()) {
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEid(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setGender(rs.getString(4));
			emp.setDept(rs.getString(5));
			emp.setExp(rs.getInt(6));
			lstOfEmp.add(emp);
		}
		return lstOfEmp;
	}

}
