Feature: feature to test the login of products page

  Scenario: test the login page of products
    Given user is on chrome browser
    When user enters url of application
    And hits enters on  products page
    Then user should see the username and password of products page
    When user enters username and password of products page
    And clicks on sign of products
    Then user should see the home page of products
    And move curser on dresses
    Then click on casual dresses
    And move user curser on printed dress
    Then click on add cart
    And click on proceed to checkout
    Then click on continue shopping
    And move curser on women dresses
    Then click on evening dresses
    And mouseover on printed dress
    Then click on add to cart
    And click on proceed to checkout
    Then click on continue shopping
    And click on signout
