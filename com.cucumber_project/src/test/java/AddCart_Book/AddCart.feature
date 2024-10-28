 Feature: Demo webshop application
 
 Background: 
    Given user should navigate to demoweshop application
    And user should click on login link

 
  Scenario: login should be succesfull
    And user should enter the username as javaseleniumA4@gmail.com
    And user should enter the password as 123456
    When user click on login button
    Then login should be succesfull
    
    Scenario: Add Cart Book should be succesfull
    And user should click on book link
    And user should click on Computing and Internet book
    And user should click on Fiction book
    Then  Add cart Book succesfull
    
