package inventory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(CLI.getGreeting());
		
		System.out.println(CLI.getNamePrompt());
		String name = in.nextLine();
		
		System.out.println(CLI.getSerialNoPrompt());
		String serialNo = in.nextLine();
		
		System.out.println(CLI.getValuePrompt());
		String valueRaw = in.nextLine();
		
		double value = Double.parseDouble(valueRaw);
		
		Item item = new Item(name, serialNo, value);
		try {
			Storage storage = new Storage("storage.txt");
			storage.append(item);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("The storage file was not found.");
		}
		
		in.close();
		
		System.out.println("The item's name is: " + item.getName());
		System.out.println("The item's serial number is: " + item.getSerialNo());
		System.out.println("The item's value is: " + item.getValue());
		try {
			System.out.println(Storage.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
