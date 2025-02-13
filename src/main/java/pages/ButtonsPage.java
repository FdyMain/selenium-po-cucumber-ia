package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
    WebDriver driver;
    Actions actions;

    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickButton;

    @FindBy(id = "doubleClickMessage")
    WebElement doubleClickMessage;

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void doubleClickButton() {
        actions.doubleClick(doubleClickButton).perform();
    }

    public String getDoubleClickMessage() {
        return doubleClickMessage.getText();
    }
}