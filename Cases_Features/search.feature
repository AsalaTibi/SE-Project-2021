Feature: Search book 
Scenario: Searching of the substring of the title 
Given There's  a book with title "beautiful"
When I search through a book with first case   "u"
Then the first result should be printed 
Scenario: Searching of the substring of the title 
Given There's  a book with title "beautiful"
When I search through a book with  second case "beaut"
Then the first result should be printed
Scenario: Searching of the substring of the title 
Given There's  a book with title "beautiful"
When I search through a book with third case "beautiful"
Then the first result should be printed
Scenario: No books match the Searched Title
Given There's  a book with title "beautiful"
When I search through a book with this case "cb"
Then there is no result 
Scenario: Searching of the substring of the title 
Given There's  a book with title  has "u"
When I search through a book list
Then the all result should be printed

Scenario: Searching for a substring of the authore 
Given  a book authore name is "hala"
When I search through a book by its writer first case  "a"
Then only one  result of it  should be printed
Scenario: Searching for a substring of the authore 
Given  a book authore name is "hala"
When I search through a book by its writer second case "hal"
Then only one  result of it  should be printed
Scenario: Searching for a substring of the authore 
Given  a book authore name is "hala"
When I search through a book by its writer name with this third case "hala"
Then only one  result of it  should be printed
Scenario: No books match the Searched author
Given a book authore name is "hala"
When I search through a book by its writer name  "hu"
Then there is no books
Scenario: Searching for a substring of the authore 
Given  a book authore name has substring like "hal"
When I search through many books
Then all  results of it  should be printed

Scenario: Searching for a substring of the ISBN
Given  a book isbn is "0131016490"
When I search through a book by its isbn like "013"
Then One result should be printed
Scenario: Searching for a substring of the ISBN
Given  a book isbn is "0131016490"
When I search through a book by its isbn "490"
Then One result should be printed
Scenario: No books match the Searched isbn
Given a book isbn is "0131016490"
When I search through a book by its isbn the entered isbn "140"
Then there is no book with this isbn

Scenario: Searching for a substring of the Signature
Given  a book signature is "hala2002"
When I search through a book by its signature "ha" 
Then One result printed

Scenario: Searching for a substring of the Signature
Given  a book signature is "hala2002"
When I search through a book by its signature1 "2002" 
Then One result printed
Scenario: No books match the Searched Signature
Given  a book signature is "hala2002"
When I search through a book by its signature2 "s202" 
Then there is no book with this signature
Scenario: Searching for a substring of the Signnature
Given  a book signature has a substring  "a20"
When I search through a books  
Then  many results printed

Scenario: Searching for a substring of the ISBN while admin login
Given  admin given a book with isbn  "0131016490"
When admin search through a book by its isbn like "013"
Then the search Done successfully 

Scenario: Searching for a substring of the ISBN while  logout 
Given someone given a book with isbn  "0131016490"
When he search through a book by this  isbn like "164"
Then the search Done without mistake