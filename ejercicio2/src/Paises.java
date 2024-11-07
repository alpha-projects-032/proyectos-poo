public class Paises {
    // Variables de clase
    private String nombre;
    private String continente;
    private String idioma;

    // Constructor por omisión
    public Paises() {
        System.out.println("==========\"Países del mundo\"==========");
    }

    // Método para capturar datos desde teclado
    public void capturarDatos(java.util.Scanner scanner) {
        System.out.print("Ingrese el nombre del país: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el continente: ");
        continente = scanner.nextLine();

        System.out.print("Ingrese el idioma: ");
        idioma = scanner.nextLine();
    }

    // Método para mostrar la información almacenada
    public void mostrarInformacion() {
        System.out.println("Nombre del país: " + nombre);
        System.out.println("Continente: " + continente);
        System.out.println("Idioma: " + idioma);
    }
}
