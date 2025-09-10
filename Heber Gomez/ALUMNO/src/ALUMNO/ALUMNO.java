package ALUMNO;

import java.util.HashSet;

/**
 *
 * @author Heber Gomez
 */
public class ALUMNO {

    private int legajo;
    private String nombre;
    private String apellido;
    private HashSet<Materia> materias;

    public ALUMNO (int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo () {
        return legajo;
    }

    public void setLegajo (int legajo) {
        this.legajo = legajo;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellido () {
        return apellido;
    }

    public void setApellido (String apellido) {
        this.apellido = apellido;
    }



    public void agregarMaterias (Materia m) {
        materias.add(m);
    }

    public int CantidadDeMaterias () {
        return materias.size();
    }

    @Override
    public int hashCode () {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ALUMNO other = (ALUMNO) obj;
        return this.legajo == other.legajo;
    }
    
}
