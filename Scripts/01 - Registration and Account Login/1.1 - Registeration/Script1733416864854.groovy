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

WebUI.navigateToUrl('https://sewriveting.ca/store/')

WebUI.click(findTestObject('Object Repository/Page_SewRiveting - Custom Apparel/a_Login or register'))

WebUI.click(findTestObject('Object Repository/Page_Account Login/label_Register Account'))

WebUI.click(findTestObject('Object Repository/Page_Account Login/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Create Account/input_First Name_firstname'), 'Joey')

WebUI.setText(findTestObject('Object Repository/Page_Create Account/input_Last Name_lastname'), 'Jordison')

WebUI.setText(findTestObject('Object Repository/Page_Create Account/input_E-Mail_email'), 'joeyjordison102@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Page_Create Account/input_Address 1_address_1'), '202 23rd Ave SW')

WebUI.setText(findTestObject('Object Repository/Page_Create Account/input_City_city'), 'Saskatoon')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Account/select_--- Please Select --- AlbertaBritish_51f8b7'), 
    '613', true)

WebUI.setText(findTestObject('Object Repository/Page_Create Account/input_ZIP Code_postcode'), 'S7L1A1')

WebUI.setText(findTestObject('Object Repository/Page_Create Account/input_Login name_loginname'), 'joeyjordison102')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create Account/input_Password_password'), 'tGCCc3v96hppwrVZEE0uww==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create Account/input_Password Confirm_confirm'), 'tGCCc3v96hppwrVZEE0uww==')

WebUI.click(findTestObject('Object Repository/Page_Create Account/input_Privacy Policy_agree'))

WebUI.click(findTestObject('Object Repository/Page_Create Account/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Your Account Has Been Created/a_Continue'))

