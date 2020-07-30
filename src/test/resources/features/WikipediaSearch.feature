Feature: TC#25: Wikipedia Search Functionality Title Verification

  Agile story: User should be able to search terms and see relevant results in the page and in the title

  @wikiScenario
  Scenario Outline:
    Given User in on Wikipedia home page
    Then User types "<searchValue>" in the wiki search box
    When User clicks wiki search button
    Then User should see "<expectedTitle>" is in the wiki title
    Then User should see "<expectedHeader>" is in the main header
    Then User should see "<expectedImageHeader>" is in the image header

    Examples:
      | searchValue     | expectedTitle   | expectedHeader  | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs      | Steve Jobs          |
      | Donald Trump    | Donald Trump    | Donald Trump    | Donald Trump        |
      | Vladimir Putin  | Vladimir Putin  | Vladimir Putin  | Vladimir Putin      |
      | Mark Zuckerberg | Mark Zuckerberg | Mark Zuckerberg | Mark Zuckerberg     |



