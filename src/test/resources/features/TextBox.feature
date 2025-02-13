Feature: Formulario de TextBox en DemoQA
  Como usuario de DemoQA
  Quiero ingresar mi información en el formulario de TextBox
  Para verificar que los datos se muestran correctamente

  Scenario: Llenar formulario y verificar información
    Given el usuario navega a "https://demoqa.com/text-box"
    When ingresa "Fdy Main" en el campo "Full Name"
    And ingresa "fdy.adla@gmail.com" en el campo "Email"
    And ingresa "Calle 123" en el campo "Current Address"
    And presiona el botón "Submit"
    Then el resultado debe mostrar "Fdy Main" y "fdy.adla@gmail.com"
