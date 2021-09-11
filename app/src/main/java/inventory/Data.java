package inventory;

import java.io.File;
import java.io.IOException;

public class Data {
	
	public Data(String path) {
		
		File file = new File(path);
		
		try {
			file.createNewFile();
		}
		catch (IOException e) {  
			e.printStackTrace();
		}
	}
}
