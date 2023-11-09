Feature: Login scenario

  @test1
  Scenario: admin user login to HRMS application
    Given user is navigated to HRMS application
    When user enters admin username and password
    And user clicks on login button
