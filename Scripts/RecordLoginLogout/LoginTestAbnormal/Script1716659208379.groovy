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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://metrodataacademy.id/')

WebUI.click(findTestObject('Page_Login Logout Metrodata Academy/a_Masuk'))

WebUI.navigateToUrl('https://metrodataacademy.id/sign-in')

WebUI.setText(findTestObject('Object Repository/Page_Login Logout Metrodata Academy/input__email'), 'christiansimanjuntak12@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Logout Metrodata Academy/input__password'), '26yoZb0Fg8S/8NrKc5x65w==')

WebUI.click(findTestObject('Object Repository/Page_Login Logout Metrodata Academy/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Login Logout Metrodata Academy/button_Try Again'))

WebUI.closeBrowser()

