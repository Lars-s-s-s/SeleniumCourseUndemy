package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By authWiget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    /*
    * Метод перехода к определенному URL-адресу
    * */
    public void goToUrl(String url){
        driver.get(url);
    }
    /*
    * дождаемся появления видимости элемента в модели DOM
    * */
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void isAutWidgetPresent(){
        authWiget authFrame = driver.findElement(authWiget);
        waitElementIsVisible(authFrame);
    }
}
