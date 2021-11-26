package starter.account.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JoinFailedSameEmail {
    @Given("I was on the sign up on boardsite")
    public void i_was_on_the_signup_on_boardsite() {
        System.out.println("THE ALERT==>  Someone’s already using that email.");
    }

    @When("I filled the same email or phone number but password correctly")
    public void i_filled_the_same_email_or_phone_number_but_password_correctly() {
    }

    @Then("It was the same email or phone number have used before and it was taken to popup alert")
    public void it_was_the_same_email_or_phone_number_have_used_before_and_it_was_taken_to_popup_alert() {
    }
}