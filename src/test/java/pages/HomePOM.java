package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePOM {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	private By inputBusquedaLocator = By.id("edit-search-block-form--2");
	
	public void cargar(String baseURL) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, 10);
		driver.get(baseURL);
		driver.manage().window().maximize();
	}

	public void buscarTermino(String terminoBusqueda) {
		WebElement inputBusqueda = wait.until(ExpectedConditions.elementToBeClickable(inputBusquedaLocator));
		inputBusqueda.sendKeys(terminoBusqueda);
		inputBusqueda.sendKeys(Keys.ENTER);
	}

}