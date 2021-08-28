Feature: Student registration form complete

  Scenario: Student registration form complete
    Given user is at 'https://demoqa.com/automation-practice-form' page
    When user complete form with valid data
#      | Galina | Grumeza | andrusca.galina@gmail.com | Female | 1234567891 | None | Sports | address | NCR | Delhi |
      | Galina | Grumeza | andrusca.galina@gmail.com | Female | 1234567891 | None |  address | NCR | Delhi |
#    And upload an image
    And click on submit button
    Then a popup is displayed



