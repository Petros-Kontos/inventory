package inventory

import spock.lang.Specification

class OrchestratorSpec extends Specification {
	
	def "orchestrator class exists"() {
		
		setup: "instantiate an orchestr ator object"
		def orchestrator = new Orchestrator()
		
		expect: "check orchestrator object has been created"
		orchestrator != null
	}
}
