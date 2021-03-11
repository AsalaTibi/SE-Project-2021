Feature: Admin login
  Scenario: Administrator can log in with valid credentials
  Given admin have chosen to sign in 
  When admin enters "admin" in username field and "1234" in password field
  Then admin should access to the home page
  
  Scenario: Administrator has the wrong password
  Given admin have chosen to sign in
  When admin enters "admin" in username field and "8756" in password field
  Then admin gets login failed message
  