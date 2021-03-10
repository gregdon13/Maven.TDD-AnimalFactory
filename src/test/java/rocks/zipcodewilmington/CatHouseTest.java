package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;
        Cat ranCat = new Cat(newName, givenBirthdate, givenId);

        //When
        CatHouse.add(ranCat);

        //Then
        Assert.assertEquals((long)CatHouse.getNumberOfCats(), 1l);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemove() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;
        Cat ranCat = new Cat(newName, givenBirthdate, givenId);

        //When
        CatHouse.add(ranCat);
        CatHouse.remove(12);

        //Then
        Assert.assertEquals((long)CatHouse.getNumberOfCats(), 0);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByCat() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;
        Cat ranCat = new Cat(newName, givenBirthdate, givenId);

        //When
        CatHouse.add(ranCat);
        CatHouse.remove(ranCat);

        //Then
        Assert.assertEquals((long)CatHouse.getNumberOfCats(), 0);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetById() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;

        //When
        Cat ranCat = new Cat(newName, givenBirthdate, givenId);
        CatHouse.add(ranCat);

        //Then
        Assert.assertEquals(ranCat, CatHouse.getCatById(12));
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void numOfCats() {
        //Given
        String newName = "Leon";
        Date givenBirthdate = new Date();
        Integer givenId = 12;

        //When
        Cat ranCat = new Cat(newName, givenBirthdate, givenId);
        CatHouse.add(ranCat);

        //Then
        Assert.assertEquals(1l, (long)CatHouse.getNumberOfCats());
    }
}
