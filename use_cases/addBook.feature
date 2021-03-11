Feature: Add Book
Scenario: Add a book when the administrator is logged in
Given admin have chosen to add book
When admin add "0131016490" and "Test-Drivenest Driven Developement" and "Kent Beck" and "Beck2002" when he logged in
Then The book is added

Scenario: Add a book when the administrator is not logged in 
Given admin have chosen to add book
When admin add "0131016490" and "Test-Drivenest Driven Developement" and "Kent Beck" and "Beck2002" when he is not logged in
Then The book is not added
