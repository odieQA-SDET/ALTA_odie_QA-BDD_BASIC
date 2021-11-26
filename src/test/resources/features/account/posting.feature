Feature: posting
  As a Linkedin user
  I want to see my timeline after I got sign in success
  So that I can like or comment my friend post or update my status and etc

  Scenario: I Do like or Comment My Friend and My Network Post
    Given I was on the dashboard home page
    When I read my friend post and  scroll others post
    And I clicked 'like' icon at my friend post
    Then It was success and taken to the comment post
    And I interested to write the comment on my friend post
    And I pushed by enter button of keyboard success


  Scenario: I Create The Post
    Given I was on the dashboard home page
    When I write the status at my home page
    And I clicked 'Start a post' box
    And It was taken to the create a post
    And I wrote the comment in the box 'What do you want to talk about'
    And Before I posted my status I could choice who could read my post
    And Before I posted my status I could add hastag
    And Before I posted my status I could add photo,video,document, and etc
    And I clicked 'Post' button
    Then My post has been in my new post
