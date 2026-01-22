package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppHomePage extends BasePage {

    /*private final By viewsMenuItem = By.xpath("//android.widget.TextView[@content-desc='Views']");
    private final By viewsScreenTitle = By.xpath("//android.widget.TextView[@text='Views']");*/
    private final By welcomeText =
            By.id("com.example.nour2:id/textView");

    private final By clickMeButton =
            By.id("com.example.nour2:id/button");


    public AppHomePage(WebDriver driver) {
        super(driver);
    }

    public void tapViewsMenuItem() {
        /*click(viewsMenuItem);*/
        driver.findElement(clickMeButton).click();

        String text = driver.findElement(welcomeText).getText();
        System.out.println(text);

    }

    public boolean isClickMeButtonDisplayed() {
        String text= driver.findElement(clickMeButton).getText();
        return text.equals("Click Me");
        /*WebElement element = waitForVisible(viewsScreenTitle);
        return element.isDisplayed();*/
    }
}
