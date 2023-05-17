package com.example.aaroe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        int expected = 2;
        int actual = Calc.add(1,1);
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        int expected = 3;
        int actual = Calc.subtract(5,2);
        assertEquals(expected,actual);
    }

    @Test
    void divide() {
        int expected = 3;
        double actual = Calc.divide(6,2);
        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
        int expected = 10;
        int actual = Calc.multiply(5,2);
        assertEquals(expected,actual);
    }

    @Test
    void sqrt() {
        int expected = 12;
        int actual = (int) Calc.sqrt(144);
        assertEquals(expected,actual);
    }

    @Test
    void exp() {
        int expected = 9;
        int actual = Calc.exp(3,2);
        assertEquals(expected,actual);
    }
}