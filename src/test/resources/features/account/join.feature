Feature: join
  As a linkedin new user
  I want to register on linkedin
  So that I can be branding my self and to have some relationships

  Scenario: Register or Join Now Success Professional
    Given I was on the register page
    When I filled my email or phone number and password correctly
    And I clicked 'Agree & Join' button
    And I filled my first name and last name
    And I clicked 'Continue' button
    And I did security verification pop up correctly
    And I filled my country and city
    And I clicked 'Next' button
    And I filled my data of job
    And I clicked 'Continue' button
    And I filled the code from my email that has sent by linkedin
    And I clicked 'Agree & Confirm' button
    Then I was taken to the dashboard home success

  Scenario: Register or Join Now Success For Student
    Given I was on the register page
    When I filled my email or phone number and password correctly
    And I clicked 'Agree & Join' button
    And I filled my first name and last name
    And I clicked 'Continue' button
    And I did security verification pop up correctly
    And I filled my country and city
    And I clicked 'Next' button
    And I filled my data as Student is like School or College or University and etc correctly
    And I clicked 'Continue' button
    And I filled the code from my email that has sent by linkedin
    And I clicked 'Agree & Confirm' button
    Then I was taken to the dashboard home success

  Scenario: Register or Join Failed Email or Failed Phone Number
    Given I was on the sign up page
    When I filled the wrong my email or phone number but password correctly
    And I clicked 'Agree & Join' button
    Then It was the wrong email text alert

  Scenario: Register or Join Email or Phone Number Have Used Before
    Given I was on the sign up on boardsite
    When I filled the same email or phone number but password correctly
    And I clicked 'Agree & Join' button
    Then It was the same email or phone number have used before and it was taken to popup alert