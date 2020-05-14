package Summatief2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testToString() {
        Node node0 = new Node("node-0", false);
        assertEquals("node-0", node0.toString());
    }

//    @Test
//    void testSetOption1() {
//        Node node1 = new Node("node-1");
//    }
}