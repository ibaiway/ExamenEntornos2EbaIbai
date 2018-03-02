import static org.junit.Assert.*;
import org.junit.Test;



public class Test {

	
	
	@test	
	public void testMayor(){
		
		Matematica mates=new Matematica();
		
		assertTrue(mates.mayor(6, 2));
	}
	
	@Test
	public void testSuma() {
		
		Matematica mates = new Matematica();
		
		int resultado = mates.suma(5, 7);
		int resultadoBueno = 12;
		
		assertEquals(resultado, resultadoBueno);
		
	}
		

}
