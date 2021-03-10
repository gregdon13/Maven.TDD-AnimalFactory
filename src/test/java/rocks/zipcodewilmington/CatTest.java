package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 0;


        //When
        Cat someCat = new Cat(newName, givenBirthdate, givenId);
        someCat.setName(newName);

        //Then
        Assert.assertEquals(newName, someCat.getName());
    }
    // TODO - Create tests for `speak`
    @Test
    public void catSpeak() {
        //Given
        String givenName = "";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Cat talkingCat = new Cat(givenName, givenBirthdate, givenId);


        //When
        String getRealSpeak = talkingCat.speak();

        //Then
        Assert.assertEquals(getRealSpeak, "meow!");

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
    //Given
        String givenName = "";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        //When
        Cat someCat = new Cat(givenName, givenBirthdate, givenId);
        someCat.setBirthDate(givenBirthdate);

        //Then
        Assert.assertEquals(givenBirthdate, someCat.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatFoodTest() {
        //Given
        String givenName = "";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Food kibbles = new Food();

        //When
        Cat someCat = new Cat(givenName, givenBirthdate, givenId);
        someCat.eat(kibbles);

        //Then

        Assert.assertEquals((long)someCat.getNumberOfMealsEaten(), 1l);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        //Given
        String givenName = "";
        Date givenBirthdate = new Date();
        Integer givenId = 15;
        Cat talkingCat = new Cat(givenName, givenBirthdate, givenId);

        //When
        Integer actualId = talkingCat.getId();

        //Then
        Assert.assertEquals(actualId, givenId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInherit() {
        //Given
        String givenName = "";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Cat anyMam = new Cat(givenName, givenBirthdate, givenId);

        Assert.assertTrue(anyMam instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInherit() {
        //Given
        String givenName = "";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Cat talkingCat = new Cat(givenName, givenBirthdate, givenId);

        Assert.assertTrue(talkingCat instanceof Mammal);
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
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
