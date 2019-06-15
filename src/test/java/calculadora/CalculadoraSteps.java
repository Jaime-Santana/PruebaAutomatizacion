package calculadora;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import calculadora.Calculadora;

public class CalculadoraSteps {
	
	private Calculadora cal = new Calculadora();
	
	@When("^el primer numero es (\\d+) y el segundo numero es (\\d+)$")
	public void ingresoNumeros(int primer, int segundo) throws Throwable{
		cal.setNumprimero(primer);
		cal.setNumsegundo(segundo);
	}
	
	@Then("^el resultado de la suma es (\\d+)$")
	public void comparacionSuma(int resultado) throws Throwable{
		Assert.assertEquals(cal.sumar(cal.getNumprimero(), cal.getNumsegundo()), resultado);
	}
	
	@Then("^el resultado de la multiplicacion es (\\d+)$")
	public void comparacionMultiplicacion(int resultado) throws Throwable{
		Assert.assertEquals(cal.multiplicar(cal.getNumprimero(), cal.getNumsegundo()), resultado);
	}
}
