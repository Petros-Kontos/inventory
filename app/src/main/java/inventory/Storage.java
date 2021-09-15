package inventory;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Storage {
	
	//TODO document public API

	public Storage(String path) throws IOException {
		File file = new File(path);

		try {
			file.createNewFile();
		}
		catch (IOException e) {
			throw new StorageInternalFileCreationError(e);
		}
	}
	
	public void append(String name, String serialNo, double value, String path) throws IOException {
		FileWriter fw = new FileWriter(path);
		fw.append(name + "," + serialNo + "," + value + '\n');
		fw.close();
	}
	
	public String read(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		String data = scanner.nextLine();
		scanner.close();
		return data;
	}
}


