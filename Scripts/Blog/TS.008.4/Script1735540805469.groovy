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

WebUI.navigateToUrl('https://blog.higo.id/')

WebUI.click(findTestObject('Page_Artikel Seputar Teknologi, Digital Mar_7ba03e/h6_Mandiri Hadirkan Jakarta Coffee Week 202_b05928'))

WebUI.scrollToElement(findTestObject('Page_Mandiri Hadirkan Jakarta Coffee Week 2024 Rayakan Kemajuan Kultur Kopi Spesialti Indonesia/h2_Topik Terkait'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Mandiri Hadirkan Jakarta Coffee Week 2_c4a48c/button_Jakarta Coffee Week'))

WebUI.verifyElementVisible(findTestObject('Page_Artikel Seputar Teknologi, Digital Mar_7ba03e/h6_Mandiri Hadirkan Jakarta Coffee Week 202_b05928'))

WebUI.closeBrowser()

