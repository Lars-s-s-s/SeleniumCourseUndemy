package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    // инициализация драйвера
    protected WebDriver driver = CommonActions.createDriver();
    // пердача драйвера в констукрор страницы
    protected BasePage basePage = new BasePage(driver);
    protected CarLoansPage carLoansPage = new CarLoansPage(driver);

    @AfterEach
    // чистка кук и локалс сторадж
    void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
        }

    }
    // закрытие браузера
    @AfterAll
    void close(){
        if (!HOLD_BROWSER_OPEN) {
            driver.close();
        }
    }
}
