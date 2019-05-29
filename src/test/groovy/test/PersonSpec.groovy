package test

import spock.lang.Specification

import static factory.PersonTestFactory.*

class PersonSpec extends Specification {

	private Person getPerson() {
		aPerson().get()
	}

	def "person cannot be constructed via statically imported generated method"() {
		when:
			def person = aPerson().get()
		then:
			MissingMethodException e = thrown()
			e.message.contains('test.PersonSpec.aPerson()')
	}

	def "person can be constructed 2"() {
		given:
			def person = factory.PersonTestFactory.aPerson().get()
		expect:
			person.name == 'John Doe'
			person.age == 42
			person.gender == 'male'
	}

}
