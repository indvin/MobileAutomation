package foundation;

import io.appium.java_client.AppiumDriver;



public class UiWebDriver implements MobileAutomationDriver {

    private static AppiumDriver driver;
    private UiWebDriver() {

    }

    public static AppiumDriver getDriverInstance(UiWebDriver.MobileDriverType driverType) {
        if (driver != null) {
            return driver;
        }else {
            return new UiWebDriver().initializeDriver(driverType);
        }
    }

    public enum MobileDriverType {
        DriveTypeAndroid,
        DriverTypeIos;
    }

    public AppiumDriver initializeDriver(UiWebDriver.MobileDriverType driverType) {
        System.out.println("** InitializeDriver**");
        switch (driverType) {

            case DriveTypeAndroid:
                System.out.println("** InitializeDriver 33 **");
                MobileDriverParser parser = new MobileDriverParser();
                try {
                    System.out.println("** InitializeDriver 66 **");
                    System.out.println("** InitializeDriver 44 **");
                    return parser.parseMobileDriverConfig();

                } catch (Exception e) {
                    System.out.println("** InitializeDriver 55 **" +e.getMessage());
                }

                break;
            case DriverTypeIos:
                break;
            default:
                System.out.println("** InitializeDriver 22 **");
                throw new IllegalStateException("Unexpected value: " + driverType);
        }
        return null;
    }
}
