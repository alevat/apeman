Feature: Project List Page

  Background:
    Given that a Project Manager is logged in
    And that Projects exist in the system

  Scenario: A Project Manager can view the list of Projects.

    When a Project Manager selects Projects from the Menu
    Then the Project Manager sees a list of Projects