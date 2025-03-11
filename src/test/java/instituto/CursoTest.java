package instituto;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CursoTest {

	private Curso curso;
    private Persona persona;

    @BeforeClass
    void setUp() {
        curso = new Curso("Matematicas");
        persona = new Persona(12345678, "Juan Perez", 'M', 10, 5, 2000);
    }

    @Test
    void testGetNombre() {
        assertEquals("Matematicas", curso.getNombre());
    }

    @Test
    void testAniadirAlumno() {
        curso.aniadirAlumno(persona);
        assertTrue(curso.toString().contains("Juan Perez"));
    }

}
