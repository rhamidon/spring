package com.riyaz.spring.propertyplaceholder;

public class DataDAO {
	private String dbServer;

	public DataDAO(String dbServer) {
		super();
		this.dbServer = dbServer;
	}

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}
}
