package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();

            // Configurar modo headless
            if (ConfigReader.getBooleanProperty("headless")) {
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1920,1080");
            }

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(ConfigReader.getIntProperty("implicit.wait"), TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            try {
                driver.quit(); // Intenta cerrar el navegador de manera estándar
            } catch (Exception e) {
                System.out.println("Error al cerrar el driver: " + e.getMessage());
            } finally {
                driver = null;
            }
        }
        // ✅ Forzar cierre de cualquier proceso de ChromeDriver que haya quedado abierto
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
                Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
            } else {
                Runtime.getRuntime().exec("pkill chromedriver");
                Runtime.getRuntime().exec("pkill chrome");
            }
        } catch (Exception e) {
            System.out.println("Error al forzar el cierre de ChromeDriver: " + e.getMessage());
        }
    }
}