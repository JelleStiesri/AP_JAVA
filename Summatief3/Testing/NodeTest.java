import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.After;
import org.junit.Before;



class NodeTest {
    private Node node1 = new Node("Nodta-1");

    @BeforeClass
    public void before() {
        node1.setName("Node-1");
    }

    @Test
    void getDistance() {
    }

    @Test
    void getPath() {
    }

    @Test // @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Node-1",node1.toString());




    }
}