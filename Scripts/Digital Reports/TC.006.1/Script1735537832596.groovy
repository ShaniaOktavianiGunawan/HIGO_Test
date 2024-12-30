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

WebUI.navigateToUrl('https://higo.id/annualreport2024')

WebUI.click(findTestObject('Page_HIGO  Annual Report/svg_Baca Selengkapnya_lucide lucide-x h-4 w-4 text-white'))

WebUI.click(findTestObject('Object Repository/Page_HIGO  Annual Report/button_Download Full Report'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_HIGO  Annual Report/h1_HIGO DIGITAL  MANUAL 2024'), 0)

WebUI.setText(findTestObject('Object Repository/Page_HIGO  Annual Report/input_HIGO DIGITAL MANUAL 2024_firstName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_HIGO  Annual Report/input_HIGO DIGITAL MANUAL 2024_lastName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_HIGO  Annual Report/input_HIGO DIGITAL MANUAL 2024_email'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_HIGO  Annual Report/input_HIGO DIGITAL MANUAL 2024_phone'), '0812345678')

WebUI.setText(findTestObject('Object Repository/Page_HIGO  Annual Report/input_HIGO DIGITAL MANUAL 2024_company'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_HIGO  Annual Report/input_HIGO DIGITAL MANUAL 2024_jobTitle'), 'test')

WebUI.click(findTestObject('Object Repository/Page_HIGO  Annual Report/button_Download'))

WebUI.closeBrowser()

