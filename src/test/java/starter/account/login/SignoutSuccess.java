package starter.account.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignoutSuccess {

        @Given("I was on the sign out Dashboard menu of Me")
        public void i_was_on_the_sign_out_dashboard_menu_of_me() {
            // Write code here that turns the phrase above into concrete actions
            // throw new cucumber.api.PendingException();
            System.out.println("Yeah..!! You Success Log Out");
        }

        @When("I clicked dashboard menu of Me and look for the log out")
        public void i_clicked_dashboard_menu_of_me_and_look_for_the_log_out() {

        }

        @Then("I was taken out from my dashboard of linkedin and success")
        public void i_was_taken_out_from_my_dashboard_of_linkedin_and_success() {
            // Write code here that turns the phrase above into concrete actions
            //throw new cucumber.api.PendingException();
        }

    }

