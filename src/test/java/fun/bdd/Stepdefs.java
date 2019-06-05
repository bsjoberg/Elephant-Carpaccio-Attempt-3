package fun.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Stepdefs {
    private HelloWorld helloWorld = null;
    private String message;
    private RetailCalculator retailCalculator;

    @Given("I have a hello world app")
    public void i_have_a_hello_world_app() {
        helloWorld = new HelloWorld();
    }

    @When("I run hello world")
    public void i_run_hello_world() {
        message = helloWorld.sayHi();
    }

    @Then("I get a message")
    public void i_get_a_message() {
        Assert.assertEquals("Hello World", message);
    }

    @Given("I am using the retail calculator")
    public void i_am_using_the_retail_calculator() {
        retailCalculator = new RetailCalculator();
    }

    @When("I have {int} item")
    public void i_have_item(Integer numberOfItems) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the item price is ${double}")
    public void the_item_price_is_$(Double price) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("my order value is ${double}")
    public void my_order_value_is_$(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
