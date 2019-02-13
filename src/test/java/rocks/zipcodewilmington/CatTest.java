package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`  DONE
    // TODO - Create tests for `speak` DONE
    // TODO - Create tests for `setBirthDate(Date birthDate)` DONE
    // TODO - Create tests for `void eat(Food food)` DONE
    // TODO - Create tests for `Integer getId()` DONE
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`DONE
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`DONE


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
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        //Given
        Date birthDate = new Date();
        //When
        Cat Salem = new Cat("Chloe",birthDate ,1235);

        //When
        Salem.setName("Salem");

        //Then
        Assert.assertEquals("Salem", Salem.getName());

        System.out.println(Salem.getName());

    }

    @Test
    public void speakTest(){
        //Given
        Date birthDate = new Date();
        //When
        Cat Salem = new Cat("Salem",birthDate ,1235);

        //Then
        Assert.assertEquals("meow!", Salem.speak());

    }

    @Test
    public void setBirthdate(){

        //Given
        Cat Salem = new Cat("Salem",new Date(123456) ,1235);

        //When
        Salem.setBirthDate(new Date(123476));

        //Then
        Assert.assertEquals(new Date(123476), Salem.getBirthDate());

    }

    @Test
    public void eatTest(){
        //Given
        Cat Salem = new Cat("Salem",new Date(123456) ,1235);
        Integer actualMeals = 1;

        //When
        Food food = new Food();
        Salem.eat(food);
        Integer salemMeals = Salem.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(actualMeals, salemMeals);



    }

    @Test
    public void getIdTest(){
        //Given
        String name = "Salem";
        Date birthDate = new Date();
        Integer actualId = 1235;
        Cat Salem = new Cat(name, birthDate, actualId);

        //When
        Integer catID = Salem.getId();

        //Then
        Assert.assertEquals(actualId, catID);

    }

    @Test
    public void instanceOfMammal(){
        //Given
        Boolean expectedAns = true;
        Cat Salem = new Cat("Salem",new Date(123456) ,1235);
        Boolean actualAns = false;

        //When
        if(Salem instanceof Mammal){
            actualAns = true;
        }
        //Then
        Assert.assertEquals(expectedAns, actualAns);

    }

    @Test
    public void instanceOfAnimal(){
        //Given
        Boolean expectedAns = true;
        Cat Salem = new Cat("Salem",new Date(123456) ,1235);
        Boolean actualAns = false;

        //When
        if(Salem instanceof Animal){
            actualAns = true;
        }
        //Then
        Assert.assertEquals(expectedAns, actualAns);

    }


}


