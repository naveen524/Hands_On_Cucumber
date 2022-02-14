Feature: feature to test the naukri application

  Scenario Outline: test the login functionality of naukri application
    Given user is on chrome browser of naukri
    When user enters the url of naukri
    And hits entter button on naukri
    Then user should see the login page of naukri
    When user clicks on login button of naukri
    Then user should see the username and password textboxes of the naukri
    When users enters the "<Username>" and "<Password>"
    And clicks on login button of naukri
    Then user should see the home page of naukri
    When user clicks on profile
    Then user user should see update resume button
    When user clicks on update resume button
    And user enters the path of files which he want to upload on naukri

    Examples: 
      | Username                    | Password       |
      | naveenmanneela@gmail.com    | Dream_Job@1234 |
      | naveenmanneela503@gmail.com | Dream_Job@143  |
