package numero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumeroTest {

	@Test
    public void testValidarNumeros() {
		Numeros.c = 10;
		Numeros.par = 6;
		Numeros.impar = 4;
       
        Numeros.validarNumeros();
        Numeros.mostrarResultado();

        // Verifica si c es igual a 10 después de llamar a validarNumeros()
        assertEquals(10, Numeros.c);
    }
	
	@Test
	public void testValidarNumeros1() {
		Numeros.c = 9;
		Numeros.par = 6;
		Numeros.impar = 3;
        
		//introducimos un número impar
        Numeros.validarNumeros();
        Numeros.mostrarResultado();

        assertEquals(10, Numeros.c);
        assertEquals(4,Numeros.impar);
    }
	
	@Test
    public void testValidarNumeros2() {
		Numeros.c = 9;
		Numeros.par = 5;
		Numeros.impar = 4;
		
		//introducimos un número par
        Numeros.validarNumeros();
        Numeros.mostrarResultado();

        assertEquals(10, Numeros.c);
        assertEquals(6,Numeros.par);
    }

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/

}
