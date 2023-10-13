package rocks.zipcodewilmington;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {





    @Test
    void getNumberOfCatsTest(){
        var cat = new Cat(null,null,null);
        CatHouse.clear();
        CatHouse.add(cat);
        var actual =  CatHouse.getNumberOfCats();
        assertEquals(1, actual);
    }

    @Test
    void getCatByIdTest(){
        var cat = new Cat(null,null,2);
        CatHouse.clear();

        CatHouse.add(cat);
        var houseCat = CatHouse.getCatById(2);
        assertSame(cat, houseCat);
        assertTrue( houseCat instanceof Cat);

    }


    @Test
    void removeTest(){
        var cat = new Cat(null,null,2);
        CatHouse.clear();
        CatHouse.add(cat);
        assertEquals(1, CatHouse.getNumberOfCats());

        CatHouse.remove(cat);
        assertEquals(0, CatHouse.getNumberOfCats());

        CatHouse.add(cat);
        assertEquals(1, CatHouse.getNumberOfCats());

        CatHouse.remove(2);
        assertEquals(0, CatHouse.getNumberOfCats());

    }


    @Test
    void addTest(){
        var cat = new Cat(null,null,null);
        CatHouse.clear();
        CatHouse.add(cat);
        assertEquals(1, CatHouse.getNumberOfCats());

    }

}
