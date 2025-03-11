package instituto;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Clase de prueba para la clase Persona.
 * Verifica la funcionalidad de los métodos principales.
 * 
 * @author Georgii
 * @version 1.0
 */
public class PersonaTest {
	private Persona persona;

	/**
     * Configura los objetos antes de cada prueba.
     */
    @BeforeClass
    void setUp() {
        persona = new Persona(12345678, "Juan Perez", 'M', 10, 5, 2000);
    }

    /**
     * Prueba el método getNombre().
     */
    @Test
    void testGetNombre() {
        assertEquals("Juan Perez", persona.getNombre());
    }

    /**
     * Prueba el método getEdad().
     */
    @Test
    void testGetEdad() {
        int edadEsperada = LocalDate.now().getYear() - 2000;
        assertEquals(edadEsperada, persona.getEdad());
    }

}
