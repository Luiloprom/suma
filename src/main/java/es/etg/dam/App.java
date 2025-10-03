package es.etg.dam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static String ruta = "es.etg.dam.Suma";

    public static void main(String[] args) {

        final String[] comando = { "java", "-cp", "target/classes", ruta, "1" };

        try {

            Process process = Runtime.getRuntime().exec(comando);

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String linea;
            while ((linea = reader.readLine()) != null) {
                output.append(linea).append("\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            } else {
                System.exit(1);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Error");
            System.exit(34);
        }
    }
}