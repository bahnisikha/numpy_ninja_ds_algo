#LL-1
Feature: Linked List page validation dsalgo
  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid data 
    And The user click on login button
    Then The user redirected to homepage
    
#LL-2
    Scenario: User navigated to "linked list" page
    Given The user is on Home page after logged in
    When The user selecting linkedlist item from the drop down menu
    Then The user redirected to "Linked List"  Page
    
 #LL-2
  Scenario: User navigated to "Introduction" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Introduction link
    Then The user move to "Introduction" of Linked List Page
       
 #LL-3     
  Scenario: User navigated to tryEditor page with Run button from Introduction page
    Given The user is on the "Introduction" after logged in
    When The user clicks "Try Here" button in the "introduction" page
    Then The user redirected to the page having an tryEditor with a Run button to test
    
 #LL-4
  Scenario: The user getting error message with invalid python code for Introduction page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code 
    |print LinkedList Introduction|
    And click on run button
    Then The user get the error message
    
 #LL-5
 Scenario: User navigated to "creating linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks creating linked list link
    Then The user move to "Creating Linked LIst" of Linked List Page
 
 #LL-6
 Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
    Given The user is on the "Creating a Linked List" after logged in
    When The user clicks "Try Here" button in the "creating linked list" page
    Then The user redirected to the page having an tryEditor with a Run button to test
 
 #LL-7
 Scenario: User run the code in tryEditor with valid input for Creating a Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code 
    |print("Creating a Linked List")|
    And click on run button
    Then The user should get the Run output
    
 #LL-8
 Scenario: The user getting error message with invalid python code for Creating a Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code 
    |print Creating a Linked List|
    And click on run button
    Then The user get the error message
 
 #LL-9
 Scenario: User navigated to "Types of linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Types of Linked List link
    Then The user move to "Types of Linked List" of Linked List Page
    
 #LL-10
 Scenario: User navigated to tryEditor page with Run button from Types of Linked List page
    Given The user is on the "Types of Linked list" after logged in
    When The user clicks "Try Here" button in the "types of linked list" page
    Then The user redirected to the page having an tryEditor with a Run button to test
    
 #LL-11
 Scenario: User run the code in tryEditor with valid input for Types of Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter valid python code 
    |print("Types of Linked List")|
    And click on run button
    Then The user should get the Run output
    
 #LL-12
  Scenario: The user getting error message with invalid python code for Types of Linked List page
    Given The user is in a try here page having tryEditor with a Run button to test
    When The user Enter invalid python code 
    |print Types of Linked List|
    And click on run button
    Then The user get the error message
    
 #LL-13
 Scenario: User navigated to "Implementation linked list in python" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Implement Linked List in Python link
    Then The user move to "Implement Linked List in Python" of Linked List Page
    
 
 