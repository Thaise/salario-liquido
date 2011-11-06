import static org.junit.Assert.*;

import org.junit.Test;


public class SalarioLiquidoTest {

	@Test
	public void deveApresentarSalarioLiquido() {
		double salarioLiquido = CalculaSalarioLiquido.calcularSalario(176,2.875,3);
		assertEquals(567, salarioLiquido, 0);
	}
	
	@Test
	public void deveApresentarSalarioLiquido3() {
		double salarioLiquido = CalculaSalarioLiquido.calcularSalario(150,8.33,0);
		assertEquals(1050, salarioLiquido, 0);
	}

}
