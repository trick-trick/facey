package verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class BaseVerification{

    private WebDriver driver;

    public BaseVerification(WebDriver driver) {
        this.driver = driver;
    }


    public String verifyElementExists(WebElement element) {
        String error = "";

        if (element == null || !element.isDisplayed()) {
            error = "Element is absent";
        }

        return error;
    }

    protected String verifyUrl(String expectedUrl) {
        String error = "";

        String actualUrl = driver.getCurrentUrl();

        if (!actualUrl.equals(expectedUrl)) {
            error = String.format("URL is wrong. Expected is '%s' and actual is '%s'",
                    expectedUrl,
                    actualUrl
            );
        }

        return error;
    }
}
