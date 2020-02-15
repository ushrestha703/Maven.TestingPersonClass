package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        //Integer expectedId = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        //Integer actualId = person.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        //Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithId() {
        // Given
        Integer expected = 0;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getId();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameAndAgeAndId() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Integer expectedId = 1234;

        // When
        Person person = new Person(expectedName, expectedAge, expectedId);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualId = person.getId();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testConstructorWithNameAndAgeAndIdAndHairColor() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Integer expectedId = 1234;
        String expectedHairColor = "Black";

        // When
        Person person = new Person(expectedName, expectedAge, expectedId, expectedHairColor);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualId = person.getId();
        String actualHairColor = person.getHairColor();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testConstructorWithNameAndAgeAndIdAndHairColorAndEyeColor() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Integer expectedId = 1234;
        String expectedHairColor = "Black";
        String expectedEyeColor = " Blue";

        // When
        Person person = new Person(expectedName, expectedAge, expectedId, expectedHairColor, expectedEyeColor);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualId = person.getId();
        String actualHairColor = person.getHairColor();
        String actualEyeColor = person.getEyeColor();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetId() {
        // Given
        Person person = new Person();
        Integer expected = 1234;

        // When
        person.setId(expected);

        // Then
        Integer actual = person.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor() {
        // Given
        Person person = new Person();
        String expected = "Black";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }


}
