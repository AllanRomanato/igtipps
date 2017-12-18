package br.com.igti.pps.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivrosDao {
	private Connection conn;
	public LivrosDao() {
		this.conn = ConnectionFactory.getConnectionJdbc();
	}
	
	public List<String> getListaDeLivros(){
		return new ArrayList<>();
	}
	
	public void close() {
		try {
			this.conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
