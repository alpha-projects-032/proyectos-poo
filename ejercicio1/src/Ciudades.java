public class Ciudades {
    // Variables privadas
    private String ciudad;
    private String pais;
    private String idioma;

    // Método para asignar valores y retornar el mensaje
    public void establecerDatos(String ciudad, String pais, String idioma) {
        this.ciudad = ciudad;
        this.pais = pais;
        this.idioma = idioma;
    }

    public String obtenerMensaje() {
        return ciudad + " es una ciudad que está en " + pais + " y su idioma es el " + idioma + ".";
    }
}
