package com.Damera.cFactory;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	public static HikariDataSource ds = null;
	
	public static Connection provideConnection() throws Exception {
		if(ds == null) {
		FileInputStream fis = new FileInputStream(new File("D:\\19-JFSD\\Adv Java\\Servlets Workspace\\03-InsertDBServlet\\src\\db.properties"));
		
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("db.url");
		String username = p.getProperty("db.username");
		String password = p.getProperty("db.password");
		String driver = p.getProperty("db.driver");
			
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		config.setDriverClassName(driver);
		
		config.setMaximumPoolSize(20);
		config.setMinimumIdle(5);
		
		ds = new HikariDataSource(config);
		}
		return ds.getConnection();
	}

}
