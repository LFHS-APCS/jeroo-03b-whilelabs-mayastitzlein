import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.setup();
        test.test1_faceNorth();
        test.test2_goToOrigin();
        test.test3_meander();
    }

    @Before
    public void setup() {
        Map.getInstance().loadMap("maps/whileLabs.jev");
    }

    @Test
    public void test1_faceNorth()
    {   

        Jeroo j1 = new Jeroo(1, 4, EAST, 100);
        j1.faceNorth();
        assertTrue("started east, should finish north", j1.isFacing(NORTH));
        assertEquals("should still be at (1, 4)", 1, j1.getY());
        assertEquals("should still be at (1, 4)", 4, j1.getX());
        Map.getInstance().removeJeroo(j1);

        Jeroo j2 = new Jeroo(1, 5, SOUTH, 100);
        j2.faceNorth();
        assertTrue("started south, should finish north", j2.isFacing(NORTH));
        assertEquals("should still be at (1, 5)", 1, j2.getY());
        assertEquals("should still be at (1, 5)", 5, j2.getX());
        Map.getInstance().removeJeroo(j2);

        Jeroo j3 = new Jeroo(1, 6, WEST, 100);
        j3.faceNorth();
        assertTrue("started west, should finish north", j3.isFacing(NORTH));
        assertEquals("should still be at (1, 6)", 1, j3.getY());
        assertEquals("should still be at (1, 6)", 6, j3.getX());
        Map.getInstance().removeJeroo(j3);

        Jeroo j4 = new Jeroo(1, 7, NORTH, 100);
        j4.faceNorth();
        assertTrue("started north, should finish north", j4.isFacing(NORTH));
        assertEquals("should still be at (1, 7)", 1, j4.getY());
        assertEquals("should still be at (1, 7)", 7, j4.getX());
        Map.getInstance().removeJeroo(j4);
    }

    @Test
    public void test2_goToOrigin()
    {   
        Jeroo j1 = new Jeroo(6, 2, EAST, 0);
        j1.goToOrigin();
        assertEquals("should still be at (0, 0)", 0, j1.getY());
        assertEquals("should still be at (0, 0)", 0, j1.getX());
        Map.getInstance().removeJeroo(j1);

        Jeroo j2 = new Jeroo(7, 4, NORTH, 0);
        j2.goToOrigin();
        assertEquals("should still be at (0, 0)", 0, j2.getY());
        assertEquals("should still be at (0, 0)", 0, j2.getX());
        Map.getInstance().removeJeroo(j2);

        Jeroo j3 = new Jeroo(1, 4, WEST, 0);
        j3.goToOrigin();
        assertEquals("should still be at (0, 0)", 0, j3.getY());
        assertEquals("should still be at (0, 0)", 0, j3.getX());
        Map.getInstance().removeJeroo(j3);

        Jeroo j4 = new Jeroo(2, 5, SOUTH, 0);
        j4.goToOrigin();
        assertEquals("should still be at (0, 0)", 0, j4.getY());
        assertEquals("should still be at (0, 0)", 0, j4.getX());
        Map.getInstance().removeJeroo(j4);
    }

    @Test
    public void test3_meander()
    {   
        Jeroo j1 = new Jeroo(9, 1, EAST, 0);
        j1.meander();
        assertEquals("should still be at (5, 8)", 5, j1.getY());
        assertEquals("should still be at (5, 8)", 8, j1.getX());
    }

}
