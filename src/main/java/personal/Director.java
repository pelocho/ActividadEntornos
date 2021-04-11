package personal;

import java.util.Objects;

public class Director {
    private int edad;
    private float estatura;
    private String nombre;
    private int curso;
    private int sueldo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        Director director = (Director) o;
        return getEdad() == director.getEdad() && Float.compare(director.getEstatura(), getEstatura()) == 0 && getCurso() == director.getCurso() && Objects.equals(getNombre(), director.getNombre()) && Objects.equals(getSueldo(), director.getSueldo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), getEstatura(), getNombre(), getCurso(), getSueldo());
    }

    public Director(int edad, float estatura, String nombre, int curso, int sueldo) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
        this.curso = curso;
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
