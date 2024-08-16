package pruebUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Testeo {
	@Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Calculation.findMax(new int[]{-12, -1, -3, -4, -2}));
	//realizar casos de prueba con tres arreglos que contengan números de signo positivo y negativo.
	assertEquals(10, Calculation.findMax(new int[]{1, 2, 3, 4, -5, 6, 7, 8, 9, 10}));
        assertEquals(-3, Calculation.findMax(new int[]{5, -4, -3, -2, -1}));
        assertEquals(6, Calculation.findMax(new int[]{0, 2, -4, -6}));
    }
}
