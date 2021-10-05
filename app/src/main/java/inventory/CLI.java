package inventory;

public class CLI {
	
	private String greeting = "Welcome to the inventory app!";
	private String prompt = "Please enter the details of an item:";
	private String namePrompt = "Please enter an item name:";
	private String serialNoPrompt = "Please enter an item serial number:";
	private String valuePrompt = "Please enter the item value:";
	
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
	
	public String getGreeting() {
		return greeting; 
	}
	
	public String getPrompt() {
		return prompt;
	}
	
	public String getNamePrompt() {
		return namePrompt;
	}
	
	public String getSerialNoPrompt() {
		return serialNoPrompt;
	}
	
	public String getValuePrompt() {
		return valuePrompt;
	}
}
