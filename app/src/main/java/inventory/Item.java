package inventory;

/**
 * The item class is the core abstraction of the inventory app.
 * An item's properties are its name, serial number and price (value).
 */
public class Item {

	private String name;
	private String serialNo;
	private double value;

	/**
	 * Creates an item; all item properties must be provided.
	 * 
	 * @param name The item's name
	 * @param serialNo The item's serial number
	 * @param value The item's price
	 */
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
