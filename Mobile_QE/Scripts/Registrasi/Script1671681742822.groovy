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

Mobile.tap(findTestObject('Klik Lewati'), 0)

Mobile.tap(findTestObject('Register/KlikDaftar'), 0)

Mobile.tap(findTestObject('Register/Nama Lengkap'), 0)

Mobile.setText(findTestObject('Register/Nama Lengkap'), 'Rindha', 0)

Mobile.tap(findTestObject('Register/Email'), 0)

Mobile.setText(findTestObject('Register/Email'), 'tes003@gmail.com', 0)

Mobile.tap(findTestObject('Register/KataSandi'), 0)

Mobile.setText(findTestObject('Register/KataSandi'), '@Password123', 0)

Mobile.tap(findTestObject('Register/KonfirmasiKataSandi'), 0)

Mobile.setText(findTestObject('Register/KonfirmasiKataSandi'), '@Password123', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Register/DaftarButton'), 0)

Mobile.closeApplication()

