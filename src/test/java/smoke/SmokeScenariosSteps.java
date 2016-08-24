package smoke;

import base.BaseSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import util.driver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

import static environment.EnvironmentFactory.isMobile;

public class SmokeScenariosSteps extends BaseSteps {

    @Given("^start driver$")
    public void setUp() {
        WebDriverFactory webDriverFactory = new WebDriverFactory();

        driver = webDriverFactory.getDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (!isMobile()) {
            driver.manage().window().maximize();
        }

        init();
    }

    @Given("^go to url '(.+)'$")
    public void go_to_url(String url) {
        driver.get(url);
    }

    @Then("^base elements of Home page are presented$")
    public void base_elements_of_Home_page_are_presented(){
        String error = homePageVerification.verifyElements();
        Assert.assertTrue(error, error.length() == 0);
    }

    @Given("^close driver$")
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}