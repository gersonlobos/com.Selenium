Feature: People search
	As a regular employee 
	I can search for other employees 
	so that I can find their contact information, title, or photo		
    
   
	Scenario Outline: Search by valid last name
		Given the input <employeeLastName> exists in the people directory
		When it is input
		Then the output should be <outputB>
		
		Examples:
			|employeeName   |employeeLastName |outputA	|outputB| 
			|James     		| Krimm			  |James    | Krimm |


	 
	Scenario: Search by valid last name  
		Given the user is on search people page
		When he enters "Krimm" as employee last name
		When he submits search request
		Then ensure employee with last name "Krimm" is presented
	

		