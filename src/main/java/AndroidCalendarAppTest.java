import foundation.ElementUtility;
import foundation.UiWebDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AndroidCalendarAppTest {

    public static String TAG = "AndroidCalendarAppTest";
    private AppiumDriver driver;
    private ElementUtility helper;


    @BeforeSuite
    public void setupAppium() throws MalformedURLException, InterruptedException {
        driver = UiWebDriver.getDriverInstance(UiWebDriver.MobileDriverType.DriveTypeAndroid);
        helper = new ElementUtility(driver, TAG);
        helper.printLog("setupAppium");
        helper.printLog("Checking for the driver instance");
        helper.printLog(driver.toString());
        Thread.sleep(10000);
    }

    //@Test
    public void doneButton() {
        WebElement done = driver.findElementById("com.android.calendar:id/done_button");
        done.click();
    }

   @Test
    public void nextRightButtonClick() throws InterruptedException {
        //WebElement webElement = driver.findElementById("com.android.calendar:id/right_arrow");

        WebElement webElement;
        try {
            do {
                webElement = driver.findElementById("com.android.calendar:id/right_arrow");
                if (helper.isValidElement(webElement)) {
                    webElement.click();
                    Thread.sleep(500);
                }
            } while (helper.isValidElement(webElement));

           // WebElement done = driver.findElementById("com.android.calendar:id/done_button");
            WebElement done = driver.findElementByAccessibilityId("Got it");

            done.click();
            //done.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("** exception"+e.getMessage());
        }

        //com.android.calendar:id/right_arrow
        //com.android.calendar:id/done_button

//        com.android.calendar:id/add_event_button
//
//                //event titel
//        com.android.calendar:id/input
//
//            //Start date
//        com.android.calendar:id/start_date
//                //start time
//        com.android.calendar:id/start_time
//
//                //time hours ID
//        android:id/hours
//                //hours selection accessible ID
//        accessibility id
//
//        //Minutes ID
//        android:id/minutes
//
//
//
//
//        //end date
//        com.android.calendar:id/end_date
//            //end time id
//        com.android.calendar:id/end_time
//
//
//        //date picker accessable ID
//        "07 May 2020"
//





    }

}
