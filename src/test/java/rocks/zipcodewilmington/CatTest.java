package rocks.zipcodewilmington;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Test
    void testMammalInheritance(){
        var cat = new Cat(null,null,null);

        assertTrue(cat instanceof Mammal);
    }

    @Test
    void testAnimalInheritance(){
        var cat = new Cat(null,null,null);
        assertTrue(cat instanceof Animal);

    }

    @Test
    void getId(){
        var cat = new Cat(null,null,3);
        var actual = cat.getId();
        var expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void eat(){
        var cat = new Cat(null,null,null);;
        cat.eat(new Food());

        var actual = cat.getNumberOfMealsEaten();

        var expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    void testSpeak(){
        var cat = new Cat(null,null,null);
        var actual = cat.speak();

        var expected = "meow!";

        assertEquals(expected, actual);

    }

    @Test
    void setBirthDate(){
        var cat = new Cat(null,null,null);
        Date givenBirthDate = new Date();
        cat.setBirthDate(givenBirthDate);
        Date retrievedBirthDate = cat.getBirthDate();
        assertEquals(givenBirthDate, retrievedBirthDate);

    }


    @Test
    void setName(){
        var cat = new Cat(null,null,null);
        var name = "Jordy";
        cat.setName(name);
        var actName = cat.getName();

        assertEquals(name,actName);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

}
