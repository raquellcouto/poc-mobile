Feature: Validate features from Custom use case

  Scenario: Custom merchant details is persisted after closing and opening the app
    Given the use case selected was Custom use case
    And the merchant custom was selected
    And a new merchant is configured
    And the application is closed
    Then when opening the application again the recently saved merchant information should persist

