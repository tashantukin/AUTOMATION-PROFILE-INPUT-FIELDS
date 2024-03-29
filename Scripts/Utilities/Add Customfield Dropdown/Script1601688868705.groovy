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

WebUI.callTestCase(findTestCase('Utilities/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/Navigate to Plugin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Plugin Page/Add New Text CF/a_Add Profile Input Field'))

WebUI.setText(findTestObject('Admin/Plugin Page/Add New Text CF/input_Custom Field Name_custom_name'), 'Sample Customfield Dropdown')

WebUI.selectOptionByValue(findTestObject('Admin/Plugin Page/Add New Text CF/select_Text                                _e22ab6'), 
    'dropdown', true)

WebUI.setText(findTestObject('Admin/Plugin Page/Add New Text CF/input_Options_checkbox-opt'), 'option 1')

WebUI.click(findTestObject('Admin/Plugin Page/Add New Text CF/input_Add Option_saveCustomDetails'))

WebUI.closeBrowser()

