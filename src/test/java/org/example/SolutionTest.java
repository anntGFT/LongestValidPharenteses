package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    String s;
    int result;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void emptyString(){

        result = 0;
        s = "";

        assertEquals(result, solution.longestValidParentheses(s));
    }

    @Test
    public void oneValidParentheses(){

        result = 2;
        s = "()";

        assertEquals(result, solution.longestValidParentheses(s));
    }

    @Test
    public void oneValidParenthesesWithMoreThan2Parentheses(){

        result = 2;
        s = ")()))";

        assertEquals(result, solution.longestValidParentheses(s));
    }

    @Test
    public void multipleValidParentheses(){

        result = 4;
        s = ")()())";

        assertEquals(result, solution.longestValidParentheses(s));
    }
}
