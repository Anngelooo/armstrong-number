package dev.angelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AmrstrongCheckerTest {

    @Test
    public void testPositiveCase371() {
        AmrstrongChecker checker = new AmrstrongChecker();
        assertTrue(checker.isArmstrong(371), "371 should be an Armstrong number");
    }

    @Test
    public void testPositiveCase1634() {
        AmrstrongChecker checker = new AmrstrongChecker();
        assertTrue(checker.isArmstrong(1634), "1634 should be an Armstrong number");
    }

    @Test
    public void testNegativeCase351() {
        AmrstrongChecker checker = new AmrstrongChecker();
        assertFalse(checker.isArmstrong(351), "351 should not be an Armstrong number");
    }

    @Test
    public void testNegativeCase2015() {
        AmrstrongChecker checker = new AmrstrongChecker();
        assertFalse(checker.isArmstrong(2015), "2015 should not be an Armstrong number");
    }
}
