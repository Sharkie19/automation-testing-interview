package Mobile;

import org.example.pages.AppHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppNavigationTest extends BaseMobileTest {

    @Test
    public void userCanOpenViewsScreen() {
        AppHomePage homePage = new AppHomePage(driver);

        // Tap on "Views" menu item
        homePage.tapViewsMenuItem();

        // Assert that the Views screen is displayed
        Assert.assertTrue(
                homePage.isClickMeButtonDisplayed(),
                "click me button should be displayed on application launch."
        );
    }
}
