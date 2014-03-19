Feature: People search
	As a regular employee 
	I can search for other employees 
	so that I can find their contact information, title, or photo		
    
   
#	Scenario Outline: Search by valid last name
#		Given the input <employeeLastName> exists in the people directory
#		When it is input
#		Then the output should be <outputB>
		
#		Examples:
#		|FirstName  | LasttName | Email                           | PhoneNumber|Department|
#        | Charles   | Allen     | Charles.Allen@whitestratus.com  |135-130-4627|Sales	  |
#        | Allen     | Martinez  | Allen.Martinez@whitestratus.com |616-216-0520|Sales	  |


	 
	@tag
	Scenario: Search people by valid name
		Given user is on search page 
		And the following employees exist
		|FirstName  | LasttName | Email                           | PhoneNumber|Department|
        | Charles   | Allen     | Charles.Allen@whitestratus.com  |135-130-4627|Sales	  |
        | Allen     | Martinez  | Allen.Martinez@whitestratus.com |616-216-0520|Sales	  |
    	And user enters "Allen" in search box
		When user submits search request
		Then the output should be
		|FirstName  | LasttName | Email                           | PhoneNumber|Department|
        | Charles   | Allen     | Charles.Allen@whitestratus.com  |135-130-4627|Sales	  |
        | Allen     | Martinez  | Allen.Martinez@whitestratus.com |616-216-0520|Sales	  |
	

		