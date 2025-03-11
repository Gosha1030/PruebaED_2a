package instituto;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Clase de prueba para la clase Curso.
 * Verifica la funcionalidad de los métodos principales.
 * 
 * @author Georgii
 * @version 1.0
 */
public class CursoTest {

	private Curso curso;
    private Persona persona;

    /**
     * Configura los objetos antes de cada prueba.
     */
    @BeforeClass
    void setUp() {
        curso = new Curso("Matematicas");
        persona = new Persona(12345678, "Juan Perez", 'M', 10, 5, 2000);
    }

    /**
     * Prueba el método getNombre().
     */
    @Test
    void testGetNombre() {
        assertEquals("Matematicas", curso.getNombre());
    }

    /**
     * Prueba el método aniadirAlumno().
     */
    @Test
    void testAniadirAlumno() {
        curso.aniadirAlumno(persona);
        assertTrue(curso.toString().contains("Juan Perez"));
    }

}
