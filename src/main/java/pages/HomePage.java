package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//h5[text()='Elements']")
    WebElement elementsModule;

    @FindBy(xpath = "//h5[text()='Forms']")
    WebElement formsModule;

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    WebElement alertsModule;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isElementsModuleDisplayed() {
        return elementsModule.isDisplayed();
    }

    public boolean isFormsModuleDisplayed() {
        return formsModule.isDisplayed();
    }

    public boolean isAlertsModuleDisplayed() {
        return alertsModule.isDisplayed();
    }
}
