package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsForOutlook {


    @Given("I navigate to outlook.com")
    public void i_navigate_to_outlook_com() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to outlook.com");
    }

    @Given("I enter userId and Password")
    public void i_enter_userId_and_Password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("entered userID and password");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click on login button");
    }

    @Then("I should see the welcome message")
    public void i_should_see_the_welcome_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see the welcome page");
    }

}
