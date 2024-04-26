#language: en
#@allure.label.layer:rest
#@allure.label.owner:eroshenkoam
#@allure.label.url:/repos/{owner}/{repo}/labels

@allure.label.epic:FISCD-Epic-123
@smoke @allure.label.story:FISCD-Story-016
Feature: Labels


  Scenario: Create new label via api
    When I create label with title "hello" via api
    Then I should see label with title "hello" via api

  #@allure.label.jira:AE-1
  Scenario: Delete existing label via api
    When I create label with title "hello" via api
    And I delete label with title "hello" via api
    Then I should not see label with content "hello" via api
