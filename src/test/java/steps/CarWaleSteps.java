package steps;
import org.testng.Assert;

import io.cucumber.java.en.*;
import page.base.BasePage;
import page.objects.HomePage;
import page.objects.NewCarsPage;
import page.objects.ToyotaCarsPage;
import utils.SeleniumDriver;


public class CarWaleSteps {
	
	HomePage home = new HomePage();
	NewCarsPage car;
	ToyotaCarsPage toyota;
	
	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
	     SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	}
	@When("user mouseover to newcars")
	public void user_mouseover_to_newcars() {
		home.clickNewCars();
	}
	@Then("user clicks on Findnewcars")
	public void user_clicks_on_findnewcars() throws InterruptedException {
			car = home.clickFindNewCars();
	}
	@And("user clicks on {string} car")
	public void user_clicks_on_car(String carBrand){
		if(carBrand.equals("Toyota")) {
			
			car.goToToyota();
			System.out.println("We navigated to Toyota Page" );
		}else if(carBrand.equals("Kia")) {
			car.goToKia();
			System.out.println("We navigated to Kia Page" );
		}else if(carBrand.equals("Honda")) {
			car.goToHonda();
			System.out.println("We navigated to Honda Page" );
		}else if(carBrand.equals("BMW")) {
			car.goToBMW();
			System.out.println("We navigated to BMW Page" );
		}
	}
	@And("user validates carTitle as {string}")
	public void user_validates_car_title(String carTitle) {	
		System.out.println("Car Title is : "+BasePage.carBase.getCarTitle());
		Assert.assertTrue(BasePage.carBase.getCarTitle().equals(carTitle));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
