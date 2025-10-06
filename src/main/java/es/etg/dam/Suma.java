package es.etg.dam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Suma {

    public static final String MSG_ERROR = "Solo se permiten valores numericos";
    public static final String MSG_ERROR2 = "Hay que insertar dos parametros";

    public static void main(String[] args) {

        try {

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            int min = Math.min(n1, n2);
            int max = Math.max(n1, n2);

            int suma = 0;
            for (int i = min; i <= max; i++) {
                suma += i;
            }

            File salida = new File("output.txt");

            BufferedWriter writer = new BufferedWriter(new FileWriter(salida));

            writer.write(suma);

            writer.close();

            System.out.println(suma);

        } catch (NumberFormatException e) {
            System.out.println(MSG_ERROR);
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(MSG_ERROR2);
            System.exit(1);
        } catch (IOException e) {

        }
    }
}
