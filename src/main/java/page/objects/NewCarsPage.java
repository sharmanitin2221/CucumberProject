package page.objects;

import page.base.BasePage;

public class NewCarsPage extends BasePage{
	
	public KiaCarPage goToKia() {
		click("kia_XPATH");
		return new KiaCarPage();
		
	}
	public BMWCarsPage goToBMW() {
		click("bmw_XPATH");
		return new BMWCarsPage();
	}
	
	public HondaCarsPage goToToyota() {
		click("toyota_XPATH");
		return new HondaCarsPage();

	}

	public ToyotaCarsPage goToHonda() {
		click("honda_XPATH");
		return new ToyotaCarsPage();

	}

}
