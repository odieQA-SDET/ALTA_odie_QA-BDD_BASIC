package starter.account.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninFailedEmail {

        @Given("I was on the login page the wrong email")
        public void i_was_on_the_login_page_the_wrong_email() {
            // Write code here that turns the phrase above into concrete actions
            // throw new cucumber.api.PendingException();
            System.out.println("ALERT ENTERED THE WRONG EMAIL=>>    Could not find a LinkedIn account associated with \n" +
                    "this email. Please try again.");

        }

        @When("I filled the wrong email")
        public void i_filled_the_wrong_email() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

        @When("I clicked {string} button the wrong email")
        public void i_clicked_button_failed_the_wrong_email(String string) {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

        @Then("It was the wrong email alert")
        public void it_was_the_wrong_email_alert() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }
    }

