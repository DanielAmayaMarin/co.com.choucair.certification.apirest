@Get
Feature: Obtener la información con el metodo get de un usuario

  @Scenario1 @Regression @Smoke
  Scenario: Se validará que la respuesta de la API sea exitosa
    Given Se cargo la información del cliente
      | id |
      | 1  |
    When Llamo el metodo get de la API Usuarios
    Then Debería ver el código del estado 200

  @Scenario2 @Regression
  Scenario: Enviar la información, obtener usuario individual y optener la cantidad de la clave
    Given Se cargo la información del cliente
      | id |
      | 1  |
    When  Llamo el metodo get de la API Usuarios
    Then Valido la clave de cantidad es 2

  @Scenario3 @Regression
  Scenario: Se validará que el esquema sea el correcto
    Given Se cargo la información del cliente
      | id |
      | 1  |
    When Llamo el metodo get de la API Usuarios
    Then Valido el esquema de la respuesta "GetJsonSchema"

  @Scenario4 @Regression
  Scenario: Se validará que los datos de la respuesta sean correctos
    Given Se cargo la información del cliente
      | id |
      | 1  |
    When Llamo el metodo get de la API Usuarios
    Then Valido los campos que obtengo de la respuesta

  @Scenario5 @Regression
  Scenario: Enviar la información, obtener usuario individual y optener los datos
    Given Se cargo la información del cliente
      | id |
      | 1  |
    When Llamo el metodo get de la API Usuarios
    Then Valido la respuesta que contiene los datos esperados
