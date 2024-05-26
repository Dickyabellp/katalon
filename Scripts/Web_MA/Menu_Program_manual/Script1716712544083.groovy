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

WebUI.navigateToMaskedUrl('https://metrodataacademy.id/')

WebUI.click(findTestObject('MA_Manual/klik Login'))

WebUI.click(findTestObject('MA_Manual/Input_Username'))

WebUI.setText(findTestObject('MA_Manual/Input_Username'), 'Papahgilak@gmail.com')

WebUI.click(findTestObject('MA_Manual/Input_Password'))

WebUI.setEncryptedText(findTestObject('MA_Manual/Input_Password'), 'ANgLrNN9LeX238E+iUxpGw==')

WebUI.click(findTestObject('MA_Manual/Klik_Masuk'))

WebUI.click(findTestObject('MA_Manual/Klik_Program'))

WebUI.click(findTestObject('MA_Manual/Klik_Detail_MetrodataTraining'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('MA_Manual/Verify_MetrodataTraining'), 'Metrodata Training')

WebUI.click(findTestObject('MA_Manual/Klik_HomeMA'))

WebUI.click(findTestObject('MA_Manual/Klik_Program'))

WebUI.click(findTestObject('MA_Manual/Klik_Detail_ITCamp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('MA_Manual/Verify_ITCamp'), 'Metrodata IT-Camp')

WebUI.click(findTestObject('MA_Manual/Klik_HomeMA'))

WebUI.click(findTestObject('MA_Manual/Klik_Program'))

WebUI.click(findTestObject('MA_Manual/Klik_Detail_Internship'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('MA_Manual/Verify_Internship'), 'Metrodata Internship')

WebUI.click(findTestObject('MA_Manual/Klik_HomeMA'))

WebUI.click(findTestObject('MA_Manual/Klik_Program'))

WebUI.click(findTestObject('MA_Manual/Klik_Detail_Mengajar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('MA_Manual/Verify_Mengajar'), 'Metrodata Mengajar')

WebUI.closeBrowser()

