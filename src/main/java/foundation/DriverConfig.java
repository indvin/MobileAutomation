package foundation;

import java.net.MalformedURLException;

public class DriverConfig {
    private String deviceName;
    private String appPath;
    private String automationName;

    public String getDeviceName() {
        return deviceName;
    }

    public String getAppPath() throws MalformedURLException {
        return (appPath);
    }

    public String getAutomationName() {
        return automationName;
    }

}
