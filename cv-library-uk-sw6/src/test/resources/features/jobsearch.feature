@sanity @smoke @regression
Feature: Job Search Test Feature
  As a User, I should able to verify Job Search Result Using different DataSet

  Scenario Outline: User Verify Job Search Result Using Different DataSet
    Given     I am on Homepage
    When      I enter job title "<jobTitle>"
    And       I enter Location "<location>"
    And       I select distance "<distance>"
    And       I click on more Search Options Link
    And       I enter salaryMin "<salaryMin>"
    And       I enter salaryMax "<salaryMax>"
    And       I select salaryType "<salaryType>"
    And       I select jobType "<jobType>"
    And       I click on Find Jobs button
    Then      I verify the result "<result>"

    Examples:
      | jobTitle          | location        | distance | salaryMin | salaryMax | salaryType | jobType   | result                                               |
      | Tester            | Harrow          | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow                      |
      | Scrum Master      | London          | 10 miles | 70000     | 80000     | Per annum  | Permanent | Permanent Scrum Master jobs in London                |
      | Test Manager      | Southampton     | 5 miles  | 70000     | 80000     | Per annum  | Permanent | Permanent Test Manager jobs in Southampton           |
      | IT Developer      | Birmingham      | 10 miles | 40000     | 60000     | Per annum  | Permanent | Permanent It Developer jobs in Birmingham            |
      | Automation Tester | Bristol(County) | 15 miles | 40000     | 50000     | Per annum  | Permanent | Permanent Automation Tester jobs in Bristol (County) |
      | Business analyst  | Cardiff         | 10 miles | 30000     | 60000     | Per annum  | Permanent | Permanent Business Analyst jobs in Cardiff           |