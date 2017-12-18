package br.com.igti.pps.singleton;

public class BooksLock {
	private static BooksLock lock = null;
	
	private boolean isLock = false;
	
	public static BooksLock getInstance() {
		if(lock == null) {
			lock = new BooksLock();
		}
		return lock;
	}
	
	public boolean isLock() {
		return this.isLock;
	}
	
	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}
	
}
