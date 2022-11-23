package page.objects;

import page.base.BasePage;

public class HomePage extends BasePage{ 
	
	public void clickNewCars() {
		
		click("newCarMenu_XPATH");
		 
	}

	public NewCarsPage clickFindNewCars() {
		
		click("findNewCars_XPATH");	
		return new NewCarsPage();
	}
	
	public void SearchCars() {
		
	}

	public void goToMaps() {
		
	}

}
