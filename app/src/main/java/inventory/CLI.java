package inventory;

public class CLI {
	
	private String greeting = "Welcome to the inventory app!";
	private String prompt = "Please enter the details of an item:";
	private String namePrompt = "Please enter an item name:";
	private String serialNoPrompt = "Please enter an item serial number:";
	private String valuePrompt = "Please enter the item value:";
	
	public boolean validate(String name, String serialNo, double value) {
		return true;
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
