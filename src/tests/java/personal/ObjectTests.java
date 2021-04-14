package personal;

import org.junit.jupiter.api.Test;
import personal.Alumno;
import personal.Director;
import personal.Profesor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObjectTests {

    @Test
    public void testAlumno() {
        Alumno a = new Alumno(1, 1.70f, "Oscar", 1, 220);
        assertEquals(a.getEdad(), 1);
        assertEquals(a.getEstatura(), 1.70f);
        assertEquals(a.getNombre(), "Oscar");
        assertEquals(a.getCurso(), 1);
        assertEquals(a.getCoeficiente(), 220);
    }

    @Test
    public void testProfesor() {
        Profesor p = new Profesor(1, 1.70f, "Oscar", 1, 2200);
        Profesor p1 = new Profesor(1, 1.70f, "Oscar", 1, 2200);
        //Equals Method test
        assertTrue(p1.equals(p));
        assertEquals(p.getEdad(), 1);
        assertEquals(p.getEstatura(), 1.70f);
        assertEquals(p.getNombre(), "Oscar");
        assertEquals(p.getCurso(), 1);
        assertEquals(p.getSueldo(), 2200);
    }

    @Test
    public void testDirector() {
        Director d = new Director(1, 1.70f, "Oscar", 1, 2200);
        assertEquals(d.getEdad(), 1);
        assertEquals(d.getEstatura(), 1.70f);
        assertEquals(d.getNombre(), "Oscar");
        assertEquals(d.getCurso(), 1);
        assertEquals(d.getSueldo(), 2200);
    }
}
