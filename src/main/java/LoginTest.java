import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest {

    private AppiumDriver driver;

    @BeforeSuite
    public void setupAppium() throws MalformedURLException, InterruptedException {

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Vinod_Work\\Android_example\\UIAutomationtestApp\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAtutomater2");
//
//        AndroidDriver driver = new AndroidDriver<MobileElement>(new URL(Environment.URL), capabilities);

        System.out.println("******&&&&&&&&&&&&&&&****");
        driver =  UiWebDriver.getDriverInstance(UiWebDriver.MobileDriverType.DriveTypeAndroid);
        System.out.println("******&&&&&&&&&&&&&&&****"+driver);
        Thread.sleep(10000);
    }

    @Test
    public void dummyTest() {
        WebElement webElement = driver.findElementById("com.dotsofdots.uiautomationtestapp:id/username");
        webElement.sendKeys("Vinod Reddy Narra");
        System.out.println("&&&&&&&&&&&&&&&");
    }

}
