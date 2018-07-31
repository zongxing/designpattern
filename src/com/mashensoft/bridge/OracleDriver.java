package com.mashensoft.bridge;

public class OracleDriver implements Driver{
	@Override
	public Connection getConnection() {
		return new Connection();
	}
}
