import foundation.UiWebDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest {

    private AppiumDriver driver;

    @BeforeSuite
    public void setupAppium() throws MalformedURLException, InterruptedException {

        System.out.println("******&&&&&&&&&&&&&&&****");
        driver =  UiWebDriver.getDriverInstance(UiWebDriver.MobileDriverType.DriveTypeAndroid);
        System.out.println("is valid driver  ******&&&&&&&&&&&&&&&****"+driver);
        Thread.sleep(10000);
    }

    @Test
    public void testCalc() {
        driver.launchApp();
    }

   // @Test
    public void scrollMenu1() throws InterruptedException {

        Actions actions = new Actions(driver);




        // TouchActions t = new TouchActions(driver);
        //WebElement webElement = driver.findElementByXPath("//android.widget.Button[@text = \"vinod Text Item 5\"]");
       // webElement.click();
        WebElement webElement = driver.findElementById("com.dotsofdots.vehiclemileage:id/menuRecyclerView");

        actions.dragAndDropBy(webElement, 0, -1000).perform();

        Thread.sleep(5000);
        WebElement graphMenu = driver.findElementByXPath("//android.widget.TextView[@text='Show fuel usage']");

        WebElement w = (WebElement) driver.findElementsByClassName("android.view.ViewGroup").get(2);
        try {
            w.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Actions tapAction = new Actions(driver);
        //tapAction.click(graphMenu);
        //webElement.click();
        Thread.sleep(15000);

        //t.longPress(webElement).longPress((WebElement) new LongPressOptions().withDuration(Duration.ofSeconds(30))).perform();
        //actions.clickAndHold(webElement).pause(5000).perform();
    }


}
