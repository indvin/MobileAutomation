package foundation;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {

    private AppiumDriver driver;
    private String TAG;

    public ElementUtility(AppiumDriver driver, String tag) {
        this.driver = driver;
        this.TAG = tag;
    }

    public boolean isValidElement(WebElement webElement, String id) {
        if (webElement == null) {
            printLog("InvalidElement :"+id);
            return false;
        } else {
            return true;
        }
    }

    public boolean isValidElement(WebElement webElement) {
        if (webElement == null) {
            printLog("InvalidElement");
            return false;
        } else {
            return true;
        }
    }

    public void printLog(String message){
        System.out.println(TAG+ " :"+message);
    }
}
