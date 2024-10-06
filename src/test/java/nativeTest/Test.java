package nativeTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import contactManager_Native.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Test extends Capabilities{
	AndroidDriver<AndroidElement>driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
		driver = cap();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@org.testng.annotations.Test
	public void tc() {
		
		System.out.println("Contact Manager is opened");
		
		//To click on show invisible contacts checkbox
		driver.findElement(MobileBy.AccessibilityId("Show Invisible Contacts (Only)")).click();
		
		//To uncheck on show invisible contacts checkbox 
		driver.findElement(MobileBy.AccessibilityId("Show Invisible Contacts (Only)")).click();
		
		//To click on Add to contacts button
		driver.findElement(MobileBy.AccessibilityId("Add Contact")).click();
		
		//To click and write on contact Name
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Vaishnavi");
		

		driver.findElement(MobileBy.id("com.example.android.contactmanager:id/contactPhoneEditText")).sendKeys("917828184869");

		//To click on home option
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Home\")")).click();
        
		//To click on work option
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Work\")")).click();
		
		//To click on work option again to select mobile option from the dropdown
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Work\")")).click();
		
        //To click on Mobile option 
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Mobile\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Mobile\")")).click();
		
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Other\")")).click();

		//To click on contact email
		driver.findElement(MobileBy.id("com.example.android.contactmanager:id/contactEmailEditText")).sendKeys("");
		
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Home\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Other\")")).click();
		
		//To click on save option
		driver.findElement(MobileBy.AccessibilityId("Save")).click();
		
		// To open notification
		driver.openNotifications();
		
		//To click on battery saver
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		
		// To unclick on battery saver
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		
		
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    
	    driver.pressKey(new KeyEvent(AndroidKey.HOME));
	    
	    driver.pressKey(new KeyEvent(AndroidKey.HOME));

		

	}

}
