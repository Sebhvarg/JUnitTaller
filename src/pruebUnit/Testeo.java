package pruebUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Testeo {
	@Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Calculation.findMax(new int[]{-12, -1, -3, -4, -2}));
        
    }

}
