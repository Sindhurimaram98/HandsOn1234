
@tag
Feature: Login Action
  Test Login Functionality

 

  @tag2
  Scenario Outline: Successfull login with valid credentials
    Given Navigate to home page
    When user enters "<username>" and "<password>"
    Then Message Login successfully

    Examples:  
       | username              | password   |
       | karthik456@gmail.com  | karthik456 |
       | shahrukh@khan.com     | omshanti   |  
       | anild@gmail.com       | anilanil   |