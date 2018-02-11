package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	
	@Given("^I Am able to access magento webpage$")
	public void i_Am_able_to_access_magento_webpage()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


@Given("^I am registered the user on magento$")
public void i_am_registered_the_user_on_magento() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver =new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.magento.com");
	WebElement a=driver.findElement(By.linkText("MY ACCOUNT"));
	a.click();
}

@When("^I update the valid username$")
public void i_update_the_valid_username() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("email")).sendKeys("shwetha@gmail.com");
}

@When("^I am update with password$")
public void i_am_update_with_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("pass")).sendKeys("12345");
}

@Then("^I click on signin button$")
public void i_click_on_signin_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("send2")).click();
}
@Then("^I click on Signin button$")
public void i_click_on_Signin_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^I should get access to the dashboard$")
public void i_should_get_access_to_the_dashboard() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^I update the username as \"([^\"]*)\"$")
public void i_update_the_username_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("email")).sendKeys(arg1);
}

@When("^I update the password as \"([^\"]*)\"$")
public void i_update_the_password_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("pass")).sendKeys(arg1);
}

@When("^I click on the Singin button$")
public void i_click_on_the_Singin_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}



}
