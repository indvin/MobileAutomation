package foundation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import foundation.DriverConfig;
import foundation.Environment;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MobileDriverParser {

    public AppiumDriver parseMobileDriverConfig() throws IOException {

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        DriverConfig driverConfig = mapper.readValue(new File("androidconfig.yml"), DriverConfig.class);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"5.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, driverConfig.getDeviceName());
       // capabilities.setCapability(MobileCapabilityType.APP, driverConfig.getAppPath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, driverConfig.getAutomationName());
        //capabilities.setCapability("appActivity", "com.dotsofdots.mainmenu.MainMenuActivity");
        //capabilities.setCapability("appActivity","com.android.calendar.event.EditEventActivity");
        capabilities.setCapability("appPackage", "com.google.android.calendar");


        capabilities.setCapability("appActivity","com.android.calendar.AllInOneActivity");
       //com.google.android.calendar/com.android.calendar.AllInOneActivity
        return new AndroidDriver<MobileElement>(new URL(Environment.URL), capabilities);
    }

    public AppiumDriver parseMobileDriverConfig1() throws IOException {

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        DriverConfig driverConfig = mapper.readValue(new File("androidconfig.yml"), DriverConfig.class);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, driverConfig.getDeviceName());
        capabilities.setCapability(MobileCapabilityType.APP, driverConfig.getAppPath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, driverConfig.getAutomationName());

        return new AndroidDriver<MobileElement>(new URL(Environment.URL), capabilities);
    }
}
