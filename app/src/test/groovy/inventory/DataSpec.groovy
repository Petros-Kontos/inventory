package inventory

import spock.lang.Specification

class DataSpec extends Specification {
	
	def path = "src/test/resources/data.txt"
	def data = new Data(path)
	def file = new File(path)
	
	def "check data file creation"() {
		expect: "data file has been created"
		file.exists() == true
	}
	
	def "check data file deletion"() {
		setup: "delete the data file"
		file.delete()
		
		expect: "data file has been deleted"
		file.exists() == false
	}
}
