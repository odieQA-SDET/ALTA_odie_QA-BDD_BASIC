package starter.account.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninFailedPass {

        @Given("I was on the login page failed password")
        public void i_was_on_the_login_page_failed_password() {
            // Write code here that turns the phrase above into concrete actions
            // throw new cucumber.api.PendingException();
            System.out.println("ALERT ENTERED THE WRONG PASS=>>   That's not the right password. Try again or\n" +
                    "sign in with a one-time link");

        }

        @When("I filled the wrong password")
        public void i_filed_the_wrong_password() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

        @Then("It was the wrong password alert")
        public void it_was_the_wrong_password_alert() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }
    }
