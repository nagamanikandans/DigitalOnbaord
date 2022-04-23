#Author: nagamanikandans
#Keywords Summary : Application Login scenarios
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@loginfeature
Feature: Application login feature scenarios
  
  @SmokeTest
  Scenario: Login into the application using valid credentials
    Given Launch the application URL
    When Login into the application with valid credentials
    Then I verify user is able to login into the application
    And I logout the application
    
      @SmokeTest
  Scenario: Login into the application using valid credentials
    Given Launch the application URL
    When Login into the application with valid credentials
    Then I verify user is able to login into the application
    And I logout the application
    
      @SmokeTest
  Scenario: Login into the application using valid credentials
    Given Launch the application URL
    When Login into the application with valid credentials
    Then I verify user is able to login into the application
    And I logout the application
    
      @SmokeTest
  Scenario: Login into the application using valid credentials
    Given Launch the application URL
    When Login into the application with valid credentials
    Then I verify user is able to login into the application
    And I logout the application
    
    
  @Regression
  Scenario Outline: Login into the application using valida credentials
    Given  Launch the application URL
    When Login into the application with valid credentials "<clientcode>" "<username>" "<password>"
    Then I logout the application

    Examples: 
     |clientcode | username  | password | 
     |fr| jotishmav |     123 |
     |fr | ameliar	 	|     123| 
