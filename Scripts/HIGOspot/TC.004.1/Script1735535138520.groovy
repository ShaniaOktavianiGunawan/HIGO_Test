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

WebUI.navigateToUrl('https://higo.id/')

WebUI.click(findTestObject('Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/svg_Baca Selengkapnya_lucide lucide-x h-4 w_ac405a'))

WebUI.click(findTestObject('Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/span_Layanan HIGO'))

WebUI.click(findTestObject('Object Repository/Page_HIGO  HIGOspot/span_HIGOspot'))

WebUI.verifyElementVisible(findTestObject('Page_HIGO  HIGOspot/h1_HIGOspot'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  HIGOspot/h2_Tetap terhubung dengan pelanggan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  HIGOspot/h2_Lebih dari 2000 lokasi telah menjadi bag_ac9797'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  HIGOspot/h2_Jelajahi lokasi HIGOspot'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  HIGOspot/h2_Apa kata mereka'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  HIGOspot/h2_Mitra Kami'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  HIGOspot/h6_Akselerasi bisnis bersama HIGOspot'))

WebUI.closeBrowser()

