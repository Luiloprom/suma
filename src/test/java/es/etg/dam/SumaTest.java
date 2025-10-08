package es.etg.dam;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class SumaTest {

    @Test
    void rango() {

        assertAll("Rango",
                () -> assertEquals(6, Suma.calcularRango(1, 3), "1 + 2 + 3 = 6"),
                () -> assertEquals(3, Suma.calcularRango(1, 2), "1 + 2 = 3"),
                () -> assertEquals(2, Suma.calcularRango(-1, 2), "-1 + 0 + 1 + 2 = 2"),
                () -> assertEquals(2, Suma.calcularRango(2, 2), "2 = 2"));

    }

    @Test
    void errorParametros() {
        String[] args = { "1" };
        var ex = assertThrows(ArrayIndexOutOfBoundsException.class, () -> Suma.main(args),
                "Hay que insertar dos parametros");
        assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
    }
}
