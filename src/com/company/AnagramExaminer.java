package com.company;

import java.util.Arrays;

public class AnagramExaminer{

    public boolean isAnagram(String s1, String s2) {


        boolean status = true;

        if (s1.length() != s2.length())
             throw new IllegalArgumentException("Strings have different length they can’t be anagrams");
        else {
            char[] s1Array = s1.toLowerCase().trim().toCharArray();// Bringing the String type to an array of characters
            char[] s2Array = s2.toLowerCase().trim().toCharArray();// and to a common look.
            int j = 0;
            int i = 0;

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            while (j != s2Array.length & i != s1Array.length) {
                if (s2Array[j] == s1Array[i]) { // Finding array elements that are common to both arrays
                    i++;
                    j++;
                    continue;
                }

                if (s2Array[j] > s1Array[i]){
                    System.out.printf("[" + s1Array[i] + "]"); //Output lover literal
                    i++;
                    status = false;
                } else {
                    j++;
                    status = false;
                }
            }
            while (i != s1Array.length){
                System.out.printf("[" + s1Array[i++] + "]");// Output the remainder of the first array to the screen, if it was the end of the second
            }
            if (status)
                System.out.printf(s1 + " and " + s2 + " are anagrams");
        }
        return status;
    }
}
