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

	def 'a Storage object is instantiated and given a path to a file that already exists'() {
		given: 'an existing storage file'
		file.createNewFile()
		def name = "Buddha statue"
		def serialNo = "kdhfo8374HLKD"
		def value = 69.99
		new FileWriter(EXISTING_PATH, true).with {
			write(name + "," + serialNo + "," + value + '\n')
			flush()
		}
		when:
		def storage = new Storage(EXISTING_PATH)
		then:
		new Scanner(file).nextLine() == name + "," + serialNo + "," + value
	}

	def 'a problem occurs when creating a Storage object'() {
		given: 'an invalid path'
		String invalidPath = "a/b/c/d.txt"

		when: 'creating a new storage object'
		new Storage(invalidPath)

		then: 'an exception in thrown'
		thrown(IOException.class)
	}

	def 'append 1 line/item to a new file'() {
		given: 'a new storage object'
		def name = "Buddha statue"
		def serialNo = "kdhfo8374HLKD"
		def value = 69.99
		Storage storage  = new Storage(NON_EXISTING_PATH)

		when: 'appending the item properties as a new line'
		storage.append(name, serialNo, value)

		then: 'the new line is read from the file'
		storage.read() == name + "," + serialNo + "," + value
	}

	def cleanupSpec() {
		new File(NON_EXISTING_PATH).delete()
		file.delete()
	}


	//Data
	// creates a new file if the file does not exist
	// appends a String (line) representing an item on the file
	// read the file content




}
