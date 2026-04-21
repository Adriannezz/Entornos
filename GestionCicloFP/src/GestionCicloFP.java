import java.util.ArrayList;
import java.util.List;


public class GestionCicloFP {

    private List<Estudiante> estudiantes;
    private List<Ciclo> ciclos;

    
    public GestionCicloFP() {
        estudiantes = new ArrayList<>();
        ciclos = new ArrayList<>();
    }

 
    public void agregarEstudiante(String nombre, int id, int edad) {
        estudiantes.add(new Estudiante(nombre, id, edad));
    }

  
    public void agregarCiclo(String nombreCiclo) {
        ciclos.add(new Ciclo(nombreCiclo));
    }

   
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
