public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de Alumno
        Alumno alumno = new Alumno();

        // Capturar datos del alumno
        alumno.capturarDatos();

        // Mostrar la información de estudiar
        alumno.estudiar();

        // Mostrar la información de pasatiempo
        System.out.println(alumno.pasatiempo());
    }
}