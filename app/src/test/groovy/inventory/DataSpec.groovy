package inventory

import spock.lang.Specification

class DataSpec extends Specification {
	
	def "check if data file is created"() {
		
		setup:
		def path = "src/test/resources/data.txt"
		def data = new Data(path)
		File file = new File(path)
		
		expect:
		file.exists() == true
	}
}
