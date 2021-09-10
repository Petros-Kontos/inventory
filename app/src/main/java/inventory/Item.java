package inventory;

public class Item {
	
	private String name;
	private String serialNo;
	private double value;
	
	public Item(String name, String serialNo, double value) {
		this.name = name;
		this.serialNo = serialNo;
		this.value = value;
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
