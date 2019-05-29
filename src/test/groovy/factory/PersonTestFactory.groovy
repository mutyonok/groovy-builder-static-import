package factory

import groovy.transform.builder.Builder
import test.Person

class PersonTestFactory {
    @Builder(builderMethodName = 'aPerson', buildMethodName = 'get')
    static Person personFactory(
            String name = 'John Doe',
            int age = 42,
            String gender = 'male'
    ) {
        return Person.builder()
                .name(name)
                .age(age)
                .gender(gender)
                .build()
    }
}
