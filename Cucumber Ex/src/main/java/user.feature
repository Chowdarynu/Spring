Feature: User CertificationF
  Scenario: User is Passed
    Given that the user "Chow" is given a task to clear "Java" certification exam
    When "Chow" got "60" marks in exam
    Then "Chow" is known as "Java" certified
