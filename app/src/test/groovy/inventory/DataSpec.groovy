package inventory

import spock.lang.Specification

class DataSpec extends Specification {
	
	def "check if data file is created"() {
		
		setup:
		def data = new Data()
		File file = new File("src/test/resources/data.txt")
		
		expect:
		file.exists() == true
	}
}
