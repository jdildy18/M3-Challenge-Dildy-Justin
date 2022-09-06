package com.company;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }


    /**
     * Divide
     */
    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6, 2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6, -2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6, -2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0, 0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

    /**
     * Multiply
     */

    @Test
    public void shouldMultiplyPositives() {
        assertEquals(72, calc.multiply(9, 8));
        assertEquals(49, calc.multiply(7, 7));
    }

    @Test
    public void shouldMultiplyyNegatives() {
        assertEquals(7, calc.multiply(-7, -1));
        assertEquals(42, calc.multiply(-7, -6));

    }

    @Test
    public void shouldMultiplyByPosAndNeg() {
        assertEquals(-18, calc.multiply(-9,2));
        assertEquals(-56, calc.multiply(7, -8));

    }

    @Test
    public void shouldMultiplyByZero() {
        assertEquals(0, calc.multiply(83,0));
        assertEquals(0, calc.multiply(0,43));
    }

    /**
     * Addition
     */
    @Test
    public void shouldAddPositives() {
        assertEquals(19, calc.addition(17,2));
        assertEquals(28, calc.addition(21,7));
    }

    @Test
    public void shouldAddNegatives() {
        assertEquals(-27 , calc.addition(-23,-4));
        assertEquals(-67, calc.addition(-50,-17));

    }

    @Test
    public void shouldAddByPosAndNeg() {
        assertEquals(-25,calc.addition(-35,10));
        assertEquals(-54, calc.addition(-60,6));

    }

    @Test
    public void shouldAddByZero() {
        assertEquals(43, calc.addition(43,0));
        assertEquals(83, calc.addition(83, 0));
    }

    /**
     * Subtraction
     */

    @Test
    public void shouldSubtractPositives() {
        assertEquals(-5, calc.subtraction(15,20));
        assertEquals(75, calc.subtraction(100,25));
    }

    @Test
    public void shouldSubtractNegatives() {
        assertEquals(-44 , calc.subtraction(-4,-40));
        assertEquals(-68, calc.subtraction(-59,-9));

    }

    @Test
    public void shouldSubtractByPosAndNeg() {
        assertEquals(4,calc.subtraction(-16,20));
        assertEquals(-20, calc.subtraction(-60,40));

    }

    @Test
    public void shouldSubtractByZero() {
        assertEquals(194, calc.addition(194,0));
        assertEquals(-32, calc.addition(0, 32));
    }


}
