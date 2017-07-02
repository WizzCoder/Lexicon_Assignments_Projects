package src.com.lexicon.finalversion;

import java.util.ArrayList;
import java.util.Scanner;

import src.com.lexicon.finalversion.errata.NullPointerException;
import src.com.lexicon.finalversion.errata.ToDoException;


@SuppressWarnings("unused")
public class Aided {

	
	// = ToDoInit.todoList;
	static ArrayList<String> todoList;  // =  ToDoItemList.todoList;
	public static boolean myExit = false;
	static Scanner sc = new Scanner(System.in);
	
	
	public Aided()
	{
		// Small constructor
		//
	}
		
	public static void AddToTheListToDoItem(String task)
	{
		todoList.add(task);
		System.out.println("Todolistan:");
		System.out.println("Starting ToDo-Class point");
		int i=0;
		for (String t: todoList)
		{
			System.out.print(i);
			System.out.print(","+"  ");
			System.out.print(t);
			System.out.print("\n");			
			i++;
		}
		
		System.out.println("Ending point\n");
		System.out.println("-----------");
			
	}
			
	public static void pluppeMenu(){
		System.out.println("Inside pluppeMenu");
		System.out.println("qwerty: QWERTY: QwERty");
		
		System.out.println("Size: " + todoList.size());
		// never get here
		//System.exit(0);
		System.out.println("\n");
		// printToDoListAllItems();
		System.out.println("Size pa todoList: " + todoList.size());
	}	
		
	public static int getTodoListSize(){
		return todoList.size();
	}

	public static void addTodoItems(String toDoItems) throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();
		try
		{
			todoList.add(toDoItems);
		}
		catch (Exception e)
		{
				e.getMessage();
				
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}

	public static void addTodoItem() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();
		

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}

	public static void actAdd_ToDoItem() // throws ToDoException
	{
	
	String addTodoItemString = "";
	String actCommand = "";
	
	actCommand = ""; //uiLogic_command;
	
	System.out.println("ADD:");	
	System.out.println("Du kan nu lägga till en ToDo uppgift\n"
			+ ", skriv in vad du vill:");

	
	
	while (myExit == false)
	{
		
		
	

	
	
	try
	{
		addTodoItemString=MainMenu.checkKeyboard();	
		if (addTodoItemString != null) {todoList.add(MainMenu.addItemAndDate(addTodoItemString));}
			while (true)
			{
				System.out.print(addTodoItemString + ": ");
				System.out.println("är lagt till i listan.");
				System.out.println("Vill du lägga in en till Item.");
				String retKeyboardValue = sc.nextLine();
				if (retKeyboardValue == "N")
				{
					System.out.println("Tillbaka till huvudmenyn");
					
				}	
				else
				{ 
					myExit = true;
					System.out.println("Ett varv till:");
					break;

				}
				
		
			}
	
	
	
	}
	catch (Exception e)
	{
		e.getMessage();
	}
	
	}
	
}
	
	public static void actList_TodoItems() throws ToDoException
	{

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(""+addTodoItemString+"");
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}
	public static void actMark_TodoItems() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();
		try
		{
		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}
	public static void actUnMarkTodoItem() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}

	public static void actRemove_TodoItems() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}
	public static void actRemoveAll_TodoItems() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}
	public static void actSearch_TodoItems() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}
	public static void actEdit_TodoItems() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}
	public static void addTodoItem22() throws ToDoException
	{
//			int nextIndex=0;
//			nextIndex = getTodoListSize();

		String addTodoItemString = "";
		addTodoItemString=MainMenu.checkKeyboard();
		
		try
		{
			todoList.add(addTodoItemString);
		}
		catch (Exception e)
		{
			throw new ToDoException();
		}
		
		// todoList.add(nextIndex, toDoItems);
	}

	/**
	 * @return the todoList
	 */
	public static ArrayList<String> getTodoList() {
		return todoList;
	}

	/**
	 * @param todoList the todoList to set
	 */
	public static void setTodoList(ArrayList<String> todoList) {
		Aided.todoList = todoList;
	}

	public static void printToDoListAllItems(){
		System.out.println("Starting ToDo-Class point");
		int i=0;
		for (String s: Aided.todoList){
			System.out.print(i);
			System.out.print(","+"  ");
			System.out.print(s);
			System.out.print("\n");			
			i++;
		}
		
		System.out.println("Ending point\n");
		
	}
		
	public static void execAction(String ul_input) {
		String choice = "";
		choice = ul_input;

		try {
			switch (choice) {
			case "ADD":
				Aided.actAdd_ToDoItem();
				break;
			case "LIST":
				Aided.actList_TodoItems();
				break;
			case "MARK":
				Aided.actMark_TodoItems();
				break;
			case "REMOVE":
				Aided.actRemove_TodoItems();
				break;
			case "REMOVEALL":
				Aided.actRemoveAll_TodoItems();
				break;
			case "SEARCH":
				Aided.actSearch_TodoItems();
				break;
			case "EDIT":
				Aided.actEdit_TodoItems();
				break;
			default:
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	}

