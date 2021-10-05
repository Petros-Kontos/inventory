package inventory

import spock.lang.Ignore
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
	
	def "get item name prompt"() {
		given: 'a new CLI object and an expected item name prompt'
		def CLI = new CLI()
		def expectedPrompt = "Please enter an item name:"	
		when: 'we get the prompt'
		def actualPrompt = CLI.getNamePrompt()
		then: 'the actual prompt matches the expected prompt'
		actualPrompt == expectedPrompt
	}
	
	def 'get item serial number prompt'() {
		given: 'a new CLI object and an expected item name prompt'
		def CLI = new CLI()
		def expectedPrompt = "Please enter an item serial number:"	
		when: 'we get the prompt'
		def actualPrompt = CLI.getSerialNoPrompt()
		then: 'the actual prompt matches the expected prompt'
		actualPrompt == expectedPrompt
	}
	
	def 'get item value'() {
		given: 'a new CLI object and an expected item name prompt'
		def CLI = new CLI()
		def expectedPrompt = 'Please enter the item value:'
		when: 'we get the prompt'
		def actualPrompt = CLI.getValuePrompt()
		then: 'the actual prompt matches the expected prompt'
		actualPrompt == expectedPrompt
	}
	
	def 'convert raw value input to double'() {
		given: 'a new CLI object and an expected item name prompt'
		def CLI = new CLI()
		when: 'inputting a String value'
		def result = CLI.convertValue("59.99")
		then: 'the output is the equivalent double'
		result == 59.99
	}
	
	def 'check valid name'() {
		given: "a new CLI object and valid name input"
		def CLI = new CLI()
		String name = "item"
		expect: "validation is successful"
		CLI.validateName(name) == true;
	}
	
	def 'check valid serial number'() {
		given: "a new CLI object and valid serial number input"
		def CLI = new CLI()
		String serialNo = "kj897hF"
		expect: "validation is successful"
		CLI.validateSerialNo(serialNo) == true;
	}
	
	def 'check valid value'() {
		given: "a new CLI object and valid value input"
		def CLI = new CLI()
		double value = 59.99
		expect: "validation is successful"
		CLI.validateValue(value) == true;
	}
	
	def 'check valid inputs'() {
		given: "a new CLI object and three valid inputs"
		def CLI = new CLI()
		String name = "item"
		String serialNo = "kj897hF"
		String value = "59.99"
		
		expect: "validation is successful"
		CLI.validate(name, serialNo, value) == true;
	}
	
	@Ignore
	def "check invalid inputs"() {
		given: "a new CLI object and three invalid inputs"
		def CLI = new CLI()
		String name = "item"
		String serialNo = "kj897hF"
		String value = "59.99"
		
		expect: "validation is unsuccessful"
		CLI.validate(name, serialNo, value) == false;
	}
}
