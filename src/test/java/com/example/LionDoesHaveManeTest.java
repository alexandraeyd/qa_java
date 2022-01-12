package com.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    private final String sex;
    private final boolean expected;


    public LionDoesHaveManeTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeWithGender() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }



}
