import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class StapTest {
    private Node nodeE;
    private Reis reis1;
    private Stap stap1;
    private Stap stap2;

    @BeforeClass
    public void setup() {
        System.out.println("Startup");
        nodeE = new Node("Node-E");
        reis1 = new Reis(nodeE);
        stap1 = new Stap(10.00,2.25);
        stap2 = new Stap(5.00,-3.00);

        stap2.setNumber(2);
    }

    @Test
    void getReisTest() {
        setup();
        assertNull(stap1.getReis());
        stap1.setReis(reis1);
        assertNotNull(stap1.getReis());
    }

    @Test
    void getNumberTest() {
        setup();
        assertEquals(0,stap1.getNumber());
        stap1.setNumber(1);
        assertEquals(1,stap1.getNumber());
    }

    @Test
    void getKostenTest() {
        setup();
        assertEquals(22.50,stap1.getKosten()); //10 * 2.25
        assertEquals(-15.00,stap2.getKosten()); //5 * -3
    }

    @Test
    void testToString() {
        setup();
        assertEquals("Nummer: "+2,stap2.toString());
        assertEquals("Nummer: "+0,stap1.toString());
    }
}