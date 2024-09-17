Feature: Prothom Alo Login


    @Release
    Scenario: Login
        Given User can see LoginBtn on Homepage
        Then User clicks LoginBtn
        When User clicks Email Field
        And User enters value for Login
        Then User clicks Password Field
        When User enters Password
        Then User clicks Login Submit


    @Release
    Scenario: News Categories
        Given User can see categories on Homepage
        When User clicks on latest News
        Then User can see latest news Section
