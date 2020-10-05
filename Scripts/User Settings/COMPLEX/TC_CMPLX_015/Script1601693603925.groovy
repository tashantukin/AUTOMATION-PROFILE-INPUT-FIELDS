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

WebUI.callTestCase(findTestCase('Utilities/Add New Text Custom Field'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/Navigate to Buyer Settings'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/User/custom values/input_SAMPLE TEXT CUSTOMFIELD_Sample Text C_ce5c8c'), 
    'customfield value')

WebUI.click(findTestObject('User/accept_cookies'))

WebUI.click(findTestObject('User/custom values/a_NEXT'))

WebUI.click(findTestObject('User/custom values/a_SAVE'))

WebUI.mouseOver(findTestObject('User/i_EN_icon icon-down'))

WebUI.click(findTestObject('User/a_Settings'))

WebUI.verifyElementAttributeValue(findTestObject('User/custom values/input_SAMPLE TEXT CUSTOMFIELD_Sample Text C_ce5c8c'), 
    'value', 'customfield value', 0)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/Deleting Custom Field'), [:], FailureHandling.STOP_ON_FAILURE)

