package com.example.slmcalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private  CalculatorController calculatorController = new CalculatorController();



    //Die Folgenden Tests sind Unit Tests 
    @Test
    public  void sumTest1(){
        int a = 6;
        int b = 11;

        int result = calculatorController.sum(a,b);

        assertEquals(17, result);
    }

    @Test
    public void sumTest2()
    {
        int a = 18;
        int b = -17;

        int result = calculatorController.sum(a,b);
        assertEquals(1, result);
    }

    @Test
    public void sumTest3()
    {
        int a = -10;
        int b = -10;

        int result = calculatorController.sum(a,b);
        assertEquals(-20, result);
    }




}