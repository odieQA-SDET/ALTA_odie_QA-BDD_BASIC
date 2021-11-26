package starter.account.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninEmptyPass {

        @Given("I was on the login page of linkedin")
        public void i_was_on_the_login_page_of_linkedin() {
            // Write code here that turns the phrase above into concrete actions
            // throw new cucumber.api.PendingException();
            System.out.println("ALERT EMPTY PASSWORD=>>    Please enter password");
        }

        @When("I filled my email correctly but password was empty")
        public void i_filled_my_email_correctly_but_password_was_empty() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

        @Then("It was the empty password alert")
        public void It_was_the_empty_password_alert() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();

        }
    }

