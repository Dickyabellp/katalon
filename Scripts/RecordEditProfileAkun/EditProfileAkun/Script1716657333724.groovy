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

WebUI.navigateToUrl('https://metrodataacademy.id/')

WebUI.click(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/a_Masuk'))

WebUI.navigateToUrl('https://metrodataacademy.id/sign-in')

WebUI.setText(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/input__email'), 'christiansimanjuntak12@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/input__password'), 'AJxgTO7PuudFJYJNyubGtA==')

WebUI.click(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/button_Masuk'))

WebUI.click(findTestObject('Page_Edit Profile Akun Metrodata Academy/button_Hendrik Christian'))

WebUI.click(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/a_Akun Saya'))

WebUI.navigateToUrl('https://metrodataacademy.id/profile')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/select_Pilih Jenis KelaminLaki-LakiPerempuan'), 
    'L', true)

WebUI.click(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/input__phoneNumber'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/input__phoneNumber'), '85395374206')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/select_Pilih ProvinsiACEHSUMATERA UTARASUMA_0888d3'), 
    '31', true)

WebUI.selectOptionByValue(findTestObject('Page_Edit Profile Akun Metrodata Academy/select_Pilih KotaKABUPATEN KEPULAUAN SERIBU_039097'), 
    '3174', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/select_Pilih UniversitasUniversitas Stikuba_a88121'), 
    '5b14b6f4-07b8-49d5-ab63-c2d2cd8fb6ec', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/select_Pilih JurusanIlmu KomputerTeknik Ele_ad8856'), 
    'c5735516-b73f-42a0-8a5c-bf805242d142', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/select_Pilih GelarD3S1S2S3'), 
    'S1', true)

WebUI.click(findTestObject('Object Repository/Page_Edit Profile Akun Metrodata Academy/button_Simpan'))

WebUI.delay(4)

WebUI.closeBrowser()

