package com.mashensoft.bridge;

public class DriverManager {
	Driver driver;
	
	public DriverManager(Driver driver) {
		this.driver = driver;
	}

	public Connection getConnection(){
		return driver.getConnection();
	}
}
