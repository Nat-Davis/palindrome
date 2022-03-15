package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_True_EmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AMA", "racecar", "x"})
    void isPalindrome_True(String str) {
        assertTrue(PalindromeChecker.isPalindrome(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "abc", "spatula"})
    void isPalindrome_False(String str) {
        assertFalse(PalindromeChecker.isPalindrome(str));
    }


}
