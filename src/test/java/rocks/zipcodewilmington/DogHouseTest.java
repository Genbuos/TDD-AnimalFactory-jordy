package rocks.zipcodewilmington;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {



    // TODO - Create tests for `Dog getDogById(Integer id)`


    @Test
    void getDogByIdTest(){
        Dog dog = new Dog(null,null,2);
        DogHouse.clear();
        DogHouse.add(dog);
        var houseDog = DogHouse.getDogById(2);
        assertSame(dog, houseDog);
        assertTrue( houseDog instanceof Dog);

    }


    @Test
    void removeTest(){
        Dog dog = new Dog(null,null,2);
        DogHouse.clear();
        DogHouse.add(dog);
        assertEquals(1, DogHouse.getNumberOfDogs());

        DogHouse.remove(dog);
        assertEquals(0, DogHouse.getNumberOfDogs());

        DogHouse.add(dog);
        assertEquals(1, DogHouse.getNumberOfDogs());

        DogHouse.remove(2);
        assertEquals(0, DogHouse.getNumberOfDogs());

        DogHouse.clear();

    }

    @Test
    void addTest(){
        Dog dog = new Dog(null,null,2);
        DogHouse.clear();
        DogHouse.add(dog);

        assertSame(1 , DogHouse.getNumberOfDogs());
    }



    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then

        assertTrue(1 ==DogHouse.getNumberOfDogs() );
    }
}
