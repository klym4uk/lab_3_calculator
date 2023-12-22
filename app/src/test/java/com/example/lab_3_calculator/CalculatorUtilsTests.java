package com.example.lab_3_calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorUtilsTests {
    @Test
    public void validInputTestingAdditionExpression(){
        final String inputRow = "10+5";
        final String expectedOutput = "15";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void validInputTestingSubtractionExpression(){
        final String inputRow = "10-5";
        final String expectedOutput = "5";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void validInputTestingDivisionExpression(){
        final String inputRow = "10/5";
        final String expectedOutput = "2";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void validInputTestingMultiplicationExpression(){
        final String inputRow = "10*5";
        final String expectedOutput = "50";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void NaNInputTestingAdditionExpression(){
        final String inputRow = "10+NaN";
        final String expectedOutput = "NaN";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void NaNInputTestingSubtractionExpression(){
        final String inputRow = "10-NaN";
        final String expectedOutput = "NaN";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void NaNInputTestingDivisionExpression(){
        final String inputRow = "10/NaN";
        final String expectedOutput = "NaN";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void NaNInputTestingMultiplicationExpression(){
        final String inputRow = "10*NaN";
        final String expectedOutput = "NaN";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void InfinityInputTestingAdditionExpression(){
        final String inputRow = "10+Infinity";
        final String expectedOutput = "Infinity";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void InfinityInputTestingSubtractionExpression(){
        final String inputRow = "10-Infinity";
        final String expectedOutput = "-Infinity";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void Infinity2InputTestingSubtractionExpression(){
        final String inputRow = "Infinity-10";
        final String expectedOutput = "Infinity";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void InfinityInputTestingDivisionExpression(){
        final String inputRow = "10/Infinity";
        final String expectedOutput = "0";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void Infinity2InputTestingDivisionExpression(){
        final String inputRow = "Infinity/10";
        final String expectedOutput = "Infinity";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void InfinityInputTestingMultiplicationExpression(){
        final String inputRow = "Infinity*10";
        final String expectedOutput = "Infinity";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void zeroInputTestingAdditionExpression(){
        final String inputRow = "10+0";
        final String expectedOutput = "10";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void zeroInputTestingSubtractionExpression(){
        final String inputRow = "10-0";
        final String expectedOutput = "10";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void zeroInputTestingDivisionExpression(){
        final String inputRow = "0/10";
        final String expectedOutput = "0";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void zero2InputTestingDivisionExpression(){
        final String inputRow = "10/0";
        final String expectedOutput = "Infinity";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void zeroInputTestingMultiplicationExpression(){
        final String inputRow = "10*0";
        final String expectedOutput = "0";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void additionalSpacesInputTestingMultiplicationExpression(){
        final String inputRow = "10*      1    *    2";
        final String expectedOutput = "20";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void invalidInputTestingMultiplicationExpression(){
        final String inputRow = "*22+=/3/0*NaN";
        final String expectedOutput = "Err";
        final String actualOutput = CalculatorUtilsUsingLibraries.getResult(inputRow);

        assertEquals(expectedOutput, actualOutput);
    }
}