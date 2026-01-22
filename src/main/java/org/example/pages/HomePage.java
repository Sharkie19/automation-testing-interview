package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By signupLoginLink = By.linkText("Signup / Login");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickSignupLogin() {
        click(signupLoginLink);
        return new LoginPage(driver);
    }
}
