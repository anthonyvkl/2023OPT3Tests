package TestPackage;
import Classes.Berekening;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BerekeningTest {
    // MC/DC Test
   @Test
   void permissieOpstijgen() {
       Berekening berekening1 = new Berekening();
       assertFalse(berekening1.permissieOpstijgen(true,1001,49));
       assertFalse(berekening1.permissieOpstijgen(false,999,49));
       assertTrue(berekening1.permissieOpstijgen(true,999,49));
   }

   // Equivalenteklassen en Randvoorwaarden Tests
    @Test
    void prijsLanden1kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(100, berekening2.prijsLanden(1));
    }

    @Test
    void prijsLanden500kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(100, berekening2.prijsLanden(500));
    }

    @Test
    void prijsLanden999kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(100, berekening2.prijsLanden(999));
    }

    @Test
    void prijsLanden1000kgTest() {
        Berekening berekening2 = new Berekening();
        assertEquals(500, berekening2.prijsLanden(1000));
    }

    @Test
    void prijsLanden1001kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(500, berekening2.prijsLanden(1001));
    }

    @Test
    void prijsLanden3000kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(500, berekening2.prijsLanden(3000));
    }

    @Test
    void prijsLanden4999kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(500, berekening2.prijsLanden(4999));

    }
    @Test
    void prijsLanden5000kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(2500, berekening2.prijsLanden(5000));
    }

    @Test
    void prijsLanden5050kgTest() {
       Berekening berekening2 = new Berekening();
       assertEquals(2500, berekening2.prijsLanden(5050));
    }

    // Pairwise Testing

    @Test
    void prijsInclusiefFactoren500kgTest1() {
       Berekening berekening3 = new Berekening();
       assertEquals(1089.0,berekening3.prijsInclusiefFactoren(500,1,true,true));
    }

    @Test
    void prijsInclusiefFactoren500kgTest2() {
       Berekening berekening3 = new Berekening();
       assertEquals(150.0,berekening3.prijsInclusiefFactoren(500,5,false,false));
    }

    @Test
    void prijsInclusiefFactoren3000kgTest1() {
       Berekening berekening3 = new Berekening();
       assertEquals(1300.0,berekening3.prijsInclusiefFactoren(3000,1,true,false));
    }

    @Test
    void prijsInclusiefFactoren3000kgTest2() {
       Berekening berekening3 = new Berekening();
       assertEquals(907.5,berekening3.prijsInclusiefFactoren(3000,5,false,true));
    }

    @Test
    void prijsInclusiefFactoren7000kgTest1() {
       Berekening berekening3 = new Berekening();
       assertEquals(3025.0,berekening3.prijsInclusiefFactoren(7000,1,false,true));
    }

    @Test
    void prijsInclusiefFactoren7000kgTest2() {
       Berekening berekening3 = new Berekening();
       assertEquals(3750.0,berekening3.prijsInclusiefFactoren(7000,5,false,false));
    }
}
