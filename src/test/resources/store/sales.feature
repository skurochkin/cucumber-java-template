Feature: Shout

  Scenario: Buyer looking for computer
    Given WallMart is 2 miles from BestBuy
    When BestBuy have sales on "Computers"
    Then WallMart should sell it with discount

  Scenario: Buyer looking for TV
    Given WallMart is 20 miles from BestBuy
    When BestBuy have sales on "TV"
    Then WallMart should sell it with discount


