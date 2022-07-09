@Get
Feature: Obtener la información con el metodo get de un usuario

  @Scenario1 @Regression
  Scenario: Se validará que la respuesta de la API sea exitosa
    Given Que se cargo la información del cliente
      | id |
      | 1  |
    When Llamo el metodo get de la API Usuarios con la data
    Then Debería ver el código del estado 200

  @Scenario2 @Regression
  Scenario: Enviar la información, obtener usuario individual y optener la cantidad de la clave
    Given Que se cargo la información del cliente
      | id |
      | 2  |
    When  Llamo el metodo get de la API Usuarios con la data
    Then Valido la clave de cantidad es 2

  @Scenario3 @Regression @Smoke
  Scenario: Se validará que el esquema sea el correcto
    Given Que se cargo la información del cliente
      | id |
      | 3  |
    When Llamo el metodo get de la API Usuarios con la data
    Then Valido el esquema de la respuesta "GetJsonSchema"

  @Scenario4 @Regression
  Scenario: Se validará que los campos de la respuesta sean correctos
    Given Que se cargo la información del cliente
      | id |
      | 4  |
    When Llamo el metodo get de la API Usuarios con la data
    Then Valido los campos que obtengo de la respuesta

  @Scenario5 @Regression
  Scenario: Se validará los valores de la respuesta sean correctos
    Given Que se cargo la información del cliente
      | id |
      | 5  |
    When Llamo el metodo get de la API Usuarios con la data
    Then Valido la respuesta que contiene los datos esperados
