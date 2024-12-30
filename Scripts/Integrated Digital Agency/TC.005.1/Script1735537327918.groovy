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

WebUI.click(findTestObject('Object Repository/Page_HIGO  Integrated Digital Agency/span_Integrated Digital Agency'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Integrated Digital Agency/h1_Integrated Digital Agency'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Integrated Digital Agency/h2_Selangkah lebih maju di setiap campaign,_968c85'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Integrated Digital Agency/h2_Sekilas tentang Integrated Digital Agency'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Integrated Digital Agency/h2_Lihat bagaimana HIGO mengkurasi ide menj_ed0028'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Integrated Digital Agency/h2_Klien kami'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Integrated Digital Agency/h6_Jalankan setiap campaign kreatif yang le_32326a'))

WebUI.closeBrowser()

