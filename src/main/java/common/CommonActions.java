package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class CommonActions {

    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "chrome_mac":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_mac64");
                driver = new ChromeDriver();
                break;
            case "CHROME_WINDOWS":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_win32.exe");
                driver = new ChromeDriver();
                break;
            case "chrome_linux64":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64");
                driver = new ChromeDriver();
                break;
            default:
                Assertions.fail("Не корректное имя браузера " + BROWSER_AND_PLATFORM);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;

    }
}
