Feature: login
  As a Linkedin user
  I want to see my timeline
  So that I can like or comment my friend post or post my status and etc

  Scenario: Sign in Success
    Given I was on the login page
    When I filled my email and password correctly
    And I clicked 'Sign in' button
    Then I was taken to the dashboard success

  Scenario: Sign in Failed Because The Wrong Email
    Given I was on the login page the wrong email
    When I filled the wrong email
    And I clicked 'Sign in' button
    Then It was the wrong email alert

  Scenario: Sign in Failed Because The Wrong Password
    Given I was on the login page failed password
    When I filled the wrong password
    And I clicked 'Sign in' button
    Then It was the wrong password alert

  Scenario: Sign in Failed Because The Empty Email Address
    Given I was on the login page email or phone number
    When I didn't fill my email address but password correctly
    And I clicked 'Sign in' button
    Then It was the empty email alert

  Scenario: Sign in Failed Because The Empty Password
    Given I was on the login page of linkedin
    When I filled my email correctly but password was empty
    And I clicked 'Sign in' button
    Then It was the empty password alert

  Scenario: Sign out Success
    Given I was on the sign out Dashboard menu of Me
    When I clicked dashboard menu of Me and look for the log out
    And I clicked 'Sign out' button
    Then I was taken out from my dashboard of linkedin and success
