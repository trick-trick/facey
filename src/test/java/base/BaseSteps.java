package base;

import org.openqa.selenium.WebDriver;
import pages.base.HomePage;
import verifications.base.*;

public class BaseSteps {

    protected static WebDriver driver;

    protected static HomePage homePage;

    protected static HomePageVerification homePageVerification;

    protected static void init() {
        homePage = new HomePage(driver);

        homePageVerification = new HomePageVerification(driver);
    }
}
