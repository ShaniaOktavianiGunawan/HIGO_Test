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

WebUI.click(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/svg_Baca Selengkapnya_lucide lucide-x h-4 w_ac405a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/h1_Solusi Menyeluruh Pemasaran Digital deng_ff4928'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/h2_HIGO hadir membawa dampak signifikan mel_8daacd'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/h2_Bagaimana HIGO Bisa Bantu Penuhi Kebutuh_5a2da9'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/h2_Apa kata mereka'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/h2_Partner  klien'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HIGO  Solusi Menyeluruh Pemasaran Digi_8fd6e3/h3_Pertanyaan seputar HIGO'))

WebUI.closeBrowser()

