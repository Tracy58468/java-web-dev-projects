package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    // TEST 0

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // TEST 1

    @Test
    public void onlyBracketsReturnsTrue() {
        String msg = "If there are empty brackets, the test passes.";

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), msg);
    }

    // TEST 2

    @Test
    public void emptyStringReturnsTrue() {
        String msg = "If there is an empty string, the test passes.";

        assertTrue(BalancedBrackets.hasBalancedBrackets(""), msg);
    }

    // TEST 3

    @Test
    public void bracketsAroundReturnsTrue() {
        String msg = "If there are brackets around the string, the test passes.";

        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"), msg);
    }

    // TEST 4 Launch[Code]

    @Test
    public void bracketsAroundSubstringReturnsTrue() {
        String msg = "If there are brackets around the string, the test passes.";
//        String expected = "Launch[Code]";
        boolean actual = BalancedBrackets.hasBalancedBrackets("Launch[Code]");

        assertTrue(actual, msg);
    }

    // TEST 5 []LaunchCode

    @Test
    public void bracketsBeforeStringReturnsTrue() {
        String msg = "If there are brackets before the string, the test passes.";
//        String expected = "[]LaunchCode";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]LaunchCode");

        assertTrue(actual, msg);
    }

    // TEST 6

    @Test
    public void bracketsAfterStringReturnsTrue() {
        String msg = "If there are brackets after the string, the test passes.";
//        String expected = "LaunchCode[]";
        boolean actual = BalancedBrackets.hasBalancedBrackets("LaunchCode[]");

        assertTrue(actual, msg);
    }

    // TEST 7  "[LaunchCode"

    @Test
    public void noClosingBracketFails() {
        String msg = "If there is no closing bracket, the test fails.";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[LaunchCode");
        assertFalse(actual, msg);
    }

    // TEST 8  "Launch]Code["

    @Test
    public void bracketsBackwardsFails() {
//        BalancedBrackets.hasBalancedBrackets("Launch]Code[");
        String msg = "If the brackets are backwards, the test fails.";
        boolean actual = BalancedBrackets.hasBalancedBrackets("Launch]Code[");
        assertFalse(actual, msg);
    }

    // TEST 9  "["

    @Test
    public void onlyOpeningBracketFails() {
        String msg = "If there is only an opening bracket, and no string, the test fails.";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[");
        assertFalse(actual, msg);
    }

    // TEST 10 "]["

    @Test
    public void bracketsBackwardsNoStringFails() {
//        BalancedBrackets.hasBalancedBrackets("Launch]Code[");
        String msg = "If the brackets are backwards and string is otherwise empty, the test fails.";
        boolean actual = BalancedBrackets.hasBalancedBrackets("][");
        assertFalse(actual, msg);
    }

    // TEST 11 brackets is > 1

    @Test
    public void twoOpeningBracketsFails() {
        String msg = "If there are two opening brackets found with no closing brackets, the test fails.";
//        String expected = "[[";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[[");
        assertFalse(actual, msg);

    }


    // TEST 12 brackets is < 0

    @Test
    public void twoClosingBracketsFails() {
        String msg = "If there are two closing brackets found with no opening brackets, the test fails.";
//        String expected = "[[";
        boolean actual = BalancedBrackets.hasBalancedBrackets("]]");
        assertFalse(actual, msg);

    }

}