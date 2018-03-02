package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void cargar(String baseURL) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, 10);
		driver.get(baseURL);
		driver.manage().window().maximize();
	}

}
