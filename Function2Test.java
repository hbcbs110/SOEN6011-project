import org.junit.Before;

import static org.junit.Assert.*;

public class Function2Test {
    private Function2 f;

    @Before
    public void setUp() {
        f = new Function2();
    }

    @org.junit.Test
    public void tan() {
        assertEquals(0.0, f.tan(0.0),1e-12);
        System.out.println("Output of tan(0.0) is " + f.tan(0.0) + ", expecting " + 0.0);
        assertEquals(1.5574077246549022305069748074584, f.tan(1.0), 1e-12);
        System.out.println("Output of tan(1.0) is " + f.tan(1.0) + ", expecting 1.5574077246549022305069748074584");
        assertEquals(-1.5574077246549022305069748074584, f.tan(-1.0),1e-12);
        System.out.println("Output of tan(-1.0) is " + f.tan(-1.0) + ", expecting -1.5574077246549022305069748074584");
        assertEquals(0.54630248984379051325517946578029, f.tan(0.5), 1e-12);
        System.out.println("Output of tan(0.5) is " + f.tan(0.5) + ", expecting 0.54630248984379051325517946578029");
        assertEquals(14.101419947171719387646083651988, f.tan(1.5), 1e-12);
        System.out.println("Output of tan(1.5) is " + f.tan(1.5) + ", expecting 14.101419947171719387646083651988");
        assertEquals(1255.7655915006916046605430077739, f.tan(1.57), 1e-6);
        System.out.println("Output of tan(1.57) is " + f.tan(1.57) + ", expecting 1255.7655915006916046605430077739");
        assertEquals(-14.101419947171719387646083651988, f.tan(-1.5), 1e-12);
        System.out.println("Output of tan(-1.5) is " + f.tan(-1.5) + ", expecting -14.101419947171719387646083651988");
        assertEquals(-0.58721391515692907667780963564459, f.tan(1e2), 1e-12);
        System.out.println("Output of tan(1e2) is " + f.tan(1e2) + ", expecting -0.58721391515692907667780963564459");
        assertEquals(0.0, f.tan(3.1415926535897932384626433832795), 1e-12);
        System.out.println("Output of tan(pi) is " + f.tan(3.1415926535897932384626433832795) + ", expecting 0.0");
        assertEquals(-1.0180399498575736212457813731213, f.tan(2.5e4), 1e-10);
        System.out.println("Output of tan(2.5e4) is " + f.tan(2.5e4) + ", expecting -1.0180399498575736212457813731213");
        assertEquals(-0.37362445398759902917349708857538, f.tan(1e6), 1e-10);
        System.out.println("Output of tan(1e6) is " + f.tan(1e6) + ", expecting -0.37362445398759902917349708857538");
        System.out.println("Test of tan passed");
    }
}