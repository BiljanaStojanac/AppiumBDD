package steps;

import base.PreconditionAndPostcondition;
import cucumber.api.PendingException;
import gherkin.ast.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static pages.PersonPage.firstName;

public class Car extends PreconditionAndPostcondition {
    HomePage home;
    //ResourceBundle element;
    VehiclePage enterDataVehicle;
    PersonPage enterDataPerson;
/*
    @Given("Navigate to Car Page")
    public void navigate_to_Car_Page() throws Exception {

        setUp();

        home = new HomePage(driver);

       // element = ResourceBundle.getBundle("values/CarValues");
        home.clickCarImage();
        throw new cucumber.api.PendingException();
    }

    @Given("^User enter following for vehicle data tab$")
    public void user_enter_following_for_vehicle_data_tab(io.cucumber.datatable.DataTable dataTable) throws IOException {

        enterDataVehicle = new VehiclePage(driver);

        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        System.out.println(list.get(0).get(0).toString());
        enterDataVehicle.enterMake(list.get(0).get("Make"));
        enterDataVehicle.enterYearOfConstruction(list.get(0).get("Year"));
        enterDataVehicle.enterListPrice(list.get(0).get("ListPrice"));
        enterDataVehicle.enterMileagePerYear(list.get(0).get("MileagePerYear"));
        enterDataVehicle.enterPerformance(list.get(0).get("Performance"));
        enterDataVehicle.enterFuel(list.get(0).get("Fuel"));
        enterDataVehicle.enterUsage(list.get(0).get("Usage"));
    }

    @When("go to Person page")
    public void go_to_Person_page() {

        home.clickPersonButton();
    }

    @When("User enter following for person data tab")
    public void user_enter_following_for_person_data_tab(io.cucumber.datatable.DataTable dataTable) {
       PersonPage enterDataPerson = new PersonPage(driver);
        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        enterDataPerson.enterFirstName(list.get(0).get("TestName"));
        enterDataPerson.enterLastName(list.get(0).get("LastName"));
        enterDataPerson.enterDateOfBirth(list.get(0).get("Birth"));
        enterDataPerson.enterOccupation(list.get(0).get("Occupation"));

        throw new cucumber.api.PendingException();
    }
    @When("go to ProductDetails page")
    public void go_to_ProductDetails_page() {

        home.clickProductDetailsButton();
    }
    @When("User enter following data for product details tab")
    public void user_enter_following_data_for_product_details_tab(io.cucumber.datatable.DataTable dataTable) {
        ProductDetailsPage enterDataProduct = new ProductDetailsPage(driver);
        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        enterDataProduct.preferredStartDate(list.get(0).get("PreferredStartDate"));
        enterDataProduct.paymentOption(list.get(0).get("PaymentOption"));
        enterDataProduct.InsuranceSumSlider(list.get(0).get("DamageInsuranceSum"));
        enterDataProduct.DamageInsurance(list.get(0).get("DamageInsurance"));

    }
    @Then("go to Quote page")
    public void go_to_Quote_page() {

        home.clickProductQuoteButton();
    }
  /* @Then("Verify data from Quote page")
    public void verify_data_from_Quote_page() {


        ProductQuotePage productQuote = new ProductQuotePage(driver);
        assertEquals(productQuote.getFirstName(),element.getString("FirstName"),"Text for FirstName is incorrect");
        assertEquals(productQuote.getLastName(),element.getString("LastName"),"Text for LastName is incorrect");
        assertEquals(productQuote.getDateOfBirth(),element.getString("DateOfBirth"),"Text for DateOfBirth is incorrect");
        assertEquals(productQuote.getSex(),element.getString("Gender"),"Text for Sex is incorrect");
        assertEquals(productQuote.getOccupation(),element.getString("Occupation"),"Text for Occupation is incorrect");
    }*/





    //////////////////////////////////////////////////////////////////////
    @Given("Navigate to Car Page")
    public void navigate_to_Car_Page() {
        setUp();

        home = new HomePage(driver);

        // element = ResourceBundle.getBundle("values/CarValues");
        home.clickCarImage();
    }

    @When("User enter following for vehicle data tab")
    public void user_enter_following_for_vehicle_data_tab(io.cucumber.datatable.DataTable dataTable) {
        enterDataVehicle = new VehiclePage(driver);
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        enterDataVehicle.enterMake(list.get(0).get("Make"));
        enterDataVehicle.enterYearOfConstruction(list.get(0).get("Year"));
        enterDataVehicle.enterListPrice(list.get(0).get("ListPrice"));
        enterDataVehicle.enterMileagePerYear(list.get(0).get("MileagePerYear"));
        enterDataVehicle.enterPerformance(list.get(0).get("Performance"));
        enterDataVehicle.enterFuel(list.get(0).get("Fuel"));
        enterDataVehicle.enterUsage(list.get(0).get("Usage"));

    }

    @When("go to Person page")
    public void go_to_Person_page() {

        home.clickPersonButton();

    }

    @When("User enter following for person data tab")
    public void user_enter_following_for_person_data_tab(io.cucumber.datatable.DataTable dataTable) {

        enterDataPerson = new PersonPage(driver);
        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        enterDataPerson.enterFirstName(list.get(0).get("FirstName"));
        enterDataPerson.enterLastName(list.get(0).get("LastName"));
        enterDataPerson.enterDateOfBirth(list.get(0).get("Birth"));
        enterDataPerson.enterOccupation(list.get(0).get("Occupation"));


    }

    @When("go to ProductDetails page")
    public void go_to_ProductDetails_page() {
        home.clickProductDetailsButton();


    }

    @When("User enter following data for product details tab")
    public void user_enter_following_data_for_product_details_tab(io.cucumber.datatable.DataTable dataTable) {
        ProductDetailsPage enterDataProduct = new ProductDetailsPage(driver);
        List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
        enterDataProduct.preferredStartDate(list.get(0).get("PreferredStartDate"));
        enterDataProduct.paymentOption(list.get(0).get("PaymentOption"));
        enterDataProduct.InsuranceSumSlider(list.get(0).get("DamageInsuranceSum"));
        enterDataProduct.DamageInsurance(list.get(0).get("DamageInsurance"));

    }

    @When("go to Quote page")
    public void go_to_Quote_page() {
        home.clickProductQuoteButton();

    }
    @Then("Verify data from Quote page")
    public void verify_data_from_Quote_page() {
        ProductQuotePage productQuote = new ProductQuotePage(driver);
        enterDataPerson = new PersonPage(driver);
        assertEquals(productQuote.getFirstName(), firstName,"Text for FirstName is incorrect");
    }


}
