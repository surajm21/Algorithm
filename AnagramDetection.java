package com.bridglabz;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean equal(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
        return true;
    }
    public static void main(String args[]) {
        String s1 = "abcd";
        String s2 = "dcba";
        if (equal(s1.toCharArray(), s2.toCharArray()))
            System.out.println("\n"+"The two strings are equal of each other");
        else
            System.out.println("\n" +"The two strings are not equal of each other");
    }
}
