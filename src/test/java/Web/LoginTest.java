package Web;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseWebTest {

    // TODO: change these to your real test account data
    private static final String VALID_EMAIL = "nourhassan1909@gmail.com";
    private static final String VALID_PASSWORD = "123456";
    private static final String EXPECTED_USERNAME = "YourName";

    @Test
    public void userCanLoginSuccessfully() {
        HomePage homePage = new HomePage(driver);

        // Navigate to Login page
        LoginPage loginPage = homePage.clickSignupLogin();

        // Perform login
        loginPage.login(VALID_EMAIL, VALID_PASSWORD);

        // Assert Login is Successful
        loginPage.successfulLogin();
    }
}

