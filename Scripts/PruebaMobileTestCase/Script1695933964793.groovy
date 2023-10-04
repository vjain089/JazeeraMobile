import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
def apkPath = System.getProperty("user.dir") + '//General-Store.apk'
println("Ruta del archivo APK: " + apkPath)
Mobile.startApplication(apkPath, true)

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

