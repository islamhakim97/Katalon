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

WebUI.callTestCase(findTestCase('OrangeHRM/Valid Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/a_PIM'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/input_Report Name_oxd-input oxd-input--focus'), 
    ReportName)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_Current Employees Only_oxd-icon bi-caret-_0b22a7'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_Current Employees Only_oxd-icon bi-caret-_0b22a7'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_Employee Name_oxd-icon bi-plus'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_Employee Name_oxd-icon bi-plus'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/button_Home Telephone_oxd-icon-button orang_ce2e83'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_Work Telephone_oxd-icon bi-plus'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/input'), 'islam')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/div_islamreport1'), 0)

