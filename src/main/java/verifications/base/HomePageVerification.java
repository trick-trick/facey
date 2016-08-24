package verifications.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.HomePage;
import util.driver.PageValidator;
import verifications.BaseVerification;

import java.util.ArrayList;
import java.util.List;

public class HomePageVerification extends BaseVerification {

    private HomePage page;

    public HomePageVerification(WebDriver driver) {
        super(driver);
        page = new HomePage(driver);
    }

    public String verifyElements() {
        StringBuilder errors = new StringBuilder();

        List<WebElement> elements = new ArrayList<>();

        elements.add(page.topButton());
        elements.add(page.newestButton());
        elements.add(page.myPhotoButton());

        if (!PageValidator.elementsAreAlignedHorizontally(elements)) {
            errors.append("Main menu elements have wrong alignment or ordering on the page");
        }

        return errors.toString();
    }
}
