Feature: Employee Language scenario
Background:

  When user enters employee username and password
  Then user clicks on the login button

@EmployeeLanguage
Scenario: Employee able to add language proficiency detailsGiven user is navigated to HRMS application
Given user is navigated to my info page
When user clicks qualifications
And user clicks add under Language
And selects language
And selects fluency
And selects competency
And enters comments
Then clicks save



