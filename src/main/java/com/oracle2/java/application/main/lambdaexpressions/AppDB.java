package com.oracle2.java.application.main.lambdaexpressions;

import java.util.Collections;
import java.util.List;

public class AppDB {

	public static void main(String[] args) {
		DataBaseManager db = new DataBaseManager();
		db.setSelector(AppDB::selectUsers);
		db.selectTop(10);
		db.setSelector(AppDB::selectOrder);
		db.selectTop(5);
	}
	
	public static List<Object> selectUsers(int n) {		
		return Collections.emptyList();
	}	
	public static List<Object> selectOrder(int n) {		
		return Collections.emptyList();
	}
}

class DataBaseManager implements ISelector {
	ISelector sel;	
	public void setSelector(ISelector s) { this.sel = s; }	
	public List<Object> selectTop(int n) { return sel.selectTop(n); }
}

interface ISelector {
	List<Object> selectTop(int n);
}
