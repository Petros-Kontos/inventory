package inventory;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Storage {

	private String path;

	/**
	 *
	 * @param path
	 * @throws IOException
	 */
	public Storage(String path) throws IOException {
		File file = new File(path);
		this.path = path;
		file.createNewFile();
	}

	/**
	 * Save an item to a CSV format in a file.
	 *
	 * @param item the item to be stored
	 * @throws IOException if a problem occurs during the save process
	 */
	public void append(Item item) throws IOException {
		FileWriter fw = new FileWriter(path);
		fw.append(itemToCsv(item));
		fw.close();
	}

	private String itemToCsv(Item item) {
		return String.format("%s,%s,%s", item.getName(), item.getSerialNo(), item.getValue());
//		return item.getName() + "," + item.getSerialNo() + "," + item.getValue() + '\n';
	}

//	/**
//	 *
//	 * @return
//	 * @throws FileNotFoundException
//	 */
//	public String read() throws FileNotFoundException {
//		File file = new File(path);
//		Scanner scanner = new Scanner(file);
//		String data = scanner.nextLine();
//		scanner.close();
//		return data;
//	}
}


