package inventory

import spock.lang.Specification

class DataSpec extends Specification {
	
	def path = "src/test/resources/data.txt"
	def data = new Data(path)
	def file = new File(path)
	
	def "check if data file is created"() {
		expect:
		file.exists() == true
	}
	
	def "check if data file is deleted"() {
		setup:
		file.delete()
		
		expect:
		file.exists() == false
	}
}
