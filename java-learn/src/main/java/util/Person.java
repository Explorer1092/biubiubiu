package util;

import java.util.logging.Logger;

/**
 * Created by Shen on 2017/6/28.
 */
public class Person {
    Logger l = Logger.getLogger(Person.class.getName());
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeClolor;
    private String gender;

    public Person() {

    }

    Person(String name, int age, int height, int weight, String eyeClolor, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeClolor = eyeClolor;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    String getEyeClolor() {
        return eyeClolor;
    }

    public void setEyeClolor(String eyeClolor) {
        this.eyeClolor = eyeClolor;
    }

    String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
