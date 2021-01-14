import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("landing");
    }

    @When("^User logins with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logins_with_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("login");
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("home");
    }

    @Then("^All the cards on homepage are displayed$")
    public void all_the_cards_on_homepage_are_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("cards displayed");
        System.out.println("cards displayed");
    }

}
