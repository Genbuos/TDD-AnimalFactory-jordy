package rocks.zipcodewilmington;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Test
    void testMammalInheritance(){
        Dog dog = new Dog(null,null,null);

        assertTrue(dog instanceof Mammal);
    }

    @Test
    void testAnimalInheritance(){
        Dog dog = new Dog(null, null, null);
        assertTrue(dog instanceof Animal);

    }

    @Test
    void getId(){
        Dog dog = new Dog("jordy", null, 3);
        var actual = dog.getId();
        var expected = 3;

        assertEquals(expected, actual);
    }


    @Test
    void eat(){
        Dog dog = new Dog(null, null,null);
        dog.eat(new Food());

        var actual = dog.getNumberOfMealsEaten();

        var expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void setBirthDate(){
        Dog dog = new Dog(null,null,null);
        Date givenBirthDate = new Date();
        dog.setBirthDate(givenBirthDate);
        Date retrievedBirthDate = dog.getBirthDate();
        assertEquals(givenBirthDate, retrievedBirthDate);

    }



    @Test
    void testSpeak(){
        Dog dog = new Dog(null,null,null);
        var actual = dog.speak();

        var expected = "bark!";

        assertEquals(expected, actual);

    }


    @Test
    void constructorTest(){
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog("Jordy",givenBirthDate, givenId );

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        assertEquals("Jordy", retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);

    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        assertEquals(dogName, givenName);
    }
}
