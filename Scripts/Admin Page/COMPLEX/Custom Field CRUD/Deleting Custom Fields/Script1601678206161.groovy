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

WebUI.setText(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/input_Your Email  Username_username'), 
    'natasha@arcadier.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/input_Your Password_password'), 
    'I7a4UsMF9MiFJG0HdBZ4hg==')

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/input_Your Password_login-submit'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/a_Profile Input Field'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/i_Textfield_icon icon-delete'))

WebUI.click(findTestObject('Admin/Plugin Page/Deleting Custom Fields/del_confirm'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/i_Textfield_icon icon-delete'))

WebUI.click(findTestObject('Admin/Plugin Page/Deleting Custom Fields/del_confirm'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/i_Textfield_icon icon-delete'))

WebUI.click(findTestObject('Admin/Plugin Page/Deleting Custom Fields/del_confirm'))

WebUI.click(findTestObject('Object Repository/Admin/Plugin Page/Deleting Custom Fields/i_Checkbox_icon icon-delete'))

WebUI.click(findTestObject('Admin/Plugin Page/Deleting Custom Fields/del_confirm'))

WebUI.closeBrowser()

