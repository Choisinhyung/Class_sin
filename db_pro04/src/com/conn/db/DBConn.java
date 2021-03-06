package com.conn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	
	private final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final static String BASE_URL = "jdbc:oracle:thin:@";
	
	private String url_address;
	private Connection conn;
	private Statement stat;
	
	public DBConn(String domain, String port, String serviceName, String username, String password) throws Exception {
		url_address = String.format("%s:%s/%s", domain, port, serviceName);
		this.initConnect(username, password);
	}
	
	public DBConn(String tnsAlias, String walletPath, String username, String password) throws Exception {
		url_address = String.format("%s?TNS_ADMIN=%s", tnsAlias, walletPath);
		this.initConnect(username, password);
	}
	
	private void initConnect(String username, String password) throws Exception {
		// 1. Driver 등록
		Class.forName(DRIVER_NAME);
		
		// 2. DBMS 연결
		conn = DriverManager.getConnection(BASE_URL + url_address, username, password);
		conn.setAutoCommit(false);
		
		// 3. Statement 생성
		stat = conn.createStatement();
	}
	
	public ResultSet sendSelectQuery(String sql) throws Exception {
		ResultSet rs = this.stat.executeQuery(sql);
		return rs;
	}
	
	public int sendUpdateQuery(String sql) throws Exception {
		int rs = this.stat.executeUpdate(sql);
		return rs;
	}
	
	public int sendInsertQuery(String sql) throws Exception {
		int rs = this.stat.executeUpdate(sql);
		return rs;
	}
	
	public int sendDeleteQuery(String sql) throws Exception {
		int rs = this.stat.executeUpdate(sql);
		return rs;
	}
	
	public void commit() throws Exception {
		this.conn.commit();
	}
	
	public void rollback() throws Exception {
		this.conn.rollback();
	}
	
	public void close() throws Exception {
		// 5. 연결 해제
		this.stat.close();
		this.conn.close();
	}

	public static void main(String[] args) throws Exception {
		DBConn myDB = new DBConn("localhost", "1521", "XEPDB1", "puser1", "puser1");
		
		// int rowCount = myDB.sendInsertQuery("INSERT INTO DEPARTMENTS VALUES(280, 'Dept Test', NULL, 1700)");
		// int rowCount = myDB.sendUpdateQuery("UPDATE DEPARTMENTS SET DEPARTMENT_NAME = 'Tester' WHERE DEPARTMENT_ID = 280");
		int rowCount = myDB.sendDeleteQuery("DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID = 280");
		System.out.println(rowCount + " 개 행이 반영되었습니다.");
		
		ResultSet rs = myDB.sendSelectQuery("SELECT * FROM DEPARTMENTS");
		while(rs.next()) {
			System.out.print(rs.getInt("DEPARTMENT_ID") + "\t");
			System.out.print(rs.getString("DEPARTMENT_NAME") + "\t");
			System.out.print(rs.getInt("MANAGER_ID") + "\t");
			System.out.print(rs.getInt("LOCATION_ID") + "\n");
		}
		myDB.commit(); // myDB.rollback();
		
		rs.close();
		myDB.close();
	}

}
