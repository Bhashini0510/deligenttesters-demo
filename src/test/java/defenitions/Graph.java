package defenitions;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.TestSetUp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.GraphPage;
import pageObject.PageObjectManager;


public class Graph{
	WebDriver driver;
	List<WebElement> topicList;
	List<String> codeTest;
	String expected, actual;
	String path="src/test/resources/inputdata/DataInput.xlsx";
	
	TestSetUp setUp;
	PageObjectManager pageObjectManager;
	GraphPage GraphPage;
	
	public Graph(TestSetUp setUp) {
		this.setUp = setUp;
		this.GraphPage = setUp.pageObjectManager.Graphpage();
	}
		
	
	@When("User click on Graph from the dropdown")
	public void user_click_on_graph_from_the_dropdown() {
	    GraphPage.selectGraph();
	}

	@Then("Graph page is displayed")
	public void graph_page_is_displayed() {
		
		expected = "https://dsportalapp.herokuapp.com/graph/";
		actual = GraphPage.getPageUrl();
		Assert.assertTrue(expected.equalsIgnoreCase(actual));
	}

	@Then("heaader Graph is displayed")
	public void heaader_graph_is_displayed() {
		expected = "Graph";
		actual = GraphPage.getPageHeader();
		Assert.assertTrue(expected.equalsIgnoreCase(actual));
	}

	@When("User click on Get Started button for Graph")
	public void user_click_on_get_started_button_for_graph() {
	    GraphPage.btnClick();
	}
	





}



