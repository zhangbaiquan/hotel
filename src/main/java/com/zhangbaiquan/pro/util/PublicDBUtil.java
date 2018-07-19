package com.zhangbaiquan.pro.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PublicDBUtil {
	public final static String DRIVER;
	public final static String URL;
	public final static String USERNAME;
	public final static String PASSWORD;
	static {
		PropertiesUtil util=new PropertiesUtil();
		String str1="";
		String str2="";
		String str3="";
		String str4="";
		try {
			Properties ps=util.getProperties("public.properties");
			str1=ps.getProperty("driver");
			str2=ps.getProperty("url");
			str3=ps.getProperty("username");
			str4=ps.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DRIVER=str1;
		URL=str2;
		USERNAME=str3;
		PASSWORD=str4;
	}
	public static Connection getConnection() {
		Connection conn=null;		
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void release(ResultSet rs,Statement stm,Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stm!=null) {
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
