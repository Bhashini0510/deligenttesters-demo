#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Array verification

 @pageLaunch
  Scenario Outline: User is able to navigate to Arrays using dropdown option
    Given User login to DSPortalapp using valid credentials
    When User click on Arrays from the dropdown
    Then Arrays page is displayed
    And heaader Array is displayed
    And Verify topics covered is displayed with "<topic>" links
    
    Examples:
    |topic|
    |Arrays in Python,Arrays Using List,Basic Operations in Lists,Applications of Array|
    
  @pageLaunch
  Scenario: User is able to navigate to Arrays using Get Strated option
    Given User login to DSPortalapp using valid credentials
    When User click on Get Started button for Arrays
    Then Arrays page is displayed
    And heaader Array is displayed
    
    
  @pythoncodeValidation
  Scenario Outline: User is able to try code in Arrays page
    Given click on the list of "<links>" from the excel sheet "Arrays"
    When User clicks on try here button and enters code from the excel sheet row in the try editor page and clicks on Run
    Then The code is executed and the output from the excel row is displayed on the page
    
    Examples:
    |links|
    |Arrays in Python,Arrays Using List,Basic Operations in Lists,Applications of Array|
    
  
   
  @tag1
   Scenario Outline: practice link verification
   Given  User logged in homepage in arrays
   When   User select arrays optn from dropdown in arrays
   Then  User should be directed to array page
   When  User clicks for "<options>" in array
   And   User clicks Practice questions in arrays
   Then  User navigates to Practice questions Page in arrays
   When user select "<link>" from list in arrays
   Then user should be directed to question page in arrays
   When user gets input from "<sheet>" and <Row> in arrays
   Then user gets output for above input in arrays
  
   Examples:
   
    |options                   | link                                  |  sheet    |Row| 
   |Arrays in Python          | Search the array                       | inputs    |2 |
   |Arrays Using List         | Max Consecutive Ones                   | inputs    |2 |
   |Basic Operations in Lists | Squares of  a Sorted Array            | inputs    |2 |
   | Applications of Array    | Find Numbers with Even Number of Digits | inputs    | 2| 
   
    @tag2
   Scenario Outline: practice link verification
   Given  User logged in homepage in arrays
   When   User select arrays options from dropdown in arrays
   Then  User should be navigated to array page
   When  User click for "<options>" in array
   And   User clicks on Practice questions in arrays
   Then  User navigate to Practice questions Page in arrays
   When user selects "<link>" from list in arrays
   Then user should directed to question page in arrays
   When user gets wrong input from "<sheet>" and <Row> in arrays
   Then user gets alert in arrays 
   When user clicks submit button in arrays
   Then user get error message in arrays
   Examples:
      
    |options                   | link                                  |  sheet    |Row| 
    |Arrays in Python          | Squares of  a Sorted Array             | inputs    |1 |
   |Arrays Using List         | Search the array                       | inputs    |1 | 
   |Basic Operations in Lists | Search the array                       | inputs    |1|
   |Basic Operations in Lists | Find Numbers with Even Number of Digits| inputs    |1|
   | Applications of Array    | Max Consecutive Ones                   | inputs    | 1|

   