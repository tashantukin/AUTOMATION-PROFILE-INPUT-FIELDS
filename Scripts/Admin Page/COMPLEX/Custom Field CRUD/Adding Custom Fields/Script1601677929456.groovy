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

WebUI.navigateToUrl('https://youhadmeathello.sandbox.arcadier.io/admin')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Admin/Plugin Page/Adding scripts/input_Your Email  Username_username'), 'natasha@arcadier.com')

WebUI.setEncryptedText(findTestObject('Admin/Plugin Page/Adding scripts/input_Your Password_password'), 'I7a4UsMF9MiFJG0HdBZ4hg==')

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/input_Your Password_login-submit'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Adding scripts/span_Plug-ins'))

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/a_Profile Input Field'))

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/a_Add Profile Input Field'))

WebUI.setText(findTestObject('Admin/Plugin Page/Adding scripts/input_Custom Field Name_custom_name'), 'New Textfield')

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/input_Add Option_saveCustomDetails'))

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/a_Add Profile Input Field'))

WebUI.setText(findTestObject('Admin/Plugin Page/Adding scripts/input_Custom Field Name_custom_name'), 'New Number')

WebUI.selectOptionByValue(findTestObject('Admin/Plugin Page/Adding scripts/select_Text                                _e22ab6'), 
    'number', true)

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/input_Add Option_saveCustomDetails'))

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/a_Add Profile Input Field'))

WebUI.setText(findTestObject('Admin/Plugin Page/Adding scripts/input_Custom Field Name_custom_name'), 'New Dropdown')

WebUI.selectOptionByValue(findTestObject('Admin/Plugin Page/Adding scripts/select_Text                                _e22ab6'), 
    'dropdown', true)

WebUI.setText(findTestObject('Admin/Plugin Page/Adding scripts/input_Options_checkbox-opt'), 'Option 1')

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/input_Add Option_saveCustomDetails'))

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/a_Add Profile Input Field'))

WebUI.setText(findTestObject('Admin/Plugin Page/Adding scripts/input_Custom Field Name_custom_name'), 'New Check box')

WebUI.selectOptionByValue(findTestObject('Admin/Plugin Page/Adding scripts/select_Text                                _e22ab6'), 
    'checkbox', true)

WebUI.setText(findTestObject('Admin/Plugin Page/Adding scripts/input_Options_checkbox-opt'), 'Option 1')

WebUI.click(findTestObject('Admin/Plugin Page/Adding scripts/input_Add Option_saveCustomDetails'))

WebUI.closeBrowser()

