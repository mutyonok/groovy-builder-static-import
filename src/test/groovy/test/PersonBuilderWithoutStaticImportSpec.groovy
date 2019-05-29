package test

import factory.PersonTestFactory
import spock.lang.Specification

class PersonBuilderWithoutStaticImportSpec extends Specification {

    def "person can be constructed 2"() {
        given:
            def person = PersonTestFactory.aPerson().get()
        expect:
            person.name == 'John Doe'
            person.age == 42
            person.gender == 'male'
    }

}
