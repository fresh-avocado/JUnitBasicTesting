package testeando;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void dosPorDosDeberiaSerCuatro() {
        assertEquals(4, Calculadora.multiplicacion(2, 2), "2 x 2 debería ser 4");
    }

}
