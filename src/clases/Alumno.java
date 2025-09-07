package clases;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;

    private String apellido;

    private String nombre;
    
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias= new HashSet<>();
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
        return  apellido+ ", " + nombre ;
    }
    public int cantidadMaterias(){
        return materias.size();
    }
    public void agregarMateria(Materia materia){
         if(materias.add(materia)){
             JOptionPane.showMessageDialog(null, "Alumno Inscripto Correctamente");
         }else{
             JOptionPane.showMessageDialog(null, "El Alumno ya esta inscripto a esa Materia",
                "ERROR AL INGRESAR", JOptionPane.ERROR_MESSAGE);
             
         };
    }
}
