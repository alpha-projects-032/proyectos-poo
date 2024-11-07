import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Crear una instancia de la clase Ciudades
        Ciudades ciudadInfo = new Ciudades();

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre de la ciudad: ");
        String ciudad = scanner.nextLine();
        
        System.out.print("Ingrese el país: ");
        String pais = scanner.nextLine();
        
        System.out.print("Ingrese el idioma: ");
        String idioma = scanner.nextLine();

        // Establecer los datos en la clase Ciudades
        ciudadInfo.establecerDatos(ciudad, pais, idioma);

        // Imprimir el mensaje
        System.out.println(ciudadInfo.obtenerMensaje());
        
        scanner.close();
    }
}
