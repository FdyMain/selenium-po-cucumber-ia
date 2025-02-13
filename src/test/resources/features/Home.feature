Feature: Validación de elementos en la página principal de DemoQA
  Como usuario de DemoQA
  Quiero validar que los elementos principales estén visibles
  Para verificar la integridad del sitio

  Scenario: Verificar que las tarjetas principales son visibles
    Given el usuario navega a "https://demoqa.com/"
    Then los módulos "Elements", "Forms" y "Alerts, Frame & Windows" deben estar visibles