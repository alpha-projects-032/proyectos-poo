import java.util.Scanner;

public class Alumno {
    // Atributos
    private String carnet;
    public String nombre;
    public String apellido;
    private String carrera;
    public String materia;
    public String deporte;

    // Métodos getter y setter para atributos privados
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método para capturar datos
    public void capturarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el carnet: ");
        setCarnet(scanner.nextLine());  // Usando el setter para asignar carnet

        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        apellido = scanner.nextLine();

        System.out.print("Ingrese la carrera: ");
        setCarrera(scanner.nextLine());  // Usando el setter para asignar carrera

        System.out.print("Ingrese la materia: ");
        materia = scanner.nextLine();

        System.out.print("Ingrese el deporte: ");
        deporte = scanner.nextLine();
    }

    // Método para obtener el nombre completo
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    // Método estudiar que muestra un mensaje relacionado con la materia
    public void estudiar() {
        System.out.println(nombreCompleto() + " con carnet " + getCarnet() + " prefiere la materia de " + materia);
    }

    // Método pasatiempo que devuelve un mensaje relacionado con la carrera y el deporte
    public String pasatiempo() {
        return nombreCompleto() + " estudiante de " + getCarrera() + ", en su tiempo libre practica " + deporte;
    }
}
