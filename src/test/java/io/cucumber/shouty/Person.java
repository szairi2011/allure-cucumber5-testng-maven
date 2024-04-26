package io.cucumber.shouty;

public class Person {

    Integer distance;

    public Person(String name) {
    }

    public Person() {}

    public void setMessageHeard(String messageHeard) {
        this.messageHeard = messageHeard;
    }

    String messageHeard;
    public void moveDistance(Integer distance) {
        this.distance = distance;
    }

    public void shout(String message) {
    }

    public String getMessageHeard() {
        return messageHeard;
    }
}
