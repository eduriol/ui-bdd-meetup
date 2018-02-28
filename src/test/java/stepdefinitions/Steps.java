package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.es.Dado;

public class Steps {

	public static WebDriver driver;
	private final String url = "http://www.dccomics.com";

	@Dado("^que estoy en la web de DC Comics$")
	public void que_estoy_en_la_web_de_dc_comics() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}