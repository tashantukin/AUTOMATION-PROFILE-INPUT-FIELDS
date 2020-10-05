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

WebUI.setText(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Your Email  Username_username'), 
    'natasha@arcadier.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Your Password_password'), 
    'I7a4UsMF9MiFJG0HdBZ4hg==')

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Your Password_login-submit'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/span_Plug-ins'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/a_Profile Input Field'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/i_Textfield_icon icon-edit'))

WebUI.setText(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Custom Field Name_custom_name'), 
    'New Textfield Edited')

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Add Option_saveCustomDetails'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/i_Number_icon icon-edit'))

WebUI.setText(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Custom Field Name_custom_name'), 
    'New Number Edited')

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Add Option_saveCustomDetails'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/i_Dropdown_icon icon-edit'))

WebUI.setText(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Custom Field Name_custom_name'), 
    'New Dropdown Edited')

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Add Option_saveCustomDetails'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/i_Checkbox_icon icon-edit'))

WebUI.setText(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Custom Field Name_custom_name'), 
    'New Check box Edited')

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Editing Scripts/input_Add Option_saveCustomDetails'))

WebUI.closeBrowser()

