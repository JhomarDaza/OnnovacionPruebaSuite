

Feature: comprar producto
  As a web user
  I want to use saucedemo
  To buy products

  Scenario Outline: login
    Given that user wants to login in saucedemo platform
    When he enters the <user_name>, <password> and clic on login botton
    Then he visualizes the inventory
    Examples:
      | user_name     |  | password     |  |
      | standard_user |  | secret_sauce |  |
