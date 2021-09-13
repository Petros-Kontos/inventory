package inventory

import java.awt.image.ImagingOpException

import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Specification

class StorageSpec extends Specification {

	def path = "src/test/resources/data.txt"
	def data = new Storage(path)
	def file = new File(path)

	static final String NON_EXISTING_PATH = 'src/test/resources/nonExistingFile.txt'

	def 'a Storage object creates a file on disk if it does not exist'() {
		when: 'creating a new Storage for a new file path'
		Storage storage  = new Storage(NON_EXISTING_PATH)

		then: 'the corresponding file to the file path is created.'
		(new File(NON_EXISTING_PATH)).exists() == true
	}

	//TODO write a spec for an existing file

	def 'a problem occurs when creating a Storage object'() {
		given: 'an invalid path'
		String invalidPath = "a/b/c/d.txt"

		when: 'creating a new storage'
		new Storage(invalidPath)

		then: 'an exception in thrown'
		def e = thrown(StorageInternalFileCreationError.class)
		e.message == 'java.io.IOException: No such file or directory'
	}


	@Ignore
	def "append 1 item"() {
		setup:
		def name = "Buddha statue"
		def serialNo = "kdhfo8374HLKD"
		def value = 69.99

		when:
		data.append(name, serialNo, value)

		then:
		data.read() == name + "," + serialNo + "," + value + '\n'
	}

	def cleanupSpec() {
		new File(NON_EXISTING_PATH).delete()
	}


	//Data
	// creates a new file if the file does not exist
	// appends a String (line) representing an item on the file
	// read the file content




}
