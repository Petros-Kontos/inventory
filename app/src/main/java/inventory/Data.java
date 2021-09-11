package inventory;

import java.io.File;
import java.io.IOException;

public class Data {

	private String path;
	
	public Data(String path) {
		
		this.path = path;
		
		File file = new File(path);
		try {
			file.createNewFile();
		}
		catch (IOException e) {  
		e.printStackTrace();
		}
	}
}
