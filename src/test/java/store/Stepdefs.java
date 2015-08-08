package store;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

/**
 * Created by VKurochkin on 8/6/2015.
 */
public class Stepdefs {

    Store wallMart;
    Store bestBuy;
    private String productFromBestBuy;

    @Given("^WallMart is (\\d+) miles from BestBuy$")
    public void WallMart_is_miles_from_BestBuy(int distance) throws Throwable {
        wallMart = new Store();
        bestBuy = new Store();
        wallMart.setLocation(distance);
        bestBuy.setLocation(0);
    }

    @When("^BestBuy have sales on \"([^\"]*)\"$")
    public void BestBuy_have_sales_on(String product) throws Throwable {
        bestBuy.sell(product);
        productFromBestBuy = product;

    }

    @Then("^WallMart should sell it with discount$")
    public void WallMart_should_sell_it_with_discount() throws Throwable {
       assertEquals(asList(productFromBestBuy), wallMart.getProduct());
    }
}