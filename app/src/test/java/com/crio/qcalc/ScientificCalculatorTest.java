package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import com.crio.qcalc.ScientificCalculator;

public class ScientificCalculatorTest {

    private ScientificCalculator scientificCalculator;

    @BeforeEach
    void setup(){
        scientificCalculator = new ScientificCalculator();
    }

    @Test
    @DisplayName("Test square of double")
    public void testSquareOf() {
        Assertions.assertEquals(25.0, scientificCalculator.squareOf(5.0));
        Assertions.assertEquals(0.25, scientificCalculator.squareOf(0.5));
    }

    @Test
    @DisplayName("Test cube of double")
    public void testCubeOf() {
        Assertions.assertEquals(27.0, scientificCalculator.cubeOf(3.0));
        Assertions.assertEquals(0.125, scientificCalculator.cubeOf(0.5));
    }

    @Test
    @DisplayName("Test power of double")
    public void testPowerOf() {
        Assertions.assertEquals(8.0, scientificCalculator.powerOf(2.0, 3.0));
        Assertions.assertEquals(0.125, scientificCalculator.powerOf(0.5, 3.0));
    }

    @Test
    @DisplayName("Test square root of double")
    public void testSquareRoot() {
        Assertions.assertEquals(5.0, scientificCalculator.squareRoot(25.0));
        Assertions.assertEquals(2.0, scientificCalculator.squareRoot(4.0));
    }

    @Test
    @DisplayName("Test modulo of integer")
    public void testModuloInt() {
        Assertions.assertEquals(1, scientificCalculator.modulo(5, 2));
        Assertions.assertEquals(0, scientificCalculator.modulo(10, 2));
    }

    @Test
    @DisplayName("Test modulo of integer with return type double")
    public void testModuloDouble() {
        Assertions.assertEquals(1, scientificCalculator.modulo_double(5.0, 2.0));
        Assertions.assertEquals(0, scientificCalculator.modulo_double(10.0, 2.0));
    }
}

