package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import web.BaseWebMobileElement;

import java.util.List;

public abstract class BasePage extends BaseWebMobileElement {

    public BasePage(WebDriver driver) {
        super(driver, 10);
    }

    public BasePage(WebDriver driver, int timeOut) {
        super(driver, timeOut);
    }


    public WebElement getElementByText(String text) {
        if (getElements(By.xpath(String.format("//body//*[normalize-space(text())='%s']", text))).size() > 0) {
            return getElements(By.xpath(String.format("//body//*[normalize-space(text())='%s']", text))).get(0);
        } else {
            return null;
        }
    }

    protected WebElement getElement(By by) {
        return getWebElement(by);
    }

    protected WebElement getElement(ExpectedCondition<WebElement>  condition) {
        return getWebElement(condition);
    }

    protected List<WebElement> getElements(By by) {
        return getWebElements(by);
    }
}
