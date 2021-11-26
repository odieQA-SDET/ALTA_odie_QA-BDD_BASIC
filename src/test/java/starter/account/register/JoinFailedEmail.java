package starter.account.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JoinFailedEmail {

        @Given("I was on the sign up page")
        public void i_was_on_the_signup_Page() {
            // Write code here that turns the phrase above into concrete actions
            // throw new cucumber.api.PendingException();
            System.out.println("THE ALERT==> Please enter a valid email address or mobile number.");
        }

        @When("I filled the wrong my email or phone number but password correctly")
        public void i_filled_the_wrong_my_email_or_phone_number_but_password_correctly() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();

        }

        @Then("It was the wrong email text alert")
        public void it_was_the_wrong_email_text_alert() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();

        }
    }

