import java.util.ArrayList;
import java.util.List;

/**
 * Representa un ciclo formativo que contiene una lista de estudiantes matriculados.
 */
public class Ciclo {

    private String nombreCiclo;
    private List<Estudiante> estudiantes;

    /**
     * Constructor del ciclo.
     *
     * @param nombreCiclo nombre del ciclo formativo
     */
    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
        this.estudiantes = new ArrayList<>();
    }

    /**
     * Añade un estudiante al ciclo.
     *
     * @param estudiante estudiante a matricular
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /**
     * Devuelve una cadena con los datos del ciclo y sus estudiantes.
     *
     * @return información del ciclo
     */
    public String obtenerDatosCiclo() {
        StringBuilder datos = new StringBuilder("Ciclo: " + nombreCiclo + "\nEstudiantes:\n");

        for (Estudiante e : estudiantes) {
            datos.append(e.obtenerDatosEstudiante()).append("\n");
        }

        return datos.toString();
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }
}
