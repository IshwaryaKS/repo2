Feature: Registration
 registering into testMe app
 
Scenario Outline: login testme
  When Login into app 
  Then Enter username <username>
  Then Enter firstname <firstname>
  Then Enter lastname <lastname>
  Then Enter password 
  Then Enter gender
  Then Enter contact
  And Enter sec ques
  
  	Examples:
  	|username  |firstname |lastname|
    |hii123456 |hii       |hiii    |
    
  
