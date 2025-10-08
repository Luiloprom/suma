package es.etg.dam;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumaTest {

    @Test
    void rango() {

        assertAll("Rango",
                () -> assertEquals(6, Suma.rango(1, 3), "1 + 2 + 3 = 6"),
                () -> assertEquals(3, Suma.rango(1, 2), "1 + 2 = 3"),
                () -> assertEquals(2, Suma.rango(-1, 2), "-1 + 0 + 1 + 2 = 2"),
                () -> assertEquals(2, Suma.rango(2, 2), "2 = 2"));

    }

}
