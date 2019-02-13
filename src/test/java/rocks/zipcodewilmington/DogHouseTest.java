package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        Integer expectedNum = 1;
        Dog Milo = new Dog("Milo", new Date(12345), 21996);
        DogHouse.add(Milo);
        // When
        Integer actualNum = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expectedNum, actualNum);

        DogHouse.clear();
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeByIdTest(){
        Integer expectedNum = 0;
        Dog Milo = new Dog("Milo", new Date(12345), 21996);
        DogHouse.add(Milo);
        // When
        DogHouse.remove(21996);
        Integer actualNum = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expectedNum, actualNum);

        DogHouse.clear();

    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeByName(){
        Integer expectedNum = 0;
        Dog Milo = new Dog("Milo", new Date(12345), 21996);
        DogHouse.add(Milo);
        // When
        DogHouse.remove(Milo);
        Integer actualNum = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expectedNum, actualNum);

        DogHouse.clear();
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByIdTest(){
        //Given
        Dog Milo = new Dog("Milo", new Date(12345), 21996);
        DogHouse.add(Milo);
        //When
        Dog Seamus = DogHouse.getDogById(21996);
        //Then
        Assert.assertEquals(Milo, Seamus);

        DogHouse.clear();

    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumOfDogsTest(){
        //Given
        Integer expectedNum = 1;
        Dog Milo = new Dog("Milo", new Date(12345), 21996);
        DogHouse.add(Milo);
        //When
        Integer actualNum = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNum, actualNum);

        DogHouse.clear();
    }
}
