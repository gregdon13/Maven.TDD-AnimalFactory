package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    private String givenName = "";
    private Date givenBirthdate = new Date();
    private Integer givenId = 0;
    private ArrayList<Food> eatenMeals;
    private Food kibbles;
    private Cat testCat = new Cat (givenName, givenBirthdate, givenId);

    @Before
    public void init() {
        testCat.eat(kibbles);
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // Given
        String newName = "Leon";



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
        Date newBirthDate = givenBirthdate;

        //When
        Cat someCat = new Cat(givenName, givenBirthdate, givenId);
        someCat.setBirthDate(newBirthDate);

        //Then
        Assert.assertEquals(givenBirthdate, someCat.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatFoodTest() {
        //Given
        Food kibbles = new Food();

        //When
        Cat someCat = new Cat(givenName, givenBirthdate, givenId);
        someCat.eat(kibbles);

        //Then
        System.out.println(eatenMeals);
        Assert.assertEquals(true, eatenMeals.contains(kibbles));
    }
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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
