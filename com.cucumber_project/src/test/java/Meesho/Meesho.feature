Feature: Meesho application

  Scenario: Add to cart
    Given user should be navigate the product
    And user Should be move to the Cursor in men link and click on casual shoe
    And user Should be Click on Adab trendy men Casul Shoes
    And user should be Select the Size number7
    And user should be Click on AddCart
    Then AddCart Should be Succesfull
