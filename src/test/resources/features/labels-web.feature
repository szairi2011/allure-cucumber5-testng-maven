#language: en
#@allure.label.layer:web
#@allure.label.owner:eroshenkoam
#@allure.label.page:/{org}/{repo}/labels

@allure.label.epic:FISCD-Epic-123
Feature: Labels


#  @regress @critical @allure.label.story:FISCD-Story-003
  #@allure.label.jira:AE-2
  Scenario: FISCD-Story-003: Create new label for authorized user
    When I open labels page
    And I create label with title "hello"
    Then I should see label with title "hello"

  #@allure.label.jira:AE-1
#  @critical @allure.label.story:FISCD-Story-003
  Scenario: FISCD-Story-004: Add label to existing issue for authorized user
    When I open issue with id 123123
    And I add label with title "hello" to issue
    And I filter issue by label title "hello"
    Then I should see issue with label title "hello"

#  @smoke @allure.label.story:FISCD-Story-004
  #@allure.label.jira:AE-1
  Scenario: FISCD-Story-005:Delete existing label for authorized user
    When I open labels page
    And I create label with title "hello"
    And I delete label with title "hello"
    Then I should not see note with content "hello"
