package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnagramExaminer a = new AnagramExaminer();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        a.isAnagram(s1, s2);
    }
}
