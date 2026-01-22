package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

    // Login form locators
    private final By loginEmailInput    = By.cssSelector("input[data-qa='login-email']");
    private final By loginPasswordInput = By.cssSelector("input[data-qa='login-password']");
    private final By loginButton        = By.cssSelector("button[data-qa='login-button']");
    private final By loggedInUser = By.linkText("Logout");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        type(loginEmailInput, email);
        type(loginPasswordInput, password);
        click(loginButton);
    }

    //assert user logged in successful
    public void successfulLogin() {

        Assert.assertTrue(
                waitForVisible(loggedInUser).isDisplayed(),
                "Logout button is not visible! Login was not successful"
        );
    }

}
