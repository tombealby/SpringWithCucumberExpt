@test
Feature: Sniper can make a bid in response to a price reported by the auction

  Background:
    Given the auction has started selling an item
    And sniper requests to start bidding in the auction
    Then the auction has received a join request from sniper

  Scenario Outline: Sniper makes a bid in response to a price reported by the auction
    Given the auction has reported a price of <auctionPrice> and increment of <priceIncrement> and current winning bidder of "other bidder" to its participants
    Then the sniper has made a bid of <sniperBid>
    And the auction has received a bid of <auctionBidReceived> and from "sniper"
    When the auction announces that it has closed
    Then the sniper shows that it has lost the auction
  Examples:
    |auctionPrice	|priceIncrement |sniperBid	|auctionBidReceived |
    |1000			|98				|1098		|1098				|
    |40				|9				|49			|49					|
