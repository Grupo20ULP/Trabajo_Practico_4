package ALUMNO;

/**
 *
 * @author Heber Gomez
 */
public class Materia {

    protected int IdMateria;
    protected String nombre;
    protected int anio;

    public Materia (int IdMateria, String nombre, int anio) {
        this.IdMateria = IdMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria () {
        return IdMateria;
    }

    public void setIdMateria (int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int getAnio () {
        return anio;
    }

    public void setAnio (int anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode () {
        int hash = 7;
        hash = 53 * hash + this.IdMateria;
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
        final Materia other = (Materia) obj;
        return this.IdMateria == other.IdMateria;
    }
    
    
}
