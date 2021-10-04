package inventory

import spock.lang.Specification

class CLISpec extends Specification {
	
	def "get greeting"() {
		
		given: "a new CLI object and an expected greeting"
		def CLI = new CLI()
		def expectedGreeting = "Welcome to the inventory app!"
		
		when: 'we get the greeting'
		def actualGreeting = CLI.getGreeting() 
		
		then: 'the actual greeting matches the expected greeting'	
		actualGreeting == expectedGreeting
	}
	
	def "get prompt"() {
		
		given: "a new CLI object and an expected prompt"
		def CLI = new CLI()
		def expectedPrompt = "Please enter the details of an item:"
		
		when: 'we get the prompt'
		def actualPrompt = CLI.getPrompt()
		
		then: 'the actual prompt matches the expected prompt'
		actualPrompt == expectedPrompt	
	}
	
	def "check valid inputs"() {
		given: "a new CLI object and three inputs"
		def CLI = new CLI()
		String name = "item"
		String serialNo = "kj897hF"
		double value = 59.99
		
		expect: "validation is successful"
		CLI.validate(name, serialNo, value) == true;
	}
}
