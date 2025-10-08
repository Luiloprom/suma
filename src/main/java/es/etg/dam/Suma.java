package es.etg.dam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Suma {

    public static final String MSG_ERROR_FORMATO = "Solo se permiten valores numericos";
    public static final String MSG_ERROR_PARAMETROS = "Hay que insertar dos parametros";
    public static final String MSG_ERROR_ESCRITURA = "Error al escribir en el fichero";
    public static final String RUTA = "src/main/java/es/etg/dam/output.txt";

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA))) {

            try {

                int n1 = parsear(args[0]);
                int n2 = parsear(args[1]);

                int resultado = calcularRango(n1, n2);

                writer.write(String.valueOf(resultado));

            } catch (NumberFormatException e) {
                writeError(writer, MSG_ERROR_FORMATO);
                throw e;
            } catch (ArrayIndexOutOfBoundsException e) {
                writeError(writer, MSG_ERROR_PARAMETROS);
                throw e;
            }
        } catch (IOException e) {
            System.out.println(MSG_ERROR_ESCRITURA);
        }

    }

    public static int parsear(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public static void writeError(BufferedWriter writer, String s) throws IOException {
        writer.write(s);
    }

    public static int calcularRango(int n1, int n2) {
        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        int suma = 0;
        for (int i = min; i <= max; i++) {
            suma += i;
        }
        return suma;
    }
}
