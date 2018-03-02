package stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import pages.HomePOM;
import pages.ResultadosBusquedaPOM;

public class Steps {

	private final String url = "http://www.dccomics.com";
	private HomePOM homePage;
	private ResultadosBusquedaPOM resultadosBusquedaPage;
	private String resultadoEsperado = "1-25";
	private String sinResultados = "0-0";

	@Dado("^que estoy en la web de DC Comics$")
	public void que_estoy_en_la_web_de_dc_comics() {
		this.homePage = new HomePOM();
    	this.homePage.cargar(this.url);
	}
	
	@Cuando("busco la palabra \"(.*)\"")
	public void busco_la_palabra(String terminoBusqueda) {
		this.homePage.buscarTermino(terminoBusqueda);
	    this.resultadosBusquedaPage = new ResultadosBusquedaPOM();
	}
	
	@Entonces("^se muestra un listado de resultados$")
	public void se_muestra_un_listado_de_resultados() {
	    Assert.assertTrue(resultadosBusquedaPage.getResultado().contains(this.resultadoEsperado));
	}
	
	@Entonces("^no se muestran resultados$")
	public void no_se_muestran_resultados() {
		Assert.assertTrue(resultadosBusquedaPage.getResultado().contains(this.sinResultados));
	}
	
	@After
	public void tearDown() {
		HomePOM.driver.quit();
	}

}