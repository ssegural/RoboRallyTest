
@tag
Feature: Settting up the map

  @tag1
  Scenario: Initializing game
  
   	Given a number of players 3
  	And board difficulty 1 
  	When gamedstarted is true
  	Then we succesfully initialize the board
  
  