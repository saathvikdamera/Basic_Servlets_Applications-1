package com.Damera.ConnectionFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	
	private static HikariDataSource ds;
	
	public static Connection getConnection() throws IOException, SQLException {
		if(ds == null) {
		FileInputStream fis = new FileInputStream(new File("D:\\19-JFSD\\Adv Java\\Servlets Workspace\\05-ShowRecords\\src\\db.properties"));
		
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("db.url");
		String uname = p.getProperty("db.username");
		String pwd = p.getProperty("db.password");
		String driver = p.getProperty("db.driver");
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(uname);
		config.setPassword(pwd);
		config.setDriverClassName(driver);
		
		ds = new HikariDataSource(config);
		}
		return ds.getConnection();
	}

}
