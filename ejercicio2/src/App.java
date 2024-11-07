import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la clase Paises, invocando el constructor por omisión
        Paises pais = new Paises();

        // Capturar datos
        pais.capturarDatos(scanner);

        // Mostrar información
        pais.mostrarInformacion();

        // Cerrar el Scanner
        scanner.close();
    }
}
