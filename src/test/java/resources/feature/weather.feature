Feature: Quary weather of London

  @AUTOMATED
  Scenario:  London weather with following endpoint 44418 should appear as expected for next five days
    When     User send a GET request endpoint
    Then     They should get back a next Five Day weather forcast

  @AUTO
  Scenario: Today London weather should as expected
    Given   User send a GET request endpoint
    When    User search today's weather status name
    Then    User should see today's weather

  @MANUAL
  Scenario:  London city ID
    Given    User send a GET request endpoint
    When     User enter title Key
    Then     User should get response London

  Scenario: San Francisco with following endpoint 2487956 should appear as expected for next five days
    Given    User send a GET request endpoint
    Then     User should get back next five days weather for San Francisco

  Scenario:  With query work San
    Given   User send GET endpoint with following query param san
    Then    User should get all list of city start with san



