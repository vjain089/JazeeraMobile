import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys
import org.xbill.DNS.APLRecord as Keys
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.mobile.driver.MobileDriverType

/*
// Set the Browserstack credentials: USERNAME and ACCESS_KEY
String browserStackServerURL = "https://richardlopez_6dFDlu:G69cRg3VnZy9ucsbGQgw@hub-cloud.browserstack.com/wd/hub";

DesiredCapabilities capabilities = new DesiredCapabilities();

capabilities.setCapability("device", "Samsung Galaxy S8");

//Set the app_url (returned on uploading app on Browserstack) in the 'app' capability
capabilities.setCapability('app', 'bs://3d4bc8aaa63bf43326bf14b372326e34bdc4f6d7');

AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(browserStackServerURL));
*/

Mobile.startApplication("/Users/vaibhavjain/git/DemoAndroid/androidapp/apkTest.apk", true)


Mobile.setText(findTestObject('Object Repository/PruebaMobileObject/android.widget.EditText - Enter name here'), 'Juan Cruz', 
    0)

Mobile.tap(findTestObject('Object Repository/PruebaMobileObject/android.widget.Button - Lets  Shop'), 0)

Mobile.tap(findTestObject('Object Repository/PruebaMobileObject/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/PruebaMobileObject/android.widget.TextView - ADD TO CART (1)'), 0)

Mobile.tap(findTestObject('Object Repository/PruebaMobileObject/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/PruebaMobileObject/android.widget.CheckBox - Send me e-mails on discounts related to selected products in future'), 
    0)

Mobile.tap(findTestObject('Object Repository/PruebaMobileObject/android.widget.Button - Visit to the website to complete purchase'), 
    0)

Mobile.closeApplication()

