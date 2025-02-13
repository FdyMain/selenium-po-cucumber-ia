package stepsDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ButtonsPage;
import utils.DriverManager;

public class ButtonsSteps {
    WebDriver driver = DriverManager.getDriver();
    ButtonsPage buttonsPage = new ButtonsPage(driver);

    @When("realiza doble clic en el botón {string}")
    public void realiza_doble_clic_en_el_boton(String buttonText) {
        if (buttonText.equalsIgnoreCase("Double Click Me")) {
            buttonsPage.doubleClickButton();
        } else {
            throw new RuntimeException("El botón especificado no está configurado en el PageObject.");
        }
    }

    @Then("el mensaje {string} es mostrado")
    public void el_mensaje_es_mostrado(String expectedMessage) {
        Assert.assertEquals(expectedMessage, buttonsPage.getDoubleClickMessage());
    }
}