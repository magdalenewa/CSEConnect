package cseConnect;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login {

	public static void main(String[] args) {

		AppiumDriver<MobileElement> driver = null;
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
        dc.setCapability("appPackage", "com.draeger.connect.cse");
		dc.setCapability("appActivity", "com.draeger.connect.cse.MainActivity");

        
        try {
			driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
