
Feature: Register new User in Addactin website

  Scenario Outline: Addactine website Registration
    Given launch the addactine Registration page
    When input UserName field with "<userName>"
    And input Password field with "<password>"
    And input confirmPassword field "<password>"
    And input Fullname field "<name>"
    And input EmailId field "<emailId>"

    Examples: 
      | userName   | password | name         | emailId           |
      | dinesh123  | Test123  | Dinesh Kumar | dinesh@gmail.com  |
      | soundar123 | Tests123  | Soundar      | soundar@gmail.com |
