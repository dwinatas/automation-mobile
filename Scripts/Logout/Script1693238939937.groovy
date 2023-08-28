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
import pathkeyword.pathkeyword as pathkeyword

Mobile.startApplication(pathkeyword.filePathApps() + '/com.mobileappruparupa_2023-08-11.apk', true)
//note: untuk apk nya ada di file androidapp dan harus di unzip dulu karena file nya terlalu besar

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lewati 1'), 5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lewati 2'), 5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lewati 3'), 5)

WebUI.delay(10)

Mobile.tap(findTestObject('Buy Product/Alert - Tutup'), 5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Alert - Close X'), 5)

Mobile.tap(findTestObject('Object Repository/Login/Button - Akun Saya'), 5)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Login/Textfield - Email atau No handphone'), 5)

Mobile.setText(findTestObject('Login/Textfield - Email atau No handphone'), 'dwinatasrgh@gmail.com', 5)

Mobile.tap(findTestObject('Object Repository/Login/Textfield - Kata sandi'), 5)

Mobile.setText(findTestObject('Login/Textfield - Kata sandi'), 'Testing123', 5)

Mobile.tap(findTestObject('Object Repository/Login/Button - Masuk'), 5)

WebUI.delay(5)

Mobile.scrollToText('Keluar')

Mobile.tap(findTestObject('Object Repository/Logout/Button - Keluar'), 5)

Mobile.verifyElementText(findTestObject('Object Repository/Logout/Text - Login'), 'Login')

Mobile.closeApplication()

