package stepDefination;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.ArrayPage_POM;
import pageObjectModel.HomePage_POM;
import pageObjectModel.SigninPage_POM;
import utils.Configreader;
import utils.Excelreader;
import utils.LoggerLoad;

public class ArrayPage_SD {
	HomePage_POM HomePagePOM=new HomePage_POM();		
	SigninPage_SD Signin_1=new SigninPage_SD();	
	HomePage_SD HomePage_1=new HomePage_SD();	
	SigninPage_POM Signinpage =new SigninPage_POM();	
	HomePage_POM homePage= new HomePage_POM();	 
	ArrayPage_POM arrayPage = new ArrayPage_POM();
	static String ExpectedError,expMsg;
	static String expectedResult;
		
	
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		HomePage_1.user_opens_the_dsalgo_portal_link();		
		HomePage_1.user_clicks_on_button("Get Started");				
		HomePage_1.the_user_opens_home_page();	 
		Signin_1.user_click_on_loginbtn();		
		Signin_1.the_user_enter_valid_and("testname1numpy2", "numpyninja2");	
		}
	   
	

	@When("The user enter valid and")
	public void the_user_enter_valid_and() {
	    
	}


	@When("The user click on login button")
	public void the_user_click_on_login_button() {
	    
	}

	@Given("The user is on Home page after logged in")
	public void the_user_is_on_home_page_after_logged_in() {
	   System.out.println("User is on Home Page");
	}
//--------------------------------------------
	@When("user clicks on Array getstarted")
	public void user_clicks_on_array_getstarted() {
		LoggerLoad.info("User Clicks on Array get started link");

		arrayPage.getStartedArrayButton();
	}
	
	@Then("User should be redirected to {string} webpage")
	public void user_should_be_redirected_to_webpage(String pagename) {
		LoggerLoad.info("User is redirected to " +pagename + "Page");		
		String pageTitle= arrayPage.getPageTitle();		
		LoggerLoad.info("Page title is " +pageTitle);		
		assertEquals(pageTitle,pagename,"User is redirected to another page");	 	
		
	}

	

	@Given("User is on {string} after logged in")
	public void user_is_on_after_logged_in(String pagename) {
		LoggerLoad.info("pagename == " + pagename);

		String page_name=pagename.replaceAll("\\s+", "");

		arrayPage.navigateTo(page_name);

		LoggerLoad.info("User is on the "+page_name + " after logged in");


	   
	}

	@When("User clicks on Arrays in Python link")
	public void user_clicks_on_arrays_in_python_link() {
		arrayPage.clickArraysInPythonLink();
	}
	
	@Then("User should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String pagename) {
		 	
	}
	
	@Given("User is on {string} after logged in from signin page")
	public void user_is_on_after_logged_in_from_signin_page(String pagename) {
		LoggerLoad.info("pagename == " + pagename);

		String page_name=pagename.replaceAll("\\s+", "");

		arrayPage.navigateTo(page_name);

		LoggerLoad.info("User is on the "+page_name + " after logged in");


	}

	@When("User clicks on {string} button in {string}")
	public void user_clicks_on_button_in(String buttonName, String dataStructureName) 	{		
		LoggerLoad.info("User clicks " + buttonName + " on " + dataStructureName );		
		arrayPage.clickTryHereLink(buttonName, dataStructureName);		
		LoggerLoad.info("User clicks on Try Here Link");		
	}

	@Then("User should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User is redirected to a page having Try Editor with a run button to test");

		String title=arrayPage.getPageTitle();

		LoggerLoad.info("Page Title is " +title);

		String expectedTitle="Assessment";

		assertEquals(title,expectedTitle,"User is redirected to Try Editor page");
	}
	
	@Given("User is on {string} after logged in from TryEditor page")
	public void user_is_on_after_logged_in_from_try_editor_page(String pagename) {
		LoggerLoad.info("pagename == " + pagename);

		String page_name=pagename.replaceAll("\\s+", "");

		arrayPage.navigateTo(page_name);

		LoggerLoad.info("User is on the "+page_name + " after logged in");

	}

	@When("User enters valid Python code from sheet {string} and {int}")
	public void user_enters_valid_python_code_from_sheet_and(String string, Integer int1) {
		LoggerLoad.info("User is on Try Editor page");		
		arrayPage.fetchPythonCode("print(10)");
		expectedResult = "10";
	}

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		LoggerLoad.info("User clicks on Run Button");
		arrayPage.clickRunButton();
	}

	@Then("User should be able to see the output")
	public void user_should_be_able_to_see_the_output() {
		LoggerLoad.info("User gets the Result of entered Python Code");		
		String fetchOutput = arrayPage.fetchOutput();		
		LoggerLoad.info("Displayed Result is "+fetchOutput);		
		assertEquals(fetchOutput,expectedResult,"Output is same");			
	    
	}
	@When("User enters invalid Python code")
	public void user_enters_invalid_python_code() {
		LoggerLoad.info("User is on Try Editor page");		
		arrayPage.fetchPythonCode("printf 1");
	}

	@Then("User should be able to see error message")
	public void user_should_be_able_to_see_error_message() {
		LoggerLoad.info("User gets the error message in an Alert");
		String fetchError = arrayPage.fetchErrorMessage();
		String ExpectedError="SyntaxError: bad input on line 1";
		LoggerLoad.info("Displayed Error Message is "+fetchError);
		assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
	}
	
	
	@When("User clicks on Arrays Using List link")
	public void user_clicks_on_arrays_using_list_link() {
		LoggerLoad.info("User clicks Arrays Using List Link");
		arrayPage.clickArraysUsingListLink();
	}
	
	@When("User enters valid Python code")
	public void user_enters_valid_python_code() {
		LoggerLoad.info("User is on Try Editor page");		
		arrayPage.fetchPythonCode("print(\"NumpyNinja\")");
		expectedResult = "NumpyNinja";
	}
	
	@Then("User should be able to see error message in an Alert")
	public void user_should_be_able_to_see_error_message_in_an_alert() {
		LoggerLoad.info("User gets the error message in an Alert");
		String fetchError = arrayPage.fetchErrorMessage();
		String ExpectedError="SyntaxError: bad input on line 1";
		LoggerLoad.info("Displayed Error Message is "+fetchError);
		assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
	}
	
	@When("User clicks on Basic Operations in Lists link")
	public void user_clicks_on_basic_operations_in_lists_link() {
		LoggerLoad.info("User clicks on Basic Operations In List link");
		arrayPage.clickbasicOperationsInListsLink();
	}
	
	@Then("User should be able to see error message in an Alert box")
	public void user_should_be_able_to_see_error_message_in_an_alert_box() {
		LoggerLoad.info("User gets the error message in an Alert");
		String fetchError = arrayPage.fetchErrorMessage();
		String ExpectedError="SyntaxError: bad input on line 1";
		LoggerLoad.info("Displayed Error Message is "+fetchError);
		assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
	}
	
	@When("User clicks on Applications of Array link")
	public void user_clicks_on_applications_of_array_link() {
		LoggerLoad.info("User clicks on Applications of Array Link");
		arrayPage.clickapplicationsOfArrayLink();
	}
	
}