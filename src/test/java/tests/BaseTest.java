package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected AndroidDriver driver;

    public void setUp() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setDeviceName("emulator-5554");
            options.setApp("D:\\Software Environtment\\Docker\\AppiumLogin\\src\\main\\app\\app-debug.apk");
            options.setAutomationName("UiAutomator2");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
