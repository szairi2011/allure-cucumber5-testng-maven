package io.cucumber.shouty;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.testng.Assert;

//import static org.junit.Assert.assertEquals;

public class ListenerWithinRange_StepDefinition {

    private Person sean;
    private Person lucy;
    private String messageFromSean;
    private Network network;

    @Before // This before hook wil run for each scenario
    public void setup() {
        network =  new Network();
    }
    @Given("Lucy is located {int} meters from Sean")
    public void lucy_is_located_meters_from_sean(Integer distance) {
        Allure.epic("FISCD-Epic-456");
        Allure.feature("FISCD-Feature-003");
        Allure.story("FISCD-Story-006");
        System.out.println(distance);
        sean = new Person();
        lucy = new Person();
        lucy.moveDistance(distance);
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        Allure.epic("FISCD-Epic-456");
        Allure.feature("FISCD-Feature-003");
        Allure.story("FISCD-Story-006");
        sean.shout(message);
        messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_message() {
        lucy.setMessageHeard(messageFromSean);
        Assert.assertEquals(messageFromSean, lucy.getMessageHeard());
    }
}
