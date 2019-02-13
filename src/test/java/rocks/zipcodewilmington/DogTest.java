package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)` DONE
    // TODO - Create tests for `speak` DONE
    // TODO - Create tests for `setBirthDate(Date birthDate)` DONE
    // TODO - Create tests for `void eat(Food food)`DONE
    // TODO - Create tests for `Integer getId()` DONE
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`DONE
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`DONE

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Izzy";
        Date givenBirthDate = new Date();
        Integer givenId = 2213;

        // When (a dog is constructed)
        Dog Izzy = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = Izzy.getName();
        Date retrievedBirthDate = Izzy.getBirthDate();
        Integer retrievedId = Izzy.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        //Given
        String expectedSpeak = "bark!";

        //When dog is constructed
        Dog Izzy = new Dog(null, null, null);

        //When we call data in Dog class
        String actualSpeak = Izzy.speak();

        //Then we check if actual answer equals expected answer
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void birthDateTest() {
        //Given
        Dog Izzy = new Dog("Izzy", new Date(12345), 2213);

        //When
        Izzy.setBirthDate(new Date(12354));

        //Then
        Assert.assertEquals(new Date(12354), Izzy.getBirthDate());


    }
    @Test
    public void eatTest(){
        //Given
        Integer actualNumberofMeals = 1;
        Dog Izzy = new Dog("Izzy", new Date(12345), 2213);

        //When
        Food food = new Food();
        Izzy.eat(food);
        Integer izzyFood = Izzy.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(actualNumberofMeals, izzyFood);

    }

    @Test
    public void getIdTest(){
        //Given
        Integer expectedId = 2213;
        Dog Izzy = new Dog("Izzy", new Date(12345), expectedId);
        //When
        Integer actualId = Izzy.getId();
        //Then
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void instanceOfMammalTest(){
        //Given
        Boolean expectedAnswer = true;
        Boolean actualAnswer;
        Dog Izzy = new Dog("Izzy", new Date(12345), 2213);
        //When
        if(Izzy instanceof Mammal){
            actualAnswer = true;
        }else{
            actualAnswer = false;
        }
        //Then
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void instanceOfAnimalTest(){
        //Given
        Boolean expectedAnswer = true;
        Boolean actualAnswer;
        Dog Izzy = new Dog("Izzy", new Date(12345), 2213);
        //When
        if(Izzy instanceof Animal){
            actualAnswer = true;
        }else{
            actualAnswer = false;
        }
        //Then
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

}
