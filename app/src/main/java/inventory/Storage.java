package inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 * The Storage class abstracts the process of saving the inventory items between sessions.
 */
public class Storage {

	private String path;

	/**
	 * Creates a storage object, associated to a file path.
	 * 
	 * @param path The path to the storage file. Can be either an existing or a new file.
	 * @throws IOException if there is a problem with the file path
	 */
	public Storage(String path) throws IOException {
		File file = new File(path);
		this.path = path;
		file.createNewFile();
	}

	/**
	 * Saves an item in CSV format to a file.
	 *
	 * @param item the item to be stored
	 * @throws IOException if a problem occurs during the save process
	 */
	public void append(Item item) throws IOException {
		FileWriter fw = new FileWriter(path, true);
		fw.append(itemToCsv(item));
		fw.close();
	}

	private String itemToCsv(Item item) {
//		return String.format("%s,%s,%s,%n", item.getName(), item.getSerialNo(), item.getValue(), '\n');
		return item.getName() + "," + item.getSerialNo() + "," + item.getValue() + '\n';
	}

	/**
	 * Reads the storage file and returns the lines as a list of strings.
	 * 
	 * @param array An empty string array
	 * @throws FileNotFoundException when the file is not found
	 */
	public List<String> read(String[] array) throws FileNotFoundException {
		File file = new File(path);
		List<String> lines = new ArrayList<String>(Arrays.asList(array));
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
		scanner.close();
		return lines;
	}
}


