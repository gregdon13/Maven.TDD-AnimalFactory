package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;
        Dog ranDog = new Dog(newName, givenBirthdate, givenId);

        //When
        DogHouse.add(ranDog);

        //Then
        Assert.assertEquals(1, (long)DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogIdTest() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;
        Dog ranDog = new Dog(newName, givenBirthdate, givenId);

        //When
        DogHouse.add(ranDog);
        DogHouse.remove(12);

        //Then
        Assert.assertEquals(0, (long)DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;
        Dog ranDog = new Dog(newName, givenBirthdate, givenId);

        //When
        DogHouse.add(ranDog);
        DogHouse.remove(ranDog);

        //Then
        Assert.assertEquals(0, (long)DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetById() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;

        //When
        Dog ranDog = new Dog(newName, givenBirthdate, givenId);
        DogHouse.add(ranDog);

        //Then
        Assert.assertEquals(ranDog, DogHouse.getDogById(12));
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void numOfDogs() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;

        //When
        Dog ranDog = new Dog(newName, givenBirthdate, givenId);
        DogHouse.add(ranDog);

        //Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
