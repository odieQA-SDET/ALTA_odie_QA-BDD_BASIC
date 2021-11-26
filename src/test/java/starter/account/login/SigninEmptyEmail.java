package starter.account.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninEmptyEmail {

        @Given("I was on the login page email or phone number")
        public void i_am_on_the_login_page_email_or_phone_number() {
            // Write code here that turns the phrase above into concrete actions
            // throw new cucumber.api.PendingException();
            System.out.println("ALERT EMPTY EMAIL/PHONE NUMBER=>>   Please enter an email address or phone number");
        }

        @When("I didn't fill my email address but password correctly")
        public void i_did_not_fill_my_email_address_but_password_correctly() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

        @Then("It was the empty email alert")
        public void It_was_the_empty_email_alert() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();

        }
    }

