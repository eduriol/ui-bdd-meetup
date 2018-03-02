package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePOM extends BasePOM {
	
	private By inputBusquedaLocator = By.id("edit-search-block-form--2");
	
	public void buscarTermino(String terminoBusqueda) {
		WebElement inputBusqueda = wait.until(ExpectedConditions.elementToBeClickable(inputBusquedaLocator));
		inputBusqueda.sendKeys(terminoBusqueda);
		inputBusqueda.sendKeys(Keys.ENTER);
	}

}