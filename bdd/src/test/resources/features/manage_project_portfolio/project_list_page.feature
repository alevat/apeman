Feature: Project List Page

  Scenario: A user can view the list of Projects.

    Given that Projects exist in the system
    When a User selects Projects from the Menu
    Then the User sees a list of Projects