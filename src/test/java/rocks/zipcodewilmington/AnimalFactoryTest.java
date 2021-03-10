package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //Given
        String givenName = "Fido";
        Date birthDate = new Date();

        //When
        Dog newDog = AnimalFactory.createDog(givenName, birthDate);

        //Then
        Assert.assertEquals("Fido", newDog.getName());
        Assert.assertEquals(birthDate, newDog.getBirthDate());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        //Given
        String givenName = "Leon";
        Date birthDate = new Date();

        //When
        Cat newCat = AnimalFactory.createCat(givenName, birthDate);

        //Then
        Assert.assertEquals("Leon", newCat.getName());
        Assert.assertEquals(birthDate, newCat.getBirthDate());
    }
}
