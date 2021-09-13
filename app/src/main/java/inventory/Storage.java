package inventory;

import java.io.File;
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
}


