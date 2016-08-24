package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver, 10);
    }

    public WebElement topButton(){
        return getElement(By.id("top-photos"));
    }

    public WebElement newestButton(){
        return getElement(By.id("new-photos"));
    }

    public WebElement myPhotoButton(){
        return getElement(By.id("my-photos"));
    }


}
