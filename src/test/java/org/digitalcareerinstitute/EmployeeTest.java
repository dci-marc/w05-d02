package org.digitalcareerinstitute;

import org.junit.jupiter.api.*;

class EmployeeTest {

    @Test
    void calculateBonusVersion1() {
        // Sales rep
        double bonus = Employee.calculateBonus(10001.0);
        Assertions.assertEquals(bonus, 1000.1);
    }

    @Test
    void testCalculateBonusVersion2() {
        // Engineer bonus
        double bonus = Employee.calculateBonus(100);
        Assertions.assertEquals(bonus, 2000);
    }

    @Test
    void testCalculateBonus1Version3() {
        // Part time workers
        double bonus = Employee.calculateBonus(10, 1);
        Assertions.assertEquals(bonus, 0);

        bonus = Employee.calculateBonus(700, 1);
        Assertions.assertEquals(bonus, 140);


        bonus = Employee.calculateBonus(100, 2);
        Assertions.assertEquals(bonus, 20);

        bonus = Employee.calculateBonus(300, 2);
        Assertions.assertEquals(bonus, 60);
    }
}