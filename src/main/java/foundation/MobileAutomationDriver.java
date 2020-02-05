package foundation;

import io.appium.java_client.AppiumDriver;

interface MobileAutomationDriver {
    AppiumDriver initializeDriver(UiWebDriver.MobileDriverType type);
}