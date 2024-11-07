import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        // Capturar datos desde el teclado
        System.out.print("Ingrese el nombre del país: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el continente: ");
        String continente = scanner.nextLine();

        System.out.print("Ingrese el idioma: ");
        String idioma = scanner.nextLine();

        // Crear una instancia de la clase Paises con el constructor personalizado
        Paises pais = new Paises(nombre, continente, idioma);

        // Mostrar información del país
        System.out.println(pais.obtenerInformacion());

        // Cerrar el Scanner
        scanner.close();
    }
}
