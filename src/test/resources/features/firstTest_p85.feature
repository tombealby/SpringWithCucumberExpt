Feature: First test of walking skeleton of sniper - auction interaction

  Scenario: Sniper joins auction until auction closes
    Given the auction has started selling an item
    When sniper requests to start bidding in the auction
    Then the auction has received a join request from sniper
    When the auction announces that it has closed
    Then the sniper shows that it has lost the auction
