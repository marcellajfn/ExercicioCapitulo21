import static org.junit.Assert.assertEquals;

import org.junit.Before;


public class TestContaBancaria {

	ContaBancariaDeposito minhaConta;
	
	@Before
	public void setUp() throws Exception {
	}


       @Test
       public void testContaBancaria(){
        minhaConta = new ContaBancariaDeposito("Marcella", "000.090.098.09","09098-09", 1000,200);
	assertEquals(1200, minhaConta.SaldoEdeposito(1000, 200),0.001);
       }
}
