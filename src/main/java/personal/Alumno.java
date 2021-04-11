package personal;

import java.util.Objects;

public class Alumno {
    private int edad;
    private float estatura;
    private String nombre;
    private int curso;
    private Boolean graduado;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return getEdad() == alumno.getEdad() && Float.compare(alumno.getEstatura(), getEstatura()) == 0 && getCurso() == alumno.getCurso() && Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getGraduado(), alumno.getGraduado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), getEstatura(), getNombre(), getCurso(), getGraduado());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setGraduado(Boolean graduado) {
        this.graduado = graduado;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCurso() {
        return curso;
    }

    public Boolean getGraduado() {
        return graduado;
    }

    public Alumno(int edad, float estatura, String nombre, int curso, Boolean graduado) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
        this.curso = curso;
        this.graduado = graduado;
    }
}
