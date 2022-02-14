Feature: feature to test the login of facebook

  Scenario Outline: test the login functionality of facebook
    Given user is on chrome bowser of facebook
    When user enters the url of facebook
    Then user should see the username and password textboxes of facebook
    When user enters the "<username>" and "<password>"
    And clicks on login button of facebook
    Then user should see the homepage of facebook
    Then user should see the search icon
    When user enters the username in search icon
    And clicks on user liked autosuggession
    Then user should see search results
    When user clicks on photos
    Then user should see the photos
    And click on back button
    Then user clicks on homepage of facebook
    And clicks on photo/video
    Then click on on post button

    Examples: 
      | username   | password     |
      | 6302707546 | Facebook@143 |
