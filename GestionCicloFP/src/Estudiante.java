/**
 * Representa un estudiante con nombre, ID y edad.
 */
public class Estudiante {

    private String nombre;
    private int id;
    private int edad;

    /**
     * Constructor del estudiante.
     *
     * @param nombre nombre del estudiante
     * @param id     identificador único del estudiante
     * @param edad   edad del estudiante
     */
    public Estudiante(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    /**
     * Devuelve una cadena con los datos del estudiante.
     *
     * @return información del estudiante
     */
    public String obtenerDatosEstudiante() {
        return "Estudiante: " + nombre + " (ID: " + id + ") Edad: " + edad;
    }

    public int getId() {
        return id;
    }
}
