Feature : Dresses

  Scenario: looking at dresses
    Given I am on the homepage
    When I click on clothing
    And I should click on th dresses button
    Then I am taken to the dresses page


    Scenario: getting an evening dress
      Given I am on the dresses page
      When I click on evening dress
      And I am taken to the page with evening dresses
      Then I select a dress that I wish to purchase

      Scenario: adding the dress to the basket
        Given I am on the dress product page
        When I select a size
        And click add to basket
        Then my item should be in the basket
