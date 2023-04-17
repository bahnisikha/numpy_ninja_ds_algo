Feature: Validation of Array Page 

Background: The user is logged in to DS Algo portal 
	Given The user is on Signin page of DS Algo portal 
	When The user enter valid and 
	And The user click on login button 
	Then The user redirected to homepage 
	
	#Array01  
Scenario: Validation of Array page 
	Given The user is on Home page after logged in 
	When user clicks on Array getstarted 
	Then User should be redirected to "Array" webpage 
	
	#Array02 
Scenario: Validation of Arrays in Python link 
	Given User is on "Array page" after logged in 
	When User clicks on Arrays in Python link 
	Then User should be redirected to "Arrays in Python" page 
	
	#Array03
Scenario: Validation of Try Here button 
	Given User is on "Arrays in Python page" after logged in from signin page
	When User clicks on "Try Here" button in "Arrays in Python page" 
	Then User should be redirected to a page having an tryEditor with a Run button to test 
	#Array04
Scenario Outline: Validation of valid python code in TryEditor page 
	Given User is on "Try Editor Page" after logged in from TryEditor page 
	When User enters valid Python code from sheet "<SheetName>" and <RowNumber> 
	And User clicks on Run button 
	Then User should be able to see the output 
	Examples: 
		|SheetName	|	RowNumber	|
		|PythonCode	|	0			|
		
		#Array05
Scenario Outline: Validation of error message for invalid python code in TryEditor page 
	Given User is on "Try Editor Page" after logged in 
	When User enters invalid Python code  
	And User clicks on Run button 
	Then User should be able to see error message 
	
		#Array06
Scenario: Validation of Arrays Using List link 
	Given User is on "Array page" after logged in 
	When User clicks on Arrays Using List link 
	Then User should be redirected to "Arrays Using List" page 
	
		#Array07
Scenario: Validation of Try Here button 
	Given User is on "Arrays Using List" after logged in 
	When User clicks on "Try Here" button in "Arrays Using List" 
	Then User should be redirected to a page having an tryEditor with a Run button to test 
	
	#Array08
Scenario Outline: Validation of valid python code in TryEditor page using Arrays Using List 
	Given User is on "Try Editor Page" after logged in 
	When User enters valid Python code  
	And User clicks on Run button 
	Then User should be able to see the output 
	
	#Array09
Scenario Outline: Validation of invalid python code in TryEditor page for Arrays Using List 
	Given User is on "Try Editor Page" after logged in 
	When User enters invalid Python code 
	And User clicks on Run button 
	Then User should be able to see error message in an Alert 
	
	#Array10
Scenario: Validation of Basic Operations in Lists link 
	Given User is on "Array page" after logged in 
	When User clicks on Basic Operations in Lists link 
	Then User should be redirected to "Basic Operations in Lists" page 
	
	#Array11
Scenario Outline: Validation of valid python code in TryEditor page for Basic Operations in Lists 
	Given User is on "Try Editor Page" after logged in 
	When User enters valid Python code  
	And User clicks on Run button 
	Then User should be able to see the output 
	
	#Array12
Scenario Outline: Validation of invalid python code in TryEditor page for Basic Operations in Lists 
	Given User is on "Try Editor Page" after logged in 
	When User enters invalid Python code  
	And User clicks on Run button 
	Then User should be able to see error message in an Alert box
	
	#Array13
Scenario: Validation of Applications of Arrays link 
	Given User is on "Array page" after logged in 
	When User clicks on Applications of Array link 
	Then User should be redirected to "Applications of Array" page 
	
	#Array14
Scenario Outline: Validation of valid python code in TryEditor page for Applications of Array 
	Given User is on "Try Editor Page" after logged in 
	When User enters valid Python code 
	And User clicks on Run button 
	Then User should be able to see the output 
	
		
	