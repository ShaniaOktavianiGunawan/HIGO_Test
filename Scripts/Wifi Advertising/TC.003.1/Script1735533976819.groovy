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

WebUI.click(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/span_Layanan HIGO'))

WebUI.click(findTestObject('Object Repository/Page_HIGO  WiFi Advertising/span_WiFi Advertising'))

WebUI.verifyElementPresent(findTestObject('Page_HIGO  WiFi Advertising/h1_WiFi Advertising'), 0)

WebUI.verifyElementPresent(findTestObject('Page_HIGO  WiFi Advertising/h2_Footprint HIGO'), 0)

WebUI.verifyElementPresent(findTestObject('Page_HIGO  WiFi Advertising/h2_Kenali pengguna melalui 4 langkah pendek_4fe2ee'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_HIGO  WiFi Advertising/h2_Maksimalkan campaign dengan CTR  completed view'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_HIGO  WiFi Advertising/h2_Keuntungan menggunakan WiFi ads'), 0)

WebUI.verifyElementPresent(findTestObject('Page_HIGO  WiFi Advertising/h2_Mitra kami'), 0)

WebUI.verifyElementPresent(findTestObject('Page_HIGO  WiFi Advertising/h6_Capai hasil campaign lebih efektif denga_325598'), 
    0)

WebUI.closeBrowser()

