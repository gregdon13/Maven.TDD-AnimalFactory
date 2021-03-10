package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest() {
        //Given
        String givenName = "Fido";
        Date givenBirth = new Date();
        Integer givenId = 12;

        //When
        Dog dobObj = new Dog(givenName, givenBirth, givenId);

        //Then
        Assert.assertEquals("Fido", dobObj.getName());
        Assert.assertEquals(givenBirth, dobObj.getBirthDate());
        Assert.assertEquals(12, (long) dobObj.getId());
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //Given
        String givenName = "Fido";
        Date givenBirth = new Date();
        Integer givenId = 12;

        //When
        Dog dobObj = new Dog(givenName, givenBirth, givenId);

        //Then
        Assert.assertEquals("bark!", dobObj.speak());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthdayTest() {
        //Given
        String givenName = "Fido";
        Date givenBirth = new Date();
        Integer givenId = 12;

        //When
        Dog dobObj = new Dog(givenName, givenBirth, givenId);
        dobObj.setBirthDate(givenBirth);

        //Then
        Assert.assertEquals(givenBirth, dobObj.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest() {
        //Given
        String givenName = "Fido";
        Date givenBirthdate = new Date();
        Integer givenId = 12;
        Food kibbles = new Food();

        //When
        Dog dobObj = new Dog(givenName, givenBirthdate, givenId);
        dobObj.eat(kibbles);

        //Then

        Assert.assertEquals((long)dobObj.getNumberOfMealsEaten(), 1l);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        //Given
        String givenName = "Fido";
        Date givenBirth = new Date();
        Integer givenId = 12;

        //When
        Dog dobObj = new Dog(givenName, givenBirth, givenId);

        //Then
        Assert.assertEquals(12, (long)dobObj.getId());
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimal() {
        //Given
        String givenName = "Fido";
        Date givenBirth = new Date();
        Integer givenId = 12;

        //When
        Dog dobObj = new Dog(givenName, givenBirth, givenId);

        Assert.assertTrue(dobObj instanceof Animal);
    }
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test
        public void checkMammal() {
            //Given
            String givenName = "Fido";
            Date givenBirth = new Date();
            Integer givenId = 12;

            //When
            Dog dobObj = new Dog(givenName, givenBirth, givenId);

            Assert.assertTrue(dobObj instanceof Mammal);
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
        Assert.assertEquals(dogName, givenName);
    }
}
