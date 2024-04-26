package io.qameta.allure.examples.cucumber5;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import static io.qameta.allure.Allure.step;

//@Epic("FISCD-Epic-123")
//@Feature("FISCD-Feature-003")
//@Story("FISCD-LAB")
public class RestSteps {

    @When("I create label with title {string} via api")
//    @Epic(value = "FISCD-Epic-123")
//    @Feature(value = "FISCD-Feature-003")
//    @Story(value = "FISCD-LAB")
    public void createLabelWithTitle(final String title) {
//        Allure.epic("FISCD-Epic-456");
//        Allure.feature("FISCD-Feature-003");
//        Allure.story("FISCD-Story-006");
        step("POST /repos/:owner/:repo/labels");
    }

    @When("I delete label with title {string} via api")
    public void deleteLabelWithTitle(final String title) {
//        Allure.epic("FISCD-Epic-456");
//        Allure.feature("FISCD-Feature-003");
//        Allure.story("FISCD-Story-007");
        step("GET /repos/:owner/:repo/labels?text=" + title);
        step("DELETE /repos/:owner/:repo/labels/237");

    }

    @Then("I should see label with title {string} via api")
    public void labelsShouldContainsNoteWithText(final String text) {
        step("GET /repos/:owner/:repo/labels?text=" + text);
        step("GET /repos/:owner/:repo/labels/834");
    }

    @Then("I should not see label with content {string} via api")
    public void labelsShouldNotContainsNoteWithText(final String text) {
        step("GET /repos/:owner/:repo/labels?text=" + text);
        step("GET /repos/:owner/:repo/labels/834");
    }

}
