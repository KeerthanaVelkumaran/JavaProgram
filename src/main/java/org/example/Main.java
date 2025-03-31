package org.example;

import programPractice.FibanocciSeries;
import programPractice.Palindrome;
import programPractice.ReverseString;

public class Main {
    public static void main(String[] args) {
        FibanocciSeries fb = new FibanocciSeries();
        fb.fibannocciNumbers();
        ReverseString rev = new ReverseString();
        String originalStr = "Am Keerthana Velkumaran";
        String reverseStr = rev.reverseString(originalStr);
        System.out.println(reverseStr+ "and length of reverse String is---"+reverseStr.length());
        System.out.println("The length of original String ---"+ originalStr.length());
        Palindrome pl = new Palindrome();
        pl.palindrome("Madamji");
    }
}