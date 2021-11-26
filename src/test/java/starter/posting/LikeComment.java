package starter.posting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LikeComment {

    @Given("I was on the dashboard home page")
    public void i_was_on_the_dashboard_home_page() {
        System.out.println("==> Yeah..!! You Success Like & Comment");
    }

    @When("I read my friend post and  scroll others post")
    public void i_read_my_friend_post_and_scroll_others_post() {
    }

    @And("I clicked {string} icon at my friend post")
    public void i_clicked_icon_at_my_friend_post(String string)  {
    }

    @Then("It was success and taken to the comment post")
    public void it_was_success_and_taken_to_the_comment_post() {
    }

    @And("I interested to write the comment on my friend post")
    public void i_interested_to_write_the_comment_on_my_friend_post() {
    }

    @And("I pushed by enter button of keyboard success")
    public void i_pushed_by_enter_button_of_keyboard_success() {
    }
}
