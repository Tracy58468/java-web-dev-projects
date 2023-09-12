package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]" TEST 3, "Launch[Code]" TEST 4, "[]LaunchCode" TEST 5, "", TEST 2 "[]" (TEST 1) TEST 6 brackets after
     *
     * While these do not:
     *   "[LaunchCode" TEST 7, "Launch]Code[" TEST 8, "[" TEST 9, "][" TEST 10
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ']') {
                brackets--;
//                System.out.println("after closing brackets: " + brackets);
                break;
            } else if (ch == '[') {
                brackets++;
//                System.out.println("after opening brackets: " + brackets);
            }
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
        }
        return brackets == 0;
    }
}