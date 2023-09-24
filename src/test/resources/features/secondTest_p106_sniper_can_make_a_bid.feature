@test
Feature: Sniper can make a bid

  Background:
    Given the auction has started selling an item
    And sniper requests to start bidding in the auction
    Then the auction has received a join request from sniper

  Scenario: Sniper joins auction until auction closes
    When the sniper makes a bid
    Then the auction has received a bid
    When the auction announces that it has closed
    Then the sniper shows that it has lost the auction
