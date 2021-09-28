package inventory

import java.awt.image.ImagingOpException

import java.io.File;
import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Specification

class StorageSpec extends Specification {

	static final String NON_EXISTING_PATH = 'src/test/resources/nonExistingFile.txt'
	static final String EXISTING_PATH = 'src/test/resources/existingFile.txt'
	static final File file = new File(EXISTING_PATH)

	def 'a Storage object creates a file on disk if it does not exist'() {
		when: 'creating a new Storage for a new file path'
		Storage storage  = new Storage(NON_EXISTING_PATH)

		then: 'the corresponding file to the file path is created.'
		(new File(NON_EXISTING_PATH)).exists() == true
	}

	def 'a Storage object is instantiated with a path to an existing file and does not overwrite the file'() {
		when: 'instantiating a new storage object that is given a path to an existing file'
		def storage = new Storage(EXISTING_PATH)

		then: 'the content of the existing file has not been overwritten'
		new Scanner(file).nextLine() == "Hello World"
	}

	def 'a problem occurs when creating a Storage object'() {
		given: 'an invalid path'
		String invalidPath = "a/b/c/d.txt"

		when: 'creating a new storage object'
		new Storage(invalidPath)

		then: 'an exception in thrown'
		thrown(IOException.class)
	}

	def 'append item in csv format to new file'() {
		given: 'an item'
		Item item = new Item("Buddha statue", "kdhfo8374HLKD", 69.99)

		and: 'a Storage object linked to a new file'
		Storage storage  = new Storage(NON_EXISTING_PATH)

		when: 'appending the item to storage'
		storage.append(item)

		then: 'the file linked to the storage contains this item in csv format'
		new File(NON_EXISTING_PATH).readLines() == ["Buddha statue,kdhfo8374HLKD,69.99"]
	}

	def 'append two items in csv format to new file'() {
		given: 'two items'
		Item item_1 = new Item("A", "a", 4.95)
		Item item_2 = new Item("B", "b", 9.95)
		
		and: 'a Storage object linked to a new file'
		Storage storage  = new Storage(NON_EXISTING_PATH)

		when: 'appending the items to storage'
		storage.append(item_1)
		storage.append(item_2)

		then: 'the file linked to the storage contains this item in csv format'
		new File(NON_EXISTING_PATH).readLines() == ["Buddha statue,kdhfo8374HLKD,69.99",
													"A,a,4.95",
													"B,b,9.95"]
	}

	//TODO read
	
	def cleanupSpec() {
		new File(NON_EXISTING_PATH).delete()
	}


	//Data
	// creates a new file if the file does not exist
	// appends a String (line) representing an item on the file
	// read the file content




}
