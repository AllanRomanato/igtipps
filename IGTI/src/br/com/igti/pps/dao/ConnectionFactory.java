package br.com.igti.pps.dao;

import java.sql.Connection;

public class ConnectionFactory {
	public static Connection getConnectionJdbc() {
		Connection conn = null;
		System.out.println("Acessando a Connection Factory");
		return conn;
	}
}
