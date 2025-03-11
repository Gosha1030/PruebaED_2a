package instituto;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {

	private Persona persona;

    @BeforeClass
    void setUp() {
        persona = new Persona(12345678, "Juan Perez", 'M', 10, 5, 2000);
    }

    @Test
    void testGetNombre() {
        assertEquals("Juan Perez", persona.getNombre());
    }

    @Test
    void testGetEdad() {
        int edadEsperada = LocalDate.now().getYear() - 2000;
        assertEquals(edadEsperada, persona.getEdad());
    }

}
