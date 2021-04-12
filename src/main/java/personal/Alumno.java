package personal;

import java.util.Objects;

public class Alumno {
    private int edad;
    private float estatura;
    private String nombre;
    private int curso;
    private int coeficiente;

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
        return getEdad() == alumno.getEdad() && Float.compare(alumno.getEstatura(), getEstatura()) == 0 && getCurso() == alumno.getCurso() && Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getCoeficiente(), alumno.getCoeficiente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), getEstatura(), getNombre(), getCurso(), getCoeficiente());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
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

    public int getCoeficiente() {
        return coeficiente;
    }

    @Override
    public String toString() {
        return "Alumno -> " +
                "edad=" + edad +
                ", estatura=" + estatura +
                ", nombre='" + nombre + '\'' +
                ", curso=" + curso +
                ", coeficiente=" + coeficiente;
    }

    public Alumno(int edad, float estatura, String nombre, int curso, int coeficiente) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
        this.curso = curso;
        this.coeficiente = coeficiente;
    }
}
