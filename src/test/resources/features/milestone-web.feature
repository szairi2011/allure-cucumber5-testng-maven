#language: en
#@allure.label.layer:web
#@allure.label.owner:baev
#@allure.label.page:/{org}/{repo}/milestones
@allure.label.epic:FISCD-Epic-456
#@allure.label.story:FISCD-Story-001
Feature: Milestones

#  @smoke @regress @allure.label.story:FISCD-Story-001
  #@allure.label.jira:AE-1
  #@allure.label.jira:AE-2
  Scenario: FISCD-Story-0018:Create new milestone for authorized user
    When I open milestones page
    And I create milestone with title "hello"
    Then I should see milestone with title "hello"

#  @allure.label.epic:FISCD-Epic-123
#  @regress @allure.label.story:FISCD-Story-001
  #@allure.label.jira:AE-2
  Scenario: FISCD-Story-0019:Close existing milestone for authorized user
    When I open milestones page
    And I create milestone with title "hello"
    And I delete milestone with title "hello"
    Then I should not see milestone with content "hello"
