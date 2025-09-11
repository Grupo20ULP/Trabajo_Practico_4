package clases;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    // Mensajes centralizados (mismo texto que antes)
    private static final String MSG_OK = "Alumno Inscripto Correctamente";
    private static final String MSG_ERR_TITULO = "ERROR AL INGRESAR";
    private static final String MSG_ERR_CUERPO = "El Alumno ya esta inscripto a esa Materia";

    private int legajo;
    private String apellido;
    private String nombre;

    // Inicialización en el campo; quitamos la duplicada del constructor
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        // (Antes se hacía this.materias = new HashSet<>(); redundante con la de arriba)
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        // Mantenemos exactamente "apellido, nombre"
        return apellido + ", " + nombre;
    }

    public int cantidadMaterias() {
        return materias.size();
    }

    public void agregarMateria(Materia materia) {
        // Misma lógica, escrito de forma clara
        boolean agregado = materias.add(materia);
        if (agregado) {
            JOptionPane.showMessageDialog(null, MSG_OK);
        } else {
            JOptionPane.showMessageDialog(
                null,
                MSG_ERR_CUERPO,
                MSG_ERR_TITULO,
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
