package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

//    @Test
//    public void emptyTest() {
//        assertEquals(10,10,.001);
//    }

    //TODO: constructor sets gasTankLevel properly

    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

//    @Test
//    public void testInitialGasTankLevel() {
//        assertEquals(10, test_car.getGasTankLevel(), .001);
//    }

//    @Test
//    public void testInitialGasTankLevel() {
//        assertFalse(0, test_car.getGasTankLevel(), .001);
//    }
//
//    private void assertFalse(int i, double gasTankLevel, double v) {
//    }

    @Test
    public void testInitialGasTankLevel() {
        assertTrue(10, test_car.getGasTankLevel(), .001);
    }

    private void assertTrue(int i, double gasTankLevel, double v) {
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}