#@Epic("SGW-123")

#@allure.label.feature:EssentialFeatures
@allure.label.epic:SGW-Epic-5647
#@allure.label.story:SGW-456
@allure.label.owner=JohnDoe
Feature: Hear shout
  Description: Scenarios to describe the behaviour of the shouty application
  Description can span multi-lines, an can be handy also to include issue tracker links, etc

# Listener is within range
#  @allure.label.jira:SGW-456
  @critical
  Scenario: SGW-456: Lucy is within range to hear Sean
    Given Lucy is located 20 meters from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

# Using custom parameter in step definition, e.g. person
#  @allure.label.jira:SGW-457
  @allure.id:123
  Scenario: SGW-457: Lucy has enough money to buy coffee
    Given Lucy has 20 bucks
    When Coffee price is less or equal to 20 bucks
    Then Lucy can buy a coffee

  @allure.label.jira:SGW-458
  Scenario: SGW-458:Empty scenario, to remind us that there is still work to be done