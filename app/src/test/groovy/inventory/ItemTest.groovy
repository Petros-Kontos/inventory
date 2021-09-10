package inventory

import spock.lang.Specification

class ItemTest extends Specification {
	
	def "name, serial no and value properties exist"() {
		
		setup:
		def name = "guitar"
		def serialNo = "skfh58eHGt"
		def value = 499.99
		def item = new Item(name, serialNo, value)
		
		expect:
		item.name == name
		item.serialNo == serialNo
		item.value == value
	}
}
