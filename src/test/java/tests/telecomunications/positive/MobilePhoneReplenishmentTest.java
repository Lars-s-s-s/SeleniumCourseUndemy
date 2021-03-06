package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import pages.telecomunications.MobilePhoneReplenishmentPage;
import tests.base.BaseTest;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentTest extends BaseTest {

    MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage(driver);

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAutWidgetPresent();
    }
}
