package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.es.Dado;
import pages.HomePOM;

public class Steps {

	private final String url = "http://www.dccomics.com";
	private HomePOM homePage;

	@Dado("^que estoy en la web de DC Comics$")
	public void que_estoy_en_la_web_de_dc_comics() {
		this.homePage = new HomePOM();
    	this.homePage.cargar(this.url);
	}
	
	@After
	public void tearDown() {
		HomePOM.driver.quit();
	}

}