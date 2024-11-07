public class Paises {
    // Variables de clase
    private String nombre;
    private String continente;
    private String idioma;

    // Constructor personalizado
    public Paises(String nombre, String continente, String idioma) {
        this.nombre = nombre;
        this.continente = continente;
        this.idioma = idioma;
        System.out.println("======= \"Información del país\" =======");
    }

    // Método para retornar un mensaje con la información del país
    public String obtenerInformacion() {
        return "Nombre del país: " + nombre + "\nContinente: " + continente + "\nIdioma: " + idioma;
    }
}
