Feature: test

  Scenario: si la hora esta entre 0 y 6
    Given si se ingresa  5
    When se verifica la validez
    Then retorne 'Night'


  Scenario: si la hora esta entre 6 y 12
    Given si se ingresa  7
    When se verifica la validez
    Then retorne 'Morning'




  Scenario: si la hora esta entre 12 y 18
    Given si se ingresa  15
    When se verifica la validez
    Then retorne 'Afternoon'

  Scenario: si la hora esta entre 18 y 24
    Given si se ingresa  20
    When se verifica la validez
    Then retorne 'Evening'


  Scenario: si la hora no existe
    Given si se ingresa  27
    When se verifica la validez
    Then retorne 'Invalid hour'