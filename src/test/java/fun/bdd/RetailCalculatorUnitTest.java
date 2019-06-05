package fun.bdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RetailCalculatorUnitTest {
    RetailCalculator retailCalculator;

    @Before
    public void setUp() {
        retailCalculator = new RetailCalculator();
    }

    @Test
    public void should_accept_price_as_double() {
        retailCalculator.setPrice(10.10);
        Assert.assertEquals(10.1, retailCalculator.getPrice(), 2);
    }

    @Test
    public void should_accept_price_as_int() {
        retailCalculator.setPrice(20);
        Assert.assertEquals(20.0, retailCalculator.getPrice(),2);
    }

    @Test
    public void should_accept_number_of_items_greater_than_zero() {
        try {
            retailCalculator.setNumberOfItems(2);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(2, retailCalculator.getNumberOfItems());
    }

    @Test
    public void should_return_order_value_with_two_decimals_or_less() {

    }

    @Test
    public void should_not_accept_number_of_items_less_than_1() {
        try {
            retailCalculator.setNumberOfItems(0);
        } catch (InvalidArgumentException iae) {
            Assert.assertEquals("Number of items must be greater than zero", iae.getMessage());
        }
    }
}
