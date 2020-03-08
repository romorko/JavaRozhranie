package TestBod2D;
import map.bod.Bod2D;
import static org.junit.jupiter.api.Assertions.*;

class Bod2DTest
{
    Bod2D Prvy;
    Bod2D Druhy;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        Prvy= new Bod2D(1,2);
        Druhy = new Bod2D(2,3);
    }

    @org.junit.jupiter.api.Test
    void getDistance()
    {

    }

    @org.junit.jupiter.api.Test
    void plus()
    {
        assertEquals(Prvy.Plus(Druhy),new Bod2D(3,5));
    }

    @org.junit.jupiter.api.Test
    void minus()
    {
        assertEquals(Prvy.Minus(Druhy),new Bod2D(-1,-1));
    }
}