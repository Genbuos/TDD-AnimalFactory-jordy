package rocks.zipcodewilmington;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {



    @Test
    void createCat(){
        var cat = AnimalFactory.createCat("Jordy", new Date());

        assertTrue(cat instanceof Cat);
    }

    @Test
    void createDog(){
        var dog = AnimalFactory.createDog("Jordy", new Date());

        assertTrue(dog instanceof Dog);

    }
}
