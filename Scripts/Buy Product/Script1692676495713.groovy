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

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lewati 1'), 3)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lewati 2'), 3)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lewati 3'), 3)

WebUI.delay(10)

Mobile.tap(findTestObject('Buy Product/Alert - Tutup'), 5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Alert - Close X'), 5)

Mobile.tap(findTestObject('Buy Product/Icon - Search'), 5)

Mobile.setText(findTestObject('Buy Product/Textfield - Search Keyword'), 'Beli 1 Gratis 1' + '\\n', 5)

WebUI.delay(5)

Mobile.tap(findTestObject('Buy Product/Button - Lihat Semua'), 5)

Mobile.tap(findTestObject('Buy Product/Button - Filter'), 5)

Mobile.tap(findTestObject('Buy Product/List - Produk Terbaru'), 5)

Mobile.tap(findTestObject('Buy Product/Button - Terapkan'), 5)

WebUI.delay(5)

Mobile.scrollToText('Appetite')

Mobile.verifyElementVisible(findTestObject('Buy Product/Text - Product Price'), 5)

Mobile.verifyElementVisible(findTestObject('Object Repository/Buy Product/Text - Product Titles'), 5)

Mobile.tap(findTestObject('Buy Product/Button - Product Image'), 5)

WebUI.delay(10)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Add Keranjang'), 5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Masuk Keranjang'), 5)

Mobile.verifyElementText(findTestObject('Object Repository/Buy Product/Text - Berhasil Menambahkan ke Keranjang'), 'Berhasil Menambahkan ke Keranjang')

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lihat Keranjang'), 5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Lanjut ke Pembayaran'), 5)

Mobile.verifyElementText(findTestObject('Object Repository/Buy Product/Text - Login'), 'Login')

Mobile.tap(findTestObject('Object Repository/Buy Product/Textfield - Email atau No handphone'), 5)

Mobile.setText(findTestObject('Buy Product/Textfield - Email atau No handphone'), 'dwinata@gmail.com', 5)

Mobile.tap(findTestObject('Object Repository/Buy Product/Textfield - Kata sandi'), 5)

Mobile.setText(findTestObject('Buy Product/Textfield - Kata sandi'), 'Password1122', 5)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Buy Product/Button - Masuk'), 5)

WebUI.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/Buy Product/Text - Notification Error'), 'Informasi tidak valid. Jika ada keluhan silakan klik icon chat di kanan bawah.')

Mobile.closeApplication()

