package inventory;

import java.io.FileWriter;


public class Item {
	
	private String name;
	private String serialNo;
	private double value;
	
	public Item(String name, String serialNo, double value) {
		
		this.name = name;
		this.serialNo = serialNo;
		this.value = value;
	     
		try {
	       FileWriter output = new FileWriter("inventory.txt", true);
	       output.write(name + "," + serialNo + "," + value + '\n');
	       output.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }
	}
	
	public String getName() {
		return name;
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	
	public double getValue() {
		return value;
	}
}
