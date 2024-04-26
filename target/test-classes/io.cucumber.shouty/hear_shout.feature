#@Epic("SGW-123")

#@allure.label.feature:EssentialFeatures
@allure.label.epic:SGW-123
@allure.label.story:SGW-456
Feature: Hear shout
  Description: Scenarios to describe the behaviour of the shouty application
  Description can span multi-lines, an can be handy also to include issue tracker links, etc


  Scenario: Listener is within range
    Given Lucy is located 20 meters from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Using custom parameter in step definition, e.g. person
    Given Lucy has 20 bucks
    When Coffee price is less or equal to 20 bucks
    Then Lucy can buy a coffee

  Scenario: Empty scenario, to remind us that there is still work to be done