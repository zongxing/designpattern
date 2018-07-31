package com.mashensoft.bridge;

public class MysqlDriver implements Driver{
	@Override
	public Connection getConnection() {
		return new Connection();
	}
}
