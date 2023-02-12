package ru.clevertec;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {
    @Test
    void isAllPositiveNumbersWithPositiveNumberReturnsTrue() {
        assertTrue(Utils.isAllPositiveNumbers("9", "11"), "isAllPositiveNumbers should return 'true'");
    }
    @Test
    void isAllPositiveNumbersWithPositiveAndZeroNumberReturnsFalse() {
        assertFalse(Utils.isAllPositiveNumbers("9", "0"), "isAllPositiveNumbers should return 'false'");
    }
}