package io.cucumber.shouty;

import io.cucumber.java.ParameterType;

public class CustomParameterTypes {
    @ParameterType("Lucy|Sean") // In this case we specify the possible Person actors in our scenarios, as either Lucy or Sean
    public Person person(String name) {
        return new Person(name);
    }
}
