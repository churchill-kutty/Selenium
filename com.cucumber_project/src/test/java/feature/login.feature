Feature: DemowebShop application

  Background: 
    Given user should navigate to demoweshop application
    And user should click on login link

  @reg
  Scenario: login should be succesfull
    And user should enter the username as javaseleniumA4@gmail.com
    And user should enter the password as 123456
    When user click on login button
    Then login should be succesfull

  @smoke
  Scenario: login should not be succesfull
    And user should enter the username as "churchillA4@gmail.com"
    And user should enter the password as "12345"
    When user click on login button
    Then login should  not be succesfull
