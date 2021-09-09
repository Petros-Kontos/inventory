package inventory

import spock.lang.Specification

class ItemTest extends Specification {
	
	def "file contents match constructor arguments"() {
		
		given:
		def name = "guitar"
		def serialNo = "skfh58eHGt"
		def value = 49.99
		def item = new Item(name, serialNo, value)
		
		def file = new File("inventory.txt")
		def dataFile = new DataFile(file.text)
		
		def detectionFlag = false;
		
//		expect:
//		
//		file.each {
//			if (it == name + "," + serialNo + "," + value) {
//				println int
//				return true
//			}
//		}
		
//		when:
//		file.each {
//			line -> if ("$line" == name + "," + serialNo + "," + value) {		
//				detectionFlag = true
//			}
//		}
//		
//		then:
//		detectionFlag == true;
		
		expect:
		dataFile.text == name + "," + serialNo + "," + value + '\n'
	}
}
