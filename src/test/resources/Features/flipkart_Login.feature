Feature: feature to test the login functionality of flipkart

  Scenario Outline: 
    Given user is on browser of flipkart
    When user enters url of flipkart
    Then user should see email or mobilenum and enter password textboxes
    When user enters "<username>" and "<password>"
    And cliks  on login button of flipkart
    Then user should see the homepage of flipkart application
    When user mouseover on fashion
    And clicks on mens foot wear
    Then user should see the foot wear products
    When user clicks on liked product
    And click on size of the shoes
    #Then clicks on add to cart
    Then user should see the place order button
    When user clicks on place order
    And clicks on delivery here
    Then click on continue button
    Then click on cash on delivery here option
    Then click on confirm order
    
    #And click on Netbanking option
    #Then click on select bank dropdown
    #Then click on Pay
  

    Examples: 
      | username   | password      |
      | 6302707546 | Flipkart@1234 |
