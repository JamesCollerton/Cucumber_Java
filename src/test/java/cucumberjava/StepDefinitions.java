package cucumberjava;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

    private Belly belly = new Belly();

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int arg1) throws Exception {
        belly.eat(arg1);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Exception {
        belly.wait(arg1);
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Exception {
        assert(belly.growling());
    }

}
