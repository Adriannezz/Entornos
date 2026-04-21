import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona estudiantes y ciclos formativos.
 */
public class GestionCicloFP {

    private List<Estudiante> estudiantes;
    private List<Ciclo> ciclos;

    /**
     * Constructor que inicializa las listas.
     */
    public GestionCicloFP() {
        estudiantes = new ArrayList<>();
        ciclos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo estudiante al sistema.
     *
     * @param nombre nombre del estudiante
     * @param id     identificador único
     * @param edad   edad del estudiante
     */
    public void agregarEstudiante(String nombre, int id, int edad) {
        estudiantes.add(new Estudiante(nombre, id, edad));
    }

    /**
     * Agrega un nuevo ciclo formativo.
     *
     * @param nombreCiclo nombre del ciclo
     */
    public void agregarCiclo(String nombreCiclo) {
        ciclos.add(new Ciclo(nombreCiclo));
    }

    /**
     * Matricula un estudiante en un ciclo.
     *
     * @param idEstudiante ID del estudiante
     * @param nombreCiclo  nombre del ciclo
     */
    public void matricularEstudiante(int idEstudiante, String nombreCiclo) {
        Estudiante estudiante = buscarEstudiante(idEstudiante);
        Ciclo ciclo = buscarCiclo(nombreCiclo);

        if (estudiante != null && ciclo != null) {
            ciclo.agregarEstudiante(estudiante);
        }
    }

    private Estudiante buscarEstudiante(int id) {
        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    private Ciclo buscarCiclo(String nombre) {
        for (Ciclo c : ciclos) {
            if (c.getNombreCiclo().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Muestra por consola todos los ciclos y sus estudiantes.
     */
    public void mostrarCiclos() {
        for (Ciclo ciclo : ciclos) {
            System.out.println(ciclo.obtenerDatosCiclo());
        }
    }

    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricularEstudiante(1, "DAW");
        gestion.matricularEstudiante(2, "ASIR");

        gestion.mostrarCiclos();
    }
}
