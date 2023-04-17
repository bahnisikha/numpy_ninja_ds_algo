package stepDefination;

import static org.testng.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.ArrayPage_POM;
import pageObjectModel.HomePage_POM;
import pageObjectModel.LinkedList_POM;
import pageObjectModel.SigninPage_POM;
import utils.LoggerLoad;

public class LinkeListPage_SD {
	HomePage_POM HomePagePOM=new HomePage_POM();		
	SigninPage_SD Signin_1=new SigninPage_SD();	
	HomePage_SD HomePage_1=new HomePage_SD();	
	SigninPage_POM Signinpage =new SigninPage_POM();	
	HomePage_POM homePage= new HomePage_POM();	 
	ArrayPage_POM arrayPage = new ArrayPage_POM();
	static String ExpectedError,expMsg;
	static String expectedResult;
	LinkedList_POM linkedList = new LinkedList_POM();
	
	
	@When("The user enter valid data")
	public void the_user_enter_valid_data() {
		HomePage_1.user_opens_the_dsalgo_portal_link();		
		HomePage_1.user_clicks_on_button("Get Started");				
		HomePage_1.the_user_opens_home_page();	 
		Signin_1.user_click_on_loginbtn();		
		Signin_1.the_user_enter_valid_and("testname1numpy2", "numpyninja2");		   
	}

	@When("The user selecting linkedlist item from the drop down menu")
		public void the_user_selecting_linkedlist_item_from_the_drop_down_menu() {
			LoggerLoad.info("The User Select Linked List From drop down menu ");
		    linkedList.dropdown_linkedlist();
	}

	@Then("The user redirected to {string}  Page")
	public void the_user_redirected_to_page(String string) {
		LoggerLoad.info("The User redirected to " + string + "Page");
		String title = linkedList.getLinkedListPageTitle();
		LoggerLoad.info("Title of the Current Page is " + title);
		assertEquals(title, string);
	}
	
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String pageName) {
		String page_name = pageName.replaceAll("\\s+", "");
		linkedList.navigateTo(page_name);
		LoggerLoad.info("The user is on the " + pageName + " after logged in");
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		linkedList.Clickon_introductionLink();
		LoggerLoad.info("User Clicks on Introduction link");
	}

	@Then("The user move to {string} of Linked List Page")
	public void the_user_move_to_of_linked_list_page(String pageName) {
		LoggerLoad.info("The User redirected to " + pageName + "Page");
		String title = linkedList.getLinkedListPageTitle();
		LoggerLoad.info("Title of the Current Page is " + title);
		assertEquals(title, pageName);
	}
	
	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String tryIt, String DsName) {
		linkedList.TryHereLink(tryIt, DsName );
		LoggerLoad.info("User Clicks on try it Editor");
	}

	@Then("The user redirected to the page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = linkedList.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}
	
	@Given("The user is in a try here page having tryEditor with a Run button to test")
	public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("The User is in page having an tryEditor with a Run button to test");
		linkedList.navigateTotryEditor();
		String Title = linkedList.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
	}

	@When("The user Enter invalid python code")
	public void the_user_enter_invalid_python_code(io.cucumber.datatable.DataTable invalidCode) 
		throws InterruptedException {
			List<List<String>> data = invalidCode.cells();
			linkedList.Enter_PythonCode(data.get(0).get(0));
	}

	@When("click on run button")
	public void click_on_run_button()throws InterruptedException {
		linkedList.Clickon_runButton(); 
	    
	}

	@Then("The user get the error message")
	public void the_user_get_the_error_message() {
		linkedList.Get_Errormsg();
	}
	
	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {
		linkedList.Clickon_creatinglinkedlistLink();
	}
	@When("The user Enter valid python code")
	public void the_user_enter_valid_python_code(io.cucumber.datatable.DataTable pythonCode) 
		throws InterruptedException {
			List<List<String>> data = pythonCode.cells();
			linkedList.Enter_PythonCode(data.get(0).get(0));
	}

	@Then("The user should get the Run output")
	public void the_user_should_get_the_run_output() {
		String output = linkedList.Get_OutputString();
		LoggerLoad.info("The output is:" + output);
	}
	
	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
		linkedList.Clickon_typesOfLinkedLink();
	}
	
	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		linkedList.Clickon_implementLLInPythonLink();
	}







}
