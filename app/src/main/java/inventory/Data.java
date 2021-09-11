package inventory;

import java.io.File;
import java.io.IOException;

public class Data {

	public Data() {
		File file = new File("src/test/resources/data.txt");
		try {
			file.createNewFile();
		}
		catch (IOException e) {  
		e.printStackTrace();
		}         
	}
}
