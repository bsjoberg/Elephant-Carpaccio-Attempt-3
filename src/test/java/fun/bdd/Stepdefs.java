package fun.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Stepdefs {
    private HelloWorld helloWorld = null;
    private String message;

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
}
