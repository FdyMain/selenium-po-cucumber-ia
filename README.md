selenium-po-cucumber/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/               # Clases PageObject
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── TextBoxPage.java
│   │   │   │   ├── ButtonsPage.java
│   │   │   ├── utils/               # Métodos reutilizables (drivers, waits, etc.)
│   │   │   │   ├── DriverManager.java
│   │   │   │   ├── ConfigReader.java
│   ├── test/
│   │   ├── java/
│   │   │   ├── steps/               # Clases de Step Definitions
│   │   │   │   ├── HomeSteps.java
│   │   │   │   ├── TextBoxSteps.java
│   │   │   │   ├── ButtonsSteps.java
│   │   │   ├── runners/             # Clases de ejecución
│   │   │   │   ├── TestRunner.java
│   │   │   ├── hooks/               # Hooks para configuración de pruebas
│   │   │   │   ├── Hooks.java
│   │   ├── resources/
│   │   │   ├── features/            # Archivos Gherkin con los escenarios
│   │   │   │   ├── Home.feature
│   │   │   │   ├── TextBox.feature
│   │   │   │   ├── Buttons.feature
│   │   │   ├── config.properties     # Configuración general
│── pom.xml                           # Dependencias Maven
│── README.md                         # Documentación del proyecto
