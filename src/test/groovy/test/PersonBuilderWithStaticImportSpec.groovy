package test


import spock.lang.Specification

import static factory.PersonTestFactory.aPerson

class PersonBuilderWithStaticImportSpec extends Specification {

	def "person cannot be constructed via statically imported generated method"() {
		when:
			def person = aPerson().get()
		then:
			notThrown(MissingMethodException)
	}
}
