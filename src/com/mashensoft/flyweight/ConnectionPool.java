package com.mashensoft.flyweight;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.DriverManager;

public class ConnectionPool {
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";
	private int poolSize = 10;
	private static ConnectionPool instance = null;
	public static synchronized ConnectionPool getConnectionPool(){
		if(instance==null){
			instance = new ConnectionPool();
		}
		return instance;
	}
	private Vector<Connection> pool = new Vector<>(poolSize);
	public int getPoolSize(){
		return pool.size();
	}
	public ConnectionPool() {
		try {
			Class.forName(driverClassName);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < poolSize; i++) {
			try {
				Connection connection = DriverManager.getConnection(url, username, password);
				pool.add(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized Connection getConnection(){
		Connection conn = null;
		if(pool.size()>1){
			conn = pool.get(0);
			pool.remove(0);
		}
		return conn;
	}
	public synchronized void releaseConnection(Connection conn){
		pool.add(conn);
	}
	public void destroyPool(){
		for(Connection conn:pool){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
