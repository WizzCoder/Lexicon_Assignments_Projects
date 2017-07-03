package com.lexicon.finalversion;

import java.util.Date;

public class ToDoItem {

	public Date today;
	//String name = null;
	boolean status = false;
	
	private String title= null;
	
	private String name = null;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name + " " + title;
	}
	

	
}
