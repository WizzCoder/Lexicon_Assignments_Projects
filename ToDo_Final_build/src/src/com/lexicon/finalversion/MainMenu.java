package src.com.lexicon.finalversion;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import src.com.lexicon.finalversion.ToDoList;
import src.com.lexicon.finalversion.ui.UiMenu;

public class MainMenu {

	static Scanner scanCode =  new Scanner(System.in);
	
	
	
	
	
	public static void siffranEtt() {
		System.out.println("1");
		printToDoListAllItems();
		// Works like a charm
		// ToDoList.todoList.add(addItemAndDate("Heppa"));

		// action REMOVE
		printToDoListAllItems();

		UiMenu.drawMainMenu();
		mainLoop();
		
		
		/*
		 * ADD LIST MARK REMOVE REMOVEALL SEARCH EDIT
		 */

	}

	/*
	 * ADD LIST MARK REMOVE REMOVEALL SEARCH EDIT
	 */

	public static void mainLoop() // throws InputMismatchException
	{
		
		while (true)
		{

			//	String returnValue = checkKeyboard();
			try
			{	
				int menuNumber = scanCode.nextInt();

				
				switch (menuNumber) 
				{	
					case 1: Aided.execAction("ADD");
					break;
				
					case 2:	Aided.execAction("LIST");
					break;

					default:  System.out.println("Not a valid number\n1 and 2 and 0 for exit only");
					break;
				}
			}
			catch (InputMismatchException e1)
			{
				e1.printStackTrace();
				// throw new InputMismatchException();
			}	


		}

	}

	// pretty big here too
	// Big Loop here

	@SuppressWarnings("resource")
	public static String checkKeyboard() throws NoSuchElementException, IllegalStateException {
		Scanner ScanCode;
		// System.out.println("checkKeyboard");
		boolean errCheckString = false;
		String keyInputValue = "";
		ScanCode = new Scanner(System.in);
		while (true) {
			while (!errCheckString) {
				try {
					keyInputValue = ScanCode.nextLine();
					errCheckString = true;

					return keyInputValue;

				} catch (NoSuchElementException e1) // NULL
				{
					throw new NoSuchElementException();
				}

				catch (IllegalStateException e2) {
					throw new IllegalStateException();
				}

				catch (Exception e0) {
					e0.printStackTrace();
					e0.getMessage();
					break;
				}

			}
		}
	}

	public static void printToDoListAllItems() {
		System.out.println("Starting ToDo-Class point");
		int i = 0;
		for (String s : ToDoList.todoList) {
			System.out.print(i);
			System.out.print("," + "  ");
			System.out.print(s);
			System.out.print("\n");
			i++;
		}

		System.out.println("Ending point\n");

	}

	public static String timeStamp() { // String timeStamp = new
		// SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String timeStamp = "";
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return timeStamp;
	}

	public static String addItemAndDate(String Item) {
		String retString;
		Date timeStamp = new Date();
		retString = Item + ",[" + timeStamp.toString() + "] ";
		return retString;
	}
}
