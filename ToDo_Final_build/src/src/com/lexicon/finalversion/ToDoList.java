package src.com.lexicon.finalversion;

import java.util.ArrayList;
import java.util.Date;

public class ToDoList {
	
	static ArrayList<String> todoList =  new ArrayList<>();
	Date timeStamp = new Date();
	
	
	public ToDoList()
	{
		//Date timeStamp = new Date();
	//	String index = "1";
		String testItem1 = "Test";
		String testItem2 = "Data";
		String testItem3 = "stDa";
		String testItem4 = "Da";
		String testItem5 = "tDat";
		todoList = new ArrayList<>();
		todoList.add(testItem1 + ","+ "\t[ " + timeStamp + "]");
		todoList.add(testItem2 + ","+ "\t[ " + timeStamp + "]");
		todoList.add(testItem3 + ","+ "\t[ " + timeStamp + "]");
		todoList.add(testItem4 + ","+ "\t[ " + timeStamp + "]");
		todoList.add(testItem5 + ","+ "\t[ " + timeStamp + "]");
		
	}

	
	
}
