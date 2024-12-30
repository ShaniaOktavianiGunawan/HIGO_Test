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

WebUI.navigateToUrl('https://higo.id/wifi-advertising')

WebUI.click(findTestObject('Object Repository/Page_HIGO  WiFi Advertising/svg_Baca Selengkapnya_lucide lucide-x h-4 w_ac405a'))

WebUI.scrollToElement(findTestObject('Page_HIGO  WiFi Advertising/h6_Capai hasil campaign lebih efektif denga_325598'), 
    0)

WebUI.click(findTestObject('Page_HIGO  WiFi Advertising/a_Beriklan sekarang'))

WebUI.verifyOptionPresentByValue(findTestObject('Page_HIGO  WiFi Advertising/select_HIGOspotIntegrated Digital AgencyWiFi Advertising'), 
    'Wifi Advertising', false, 0)

WebUI.closeBrowser()

