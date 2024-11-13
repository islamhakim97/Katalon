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

WebUI.callTestCase(findTestCase('OrangeHRM/Search SystemUsers'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/button_Add'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser')

WebUI.click(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/div_Admin'))

WebUI.doubleClick(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input'))

WebUI.setText(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input'), 'Is1234')

WebUI.click(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/div_Enabled'))

WebUI.doubleClick(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input'))

WebUI.setText(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input'), 'i')

WebUI.click(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/div_Enabled'))

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    'WQrEs63dWkMUSsaZ4NMkXg==')

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 
    'WQrEs63dWkMUSsaZ4NMkXg==')

WebUI.click(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    '5AcPxL9coVc3Kfbf8D3drQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 
    '5AcPxL9coVc3Kfbf8D3drQ==')

WebUI.click(findTestObject('Object Repository/OrangeHRMPage/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

