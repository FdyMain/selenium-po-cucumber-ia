Feature: Interacción con botones en DemoQA
  Como usuario de DemoQA
  Quiero hacer clic en los botones disponibles
  Para verificar que generan la respuesta esperada

  Scenario: Clic en el botón de doble clic
    Given el usuario navega a "https://demoqa.com/buttons"
    When realiza doble clic en el botón "Double Click Me"
    Then el mensaje "You have done a double click" es mostrado
