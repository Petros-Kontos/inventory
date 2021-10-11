package inventory;

public class CLI {
	
	private static String greeting = "Welcome to the inventory app!";
	private static String prompt = "Please enter the details of an item:";
	private static String namePrompt = "Please enter an item name:";
	private static String serialNoPrompt = "Please enter an item serial number:";
	private static String valuePrompt = "Please enter the item value:";
	
	public boolean validate(String name, String serialNo, String value) {
		return true;
	}
	
	public boolean validateName(String name) {
		return true;
	}
	
	public boolean validateSerialNo(String serialNo) {
		return true;
	}
	
	public boolean validateValue(double value) {
		return true;
	}
	
	public double convertValue(String rawValue) {
		double value = Double.parseDouble(rawValue);
		return value;
	}
	
	public static String getGreeting() {
		return greeting; 
	}
	
	public static String getPrompt() {
		return prompt;
	}
	
	public static String getNamePrompt() {
		return namePrompt;
	}
	
	public static String getSerialNoPrompt() {
		return serialNoPrompt;
	}
	
	public static String getValuePrompt() {
		return valuePrompt;
	}
}
