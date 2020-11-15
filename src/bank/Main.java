package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 
		 UserInterface ui = new ConsoleUserInterface(myObj);
		 ui.start();
		 

	}

}
