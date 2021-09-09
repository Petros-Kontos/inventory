package inventory

import spock.lang.Specification

class DataFileTest extends Specification {
	
	def "file contents match constructor input"() {
		
		setup:
		def file = new File("inventory.txt")
		def dataFile = new DataFile(file.text)
		
		def name = "guitar"
		def serialNo = "skfh58eHGt"
		def value = 49.99
		def item = new Item(name, serialNo, value)
		
		expect:
		dataFile.text == name + "," + serialNo + "," + value
	}
}
