package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`DONE
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`DONE

    @Test
    public void createCatTest(){
        //Given (cat data)
        String givenName = "CeCe";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        //When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When (we retrieve data from cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void creatCatTest2(){
        //Given
        String givenName = "Bebop";
        Date birthDate = new Date();
        Integer givenID = 2213;

        //When
        Cat Bebop = new Cat(givenName, birthDate, givenID);

        //When
        String retrievedName = Bebop.getName();
        Date retrievedDate = Bebop.getBirthDate();
        Integer retreivedId = Bebop.getId();

        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(birthDate, retrievedDate);
        Assert.assertEquals(givenID, retreivedId);

    }

    @Test
    public void createDogTest(){
        //Given (dog data)
        String givenName = "Izzy";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        //When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        //When (we retrieve data from cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void createDogTest2(){
        //Given (dog data)
        String givenName = "Seamus";
        Date givenBirthDate = new Date();
        Integer givenId = 1322;

        //When (a dog is constructed)
        Dog Seamus = new Dog(givenName, givenBirthDate, givenId);

        //When (we retrieve data from cat)
        String retrievedName = Seamus.getName();
        Date retrievedBirthDate = Seamus.getBirthDate();
        Integer retrievedId = Seamus.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
