package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.add;
import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.remove;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {


    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //Given
        String givenName = "Bebop";
        Date givenBirthDate = new Date();
        Integer givenId = 2213;
        Integer expectedNumOfCats = 1;

        //When (a cat is constructed)
        Cat Bebop = new Cat(givenName, givenBirthDate, givenId);

        //When (method is called)
        CatHouse.add(Bebop);
        Integer actualNum = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(expectedNumOfCats, actualNum);

        CatHouse.clear();
    }


    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeByIdTest() {
        //Given
        Integer expectedNum = 0;
        Cat Bebop = new Cat("Bebop", new Date(12345), 2213);
        CatHouse.add(Bebop);
        //When
        remove(2213);
        Integer actualNum = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNum, actualNum);

        CatHouse.clear();
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeCatTest() {
        //Given
        Integer expectedNum = 0;
        Cat Bebop = new Cat("Bebop", new Date(12345), 2213);
        CatHouse.add(Bebop);
        //When
        CatHouse.remove(Bebop);
        Integer actualNum = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNum, actualNum);

        CatHouse.clear();
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatById() {
        //Given
        Cat Bebop = new Cat("Bebop", new Date(12345), 2213);
        CatHouse.add(Bebop);
        //When
        Cat Salem = CatHouse.getCatById(2213);
        Assert.assertEquals(Bebop, Salem);

        CatHouse.clear();
    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void getNumOfCatsTest() {
        //Given
        Integer expectedNumOfCats = 1;
        Cat Bebop = new Cat("Bebop", new Date(12345), 2213);
        CatHouse.add(Bebop);
        //When (method is called)
        Integer actualNum = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(expectedNumOfCats, actualNum);

        CatHouse.clear();
    }

}

