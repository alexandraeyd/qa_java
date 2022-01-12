package com.example;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void getKittensReturns1WithoutParameter() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        int kittensCount = 2;
        int actual = feline.getKittens(kittensCount);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatReturnsMeatForPredator() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }


}


