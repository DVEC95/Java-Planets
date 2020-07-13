import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    Planet planet;

    @Before
    public void before(){
        planet = new Planet("Alderaan", 908973);
    }

    @Test
    public void hasName(){
        assertEquals("Alderaan", planet.getName());
    }
    @Test
    public void hasSize(){
        assertEquals(908973, planet.getSize());
    }
    @Test
    public void explode(){
        assertEquals("Boom! Alderaan exploded.", planet.explode());
    }
}
