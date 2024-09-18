Feature: Prothom Alo

  # t1
    @Release
    Scenario: Login
        Given User can see LoginBtn on Homepage
        Then User clicks LoginBtn
        When User clicks Email Field
        And User enters value for Login
        Then User clicks Password Field
        When User enters Password
        Then User clicks Login Submit

  # t2
    @Release
    Scenario: Latest News
        Given User can see latest categories link on Homepage
        When User clicks on latest News
        Then User can see latest news Section

  # t3
    @Release
    Scenario: Politics News
        Given User can see politics news categories link on Homepage
        When User clicks on Politics News
        Then User can see politics news Section

  # t4
    @Release
    Scenario: Bangladesh News
        Given User can see Bangladesh news categories link on Homepage
        When User clicks on Bangladesh News
        Then User can see Bangladesh news Section

  # t5
    @Release
    Scenario: Search
        Given User can see search button on Homepage
        When User clicks on search button
        Then Search Page is Displayed
        When User clicks on Search field
        And User search for something
        When User clicks on search icon
        Then Search Results are displayed