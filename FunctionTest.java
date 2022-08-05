import org.junit.Before;

import static org.junit.Assert.*;

public class FunctionTest {
    private Function f;

    @Before
    public void setUp() {
        f = new Function();
    }

    @org.junit.Test
    public void sin() {
        assertEquals(0.0, f.sin(0.0), 1e-12);
        assertEquals(0.8414709848078965066525023216303, f.sin(1.0), 1e-12);
        assertEquals(-0.8414709848078965066525023216303, f.sin(-1.0), 1e-12);
        assertEquals(0.47942553860420300027328793521557, f.sin(0.5), 1e-12);
        assertEquals(-0.50636564110975879365655761045979, f.sin(1e2), 1e-12);
        assertEquals(1.0, f.sin(1.5707963267948966192313216916398), 1e-12);
        assertEquals(0.0, f.sin(3.1415926535897932384626433832795), 1e-12);
        System.out.println("Test of sin passed");
    }

    @org.junit.Test
    public void cos() {
        assertEquals(1.0, f.cos(0.0), 1e-12);
        assertEquals(0.54030230586813971740093660744298, f.cos(1.0), 1e-12);
        assertEquals(0.54030230586813971740093660744298, f.cos(-1.0), 1e-12);
        assertEquals(0.87758256189037271611628158260383, f.cos(0.5), 1e-12);
        assertEquals(0.86231887228768393410193851395084, f.cos(1e2), 1e-12);
        assertEquals(0.0, f.cos(1.5707963267948966192313216916398), 1e-12);
        assertEquals(-1.0, f.cos(3.1415926535897932384626433832795), 1e-12);
        System.out.println("Test of cos passed");
    }

    @org.junit.Test
    public void tan() {
        assertEquals(0.0, f.tan(0.0),1e-12);
        assertEquals(1.5574077246549022305069748074584, f.tan(1.0), 1e-12);
        assertEquals(-1.5574077246549022305069748074584, f.tan(-1.0),1e-12);
        assertEquals(0.54630248984379051325517946578029, f.tan(0.5), 1e-12);
        assertEquals(14.101419947171719387646083651988, f.tan(1.5), 1e-12);
        assertEquals(-0.58721391515692907667780963564459, f.tan(1e2), 1e-12);
        assertEquals(0.0, f.tan(3.1415926535897932384626433832795), 1e-12);
        assertEquals(-1.0180399498575736212457813731213, f.tan(2.5e4), 1e-10);
        assertEquals(-0.37362445398759902917349708857538, f.tan(1e6), 1e-10);
        System.out.println("Test of tan passed");
    }
}