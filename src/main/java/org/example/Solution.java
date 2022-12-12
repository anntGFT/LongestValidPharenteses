package org.example;

import java.util.LinkedList;

public class Solution {
    public Solution(){

    }

    public int longestValidParentheses(String s) {

        int largest = 0;
        int counter = 0;
        int openBrackets = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {

                openBrackets += 1;
                counter += 1;
            } else if (openBrackets != 0) {

                openBrackets -= 1;
                counter += 1;
            } else{

                counter = 0;
            }

            if (openBrackets == 0 && counter > largest){

                largest = counter;
            }
        }

        counter = 0;
        openBrackets = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {

                openBrackets += 1;
                counter += 1;
            } else if (openBrackets != 0) {

                openBrackets -= 1;
                counter += 1;
            } else{

                counter = 0;
            }

            if (openBrackets == 0 && counter > largest) {

                largest = counter;
            }
        }

        return largest;
    }
}