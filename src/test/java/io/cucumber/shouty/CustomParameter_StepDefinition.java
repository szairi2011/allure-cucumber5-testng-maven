package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CustomParameter_StepDefinition {
    @Given("{person} has {int} bucks")
    public void lucy_has_bucks(Person person, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Coffee price is less or equal to {int} bucks")
    public void coffee_price_is_less_or_equal_to_bucks(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{person} can buy a coffee")
    public void lucy_can_buy_a_coffee(Person person) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
//        Assert.assertEquals(person, person);
    }
}
