package inventory

import spock.lang.Specification

class ItemTest extends Specification {
	
	def "file contents match constructor arguments"() {
		
		setup: "store some testing values and instantiate an item object with them"
		def name = "guitar"
		def serialNo = "skfh58eHGt"
		def value = 499.99
		def item = new Item(name, serialNo, value)
		
		expect: "check the constructor has initialized the properties correctly"
		item.name == name
		item.serialNo == serialNo
		item.value == value
	}
}
