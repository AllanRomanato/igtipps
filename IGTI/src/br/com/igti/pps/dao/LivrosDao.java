package br.com.igti.pps.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.igti.pps.singleton.BooksLock;

public class LivrosDao {
	private Connection conn;
	private BooksLock lock = BooksLock.getInstance();
	public LivrosDao() {
		this.conn = ConnectionFactory.getConnectionJdbc();
	}
	
	public List<String> getListaDeLivros(){
		return new ArrayList<>();
	}
	
	public void checkBook(int id) {
		//Application lock
		if(!lock.isLock()) {
			lock.setLock(true);
			//Data processing
		}else {
			System.out.println("O Livro esta reservado");
		}
	}
	
	public void close() {
		try {
			this.conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
