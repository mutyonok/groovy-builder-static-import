package test

import factory.PersonTestFactory
import spock.lang.Specification

import static factory.PersonTestFactory.aPerson

class PersonSpec extends Specification {

	def "person cannot be constructed via statically imported generated method"() {
		when:
			def person = aPerson().get()
		then:
			notThrown(MissingMethodException)
	}

	def "person can be constructed 2"() {
		given:
			def person = PersonTestFactory.aPerson().get()
		expect:
			person.name == 'John Doe'
			person.age == 42
			person.gender == 'male'
	}

}
