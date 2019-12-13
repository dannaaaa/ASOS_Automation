Feature : Account
  As a user I want to log into my account
  So I can have access to account holder priviledges

  @outline
  Scenario Outline: invalid password error
    Given I am on the sign in page
    When I enter a valid email
    And I input a invalid <password>
    Then I get receive an  <error> message

    Examples:
       |   password     |                 error                        |
       |                | Hey, we need a password here                 |
       |   123test      | Looks like either your email address or password were incorrect. Wanna try again?|

    @outline
    Scenario Outline: invalid email error
      Given I am on the sign in page
      When I enter a invalid <email>
      And I input a valid password
      Then I get receive an  <error> message
      Examples:
        |    email      |    error     |
        |  test@        | Email fail! Please type in your correct email address |
        |  test1        | Email fail! Please type in your correct email address |
        |               | Oops! You need to type your email here                |




