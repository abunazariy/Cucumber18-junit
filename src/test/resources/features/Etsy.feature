@etsy
Feature: TC#51: Etsy search feature

Agile Story: User should be able to search terms and see relevant results in the page and in the title

  Background: User should be on Etsy home page
    Given User on Etsy home page


  Scenario: Etsy default title verification
    Then User should see title is Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Etsy title verification after search
    Given User should be able type Wooden spoon in Etsy search box
    When User clicks to Etsy search button
    Then User should see Wooden spoon in the title


    Scenario: Etsy title verification after search
      Given User should be able type "Toys" in Etsy search box
      When User clicks to Etsy search button
      Then User should see "Toys" in title






