@smartBear
Feature: TC#27: SmartBear order process

  Agile story:


  Scenario Outline: Smartbear order list verification
    Given User is on the Smartbear login page
    And User enters Tester's credentials
    And User clicks to Orders link
    And User selects "<productName>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<name>" to costumer name
    And User enters "<address>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enter "<zip>" to zip code
    And User selects "<cardType>" as card type
    And User enters "<cardNumber>" to card number
    And User enters "<cardExpiration>" to expiration date
    And User clicks process button
    And User clicks to View All Orders link
    Then User verifies "<expectedName>" is in the list

    Examples:
      | productName | quantity | name         | address     | city       | state | zip   | cardType         | cardNumber       | cardExpiration | expectedName |
      | FamilyAlbum | 1        | Ali Vali     | Wall street | NYC        | NY    | 10000 | Visa             | 1111111111111111 | 11/20          | Ali Vali   |
      | ScreenSaver | 2        | Alisher Fayz | Silk rd     | Boston     | MI    | 11000 | MasterCard       | 2222222222222222 | 12/20          | Alisher Fayz |
      | MyMoney     | 3        | Steve Jobs   | Highland dr | Pittsburgh | PA    | 15000 | American Express | 3333333333333333 | 01/21          | Steve Jobs   |

