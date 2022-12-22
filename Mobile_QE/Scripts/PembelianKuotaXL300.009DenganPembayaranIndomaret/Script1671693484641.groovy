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

Mobile.startApplication('E:\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.EditText - mailmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.EditText - mailmail.com (1)'), 'tes001@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.EditText - 1234'), 0)

Mobile.setText(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.EditText - 1234 (1)'), '@Password123', 
    0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.ImageView - 087xxxxxxxxx'), 0)

Mobile.setText(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.ImageView - 087xxxxxxxxx (1)'), 
    '081098765432', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PembelianPulsaXL300.009/click300.002'), 0)

Mobile.tap(findTestObject('PembelianPulsaXL300.009/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.view.View (4)'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.view.View (5)'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.view.View (6)'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.view.View (7)'), 0)

Mobile.tap(findTestObject('Object Repository/PembelianPulsaXL300.009/android.widget.Button - Click here to simulate your payment with ALFAMART'), 
    0)

Mobile.closeApplication()

