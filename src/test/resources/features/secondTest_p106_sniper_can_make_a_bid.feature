@test
Feature: Sniper can make a bid in response to a price reported by the auction

  Background:
    Given the auction has started selling an item
    And sniper requests to start bidding in the auction
    Then the auction has received a join request from sniper

  Scenario: Sniper makes a bid in response to a price reported by the auction
    Given the auction has reported a price of 1000 and increment of 98 to its participants
    Then the sniper has made a bid of 1098
    And the auction has received a bid of 1098
    When the auction announces that it has closed
    Then the sniper shows that it has lost the auction
