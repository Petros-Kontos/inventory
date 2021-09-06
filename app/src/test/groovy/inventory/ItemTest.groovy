package inventory

import spock.lang.Specification

class ItemTest extends Specification {
	
	def "name, serial no and value properties exist"() {
		
		setup:
		def item = new Item("guitar", "skfh58eHGt", 49.99)
		
		expect:
		item.name == "guitar"
		item.serialNo == "skfh58eHGt"
		item.value == 49.99
	}
}
