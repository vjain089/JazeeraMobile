import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startApplication('/Users/vaibhavjain/git/DemoAndroid/androidapp/MR26_Android_Test_Final_Build.apk', true)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.EditText - From'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.EditText - To'), 0)

Mobile.scrollToText('Bangalore', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.LinearLayout (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.EditText - Departure'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.TextView - November, 2023'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.TextView - 2', [('day') : '8']), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.Button - Show Flights'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.LinearLayout (4)'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.LinearLayout (10)'), 0)

Mobile.scrollToText('Fare Rules')

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.LinearLayout (7)'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.TextView - Passenger Details'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.Button - CONTINUE AS GUEST'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.TextView - Mr'), 0)

Mobile.setText(findTestObject('Jazeera_Booking/android.widget.EditText - First Name'), 'Katalon', 0)

Mobile.setText(findTestObject('Jazeera_Booking/android.widget.EditText - Last Name'), 'Demo', 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.Spinner (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Jazeera_Booking/android.widget.AutoCompleteTextView -    Search'), 'india', 
    0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.LinearLayout (8)'), 0)

Mobile.scrollToText('Mobile')

Mobile.setText(findTestObject('Jazeera_Booking/android.widget.EditText - Email'), 'vjain@katalon.com', 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.Spinner (1) (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Jazeera_Booking/android.widget.AutoCompleteTextView -    Search'), 'india', 
    0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.LinearLayout (8)'), 0)

Mobile.setText(findTestObject('Jazeera_Booking/android.widget.EditText - Mobile'), '3787485782', 0)

Mobile.setText(findTestObject('Jazeera_Booking/android.widget.EditText - City'), 'Bangalore', 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.TextView - Travel Extras'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.ImageView (2)'), 0)

Mobile.setText(findTestObject('Jazeera_Booking/android.widget.EditText - Date of birth (DD-MMM-YYYY)'), '24-May-1989', 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.TextView - Travel Extras'), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.RelativeLayout'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.LinearLayout -Seat', [('seat') : '3']), 0)

Mobile.tap(findTestObject('Object Repository/Jazeera_Booking/android.widget.TextView - Proceed'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Jazeera_Booking/android.widget.TextView - Flight Summary'), 0)

Mobile.closeApplication()