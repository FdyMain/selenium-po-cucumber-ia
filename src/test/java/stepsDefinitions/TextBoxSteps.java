package stepsDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TextBoxPage;
import utils.DriverManager;

public class TextBoxSteps {
    WebDriver driver = DriverManager.getDriver();
    TextBoxPage textBoxPage = new TextBoxPage(driver);

    @When("ingresa {string} en el campo {string}")
    public void ingresa_en_el_campo(String text, String field) {
        if (field.equalsIgnoreCase("Full Name")) {
            textBoxPage.fillForm(text, "fdy.adla@gmail.com", "Test Address");
        }
    }

    @When("presiona el botón {string}")
    public void presiona_el_boton(String buttonText) {
        if (buttonText.equalsIgnoreCase("Submit")) {
            textBoxPage.clickSubmitButton();
        } else {
            throw new RuntimeException("El botón especificado no está configurado en el PageObject.");
        }
    }

    @Then("el resultado debe mostrar {string} y {string}")
    public void el_resultado_debe_mostrar(String name, String email) {
        Assert.assertTrue(textBoxPage.getNameResult().contains(name));
        Assert.assertTrue(textBoxPage.getEmailResult().contains(email));
        driver.close();
        driver.quit();
    }
}
