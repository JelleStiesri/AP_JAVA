import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeTest {
    private Type vliegen;

    @BeforeClass
    public void setup() {
        vliegen = new Type("Vliegen", 2.00);
    }

    @Test
    void getFactorTest() {
        setup();
        assertEquals(2.00,vliegen.getFactor());
    }

    @Test
    void ToStringTest() {
        setup();
        assertEquals("Vliegen",vliegen.toString());
    }
}