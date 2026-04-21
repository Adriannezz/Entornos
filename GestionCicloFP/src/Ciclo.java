import java.util.ArrayList;
import java.util.List;


public class Ciclo {

    private String nombreCiclo;
    private List<Estudiante> estudiantes;

    
    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
        this.estudiantes = new ArrayList<>();
    }

   
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

  
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
