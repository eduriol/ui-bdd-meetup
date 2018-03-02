package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultadosBusquedaPOM extends BasePOM {

	private By resultadoObtenidoLocator = By.className("total-results");
	 
    public String getResultado() {
    	WebElement resultadoObtenido = wait.until(ExpectedConditions.elementToBeClickable(resultadoObtenidoLocator));
    	return resultadoObtenido.getText();
    }
	
}
