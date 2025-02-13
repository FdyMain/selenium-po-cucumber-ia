package stepsDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverManager;

public class HomeSteps {
    WebDriver driver = DriverManager.getDriver();
    HomePage homePage = new HomePage(driver);

    @Then("los módulos {string}, {string} y {string} deben estar visibles")
    public void los_modulos_deben_estar_visibles(String elements, String forms, String alerts) {
        Assert.assertTrue(homePage.isElementsModuleDisplayed());
        Assert.assertTrue(homePage.isFormsModuleDisplayed());
        Assert.assertTrue(homePage.isAlertsModuleDisplayed());
    }
}