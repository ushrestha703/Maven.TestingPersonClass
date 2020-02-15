package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int id;
    private String hairColor;
    private String eyeColor;


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age, int id, String hairColor) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.hairColor = hairColor;
    }

    public Person(String name, int age, int id, String hairColor, String eyeColor) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }

    public Integer getId() {

        return id;
    }

    public String getHairColor() {

        return hairColor;
    }

    public String getEyeColor() {

        return eyeColor;
    }



}
