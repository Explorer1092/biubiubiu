package util;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by Shen on 2017/6/28.
 */

public class PersonTest {
    @Test
    public void getName() throws Exception {
    }

    @Test
    public void setName() throws Exception {
    }

    @Test
    public void getAge() throws Exception {
    }

    @Test
    public void setAge() throws Exception {
    }

    @Test
    public void getHeight() throws Exception {
    }

    @Test
    public void setHeight() throws Exception {
    }

    @Test
    public void getWeight() throws Exception {
    }

    @Test
    public void setWeight() throws Exception {
    }

    @Test
    public void getEyeClolor() throws Exception {
    }

    @Test
    public void setEyeClolor() throws Exception {
    }

    @Test
    public void getGender() throws Exception {
    }

    @Test
    public void setGender() throws Exception {
    }

    @Test
    public void PersonTest() {

        Person t = new Person("zhangsan", 27, 176, 80, "Brown", "MALE");
        Logger l = Logger.getLogger(Person.class.getName());
        l.info("name:" + t.getName());
        l.info("age" + t.getAge());
        l.info("height" + t.getHeight());
        l.info("weight" + t.getWeight());
        l.info("eyeClolor" + t.getEyeClolor());
        l.info("gender" + t.getGender());
        assertEquals("zhangsan", t.getName());
        assertEquals(27, t.getAge());
        assertEquals(176, t.getHeight());
        assertEquals(80, t.getWeight());
        assertEquals("Brown", t.getEyeClolor());
        assertEquals("MALE", t.getGender());


    }


}