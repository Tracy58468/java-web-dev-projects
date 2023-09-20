package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    // Arrange
    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
//    @Test
//    public void emptyTest() {
//        assertEquals(10, 10, .001);
//    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {

        // Arrange
        String msg = "Test 1:  Initial gas tank level is correct.";
        double expected = 10;
        double actual = test_car.getGasTankLevel();
        System.out.println("Test 1 actual " + actual);

        // Act not needed

        // Assert
        assertEquals(expected, actual,.001, msg);
    }

    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void testGasTankAfterDriving() {

        // Arrange
        String msg = "Test 2:  Gas tank level has changed after driving.";

        // Act
        test_car.drive(50);

        // Assert
        assertEquals(9, test_car.getGasTankLevel(), .001, msg);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankAfterExceedingTankRange() {

        // Arrange
        String msg = "Test 3:  Gas tank is empty after driving too far.";

        // Act
        test_car.drive(5000);

        // Assert
        assertEquals(test_car.getGasTankLevel(),0,  .001, msg);
    }

    //TODO: can't have more gas than tank size, expect an exception

    @Test
    public void testGasOverfillException() {

        // Arrange
        String msg = "Test 4:  Tank cannot be overfilled.";

        // Act
//        void addGasTest = test_car.addGas(100) ;

        //Assert
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(100), msg);
    }
}