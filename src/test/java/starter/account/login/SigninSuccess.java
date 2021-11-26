package starter.account.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninSuccess {

        @Given("I was on the login page")
        public void i_was_on_the_Login_Page() {
            // Write code here that turns the phrase above into concrete actions
            // throw new cucumber.api.PendingException();
            System.out.println("Yeah..!! You Success Sign in");

        }

        @When("I filled my email and password correctly")
        public void i_filled_my_email_and_password_correctly() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

        @When("I clicked {string} button")
        public void i_clicked_button(String string) {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

        @Then("I was taken to the dashboard success")
        public void i_was_taken_to_the_dashboard_success() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();

        }
    }
