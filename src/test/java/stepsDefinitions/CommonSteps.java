package stepsDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class CommonSteps {
    WebDriver driver = DriverManager.getDriver();

    @Given("el usuario navega a {string}")
    public void el_usuario_navega_a(String url) {
        driver.get(url);
    }
}