package personal;

import java.util.Objects;

public class Director {
    private int edad;
    private float estatura;
    private String nombre;
    private int curso;
    private Boolean activo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        Director director = (Director) o;
        return getEdad() == director.getEdad() && Float.compare(director.getEstatura(), getEstatura()) == 0 && getCurso() == director.getCurso() && Objects.equals(getNombre(), director.getNombre()) && Objects.equals(getActivo(), director.getActivo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), getEstatura(), getNombre(), getCurso(), getActivo());
    }

    public Director(int edad, float estatura, String nombre, int curso, Boolean activo) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
        this.curso = curso;
        this.activo = activo;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
