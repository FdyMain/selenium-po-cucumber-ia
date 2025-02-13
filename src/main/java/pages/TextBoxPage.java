package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    WebDriver driver;

    @FindBy(id = "userName")
    WebElement fullNameInput;

    @FindBy(id = "userEmail")
    WebElement emailInput;

    @FindBy(id = "currentAddress")
    WebElement addressInput;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(id = "name")
    WebElement nameResult;

    @FindBy(id = "email")
    WebElement emailResult;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillForm(String name, String email, String address) {
        fullNameInput.sendKeys(name);
        emailInput.sendKeys(email);
        addressInput.sendKeys(address);
    }

    public void clickSubmitButton() {
        // ✅ Eliminar iframes de anuncios antes de hacer clic
        removeAds();

        // ✅ Desplazarse hasta el botón para asegurarse de que es visible
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);

        // ✅ Hacer clic usando JavaScript para evitar que el anuncio bloquee el botón
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
    }

    public String getNameResult() {
        return nameResult.getText();
    }

    public String getEmailResult() {
        return emailResult.getText();
    }

    // ✅ Método para eliminar anuncios que bloquean elementos
    private void removeAds() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var iframes = document.getElementsByTagName('iframe'); for (var i = 0; i < iframes.length; i++) { iframes[i].parentNode.removeChild(iframes[i]); }");
    }
}