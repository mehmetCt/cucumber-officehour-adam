Feature: Elements page functionality

  @buttons
  Scenario: Check different button actions
    Given Navigate to "Buttons" page
    When  Double click on button
    Then  Verify text double click message "You have done a double click" should be visible
    And   Right click on button
    Then  Verify text right click message "You have done a right click" should be visible
    And   Click Me button
    Then  Verify text click me message "You have done a dynamic click" should be visible


#Home Work
  Scenario Outline: Getting different responses by different links
    Given Navigate to "links" page
    When the user clicks to "<link>"
    Then the message contains "<statusCode>""<statusText>"
    Examples:
      | link         | statusCode | statusText        |
      | Created      | 201        | Created           |
      | No Content   | 204        | No Content        |
      | Moved        | 301        | Moved Permanently |
      | Bad Request  | 400        | Bad Request       |
      | Unauthorized | 401        | Unauthorized      |
      | Forbidden    | 403        | Forbidden         |
      | Not Found    | 404        | Not Found         |