package inventory;

import java.io.IOException;

public class StorageInternalFileCreationError extends RuntimeException {

	public StorageInternalFileCreationError(IOException e) {
		super(e);
	}

}
