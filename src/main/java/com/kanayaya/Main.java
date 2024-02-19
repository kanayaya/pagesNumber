package com.kanayaya;

public class Main {
    public static void main(String[] args) {
        System.out.println("It's 'getNumberOfPages' function demonstration. Watch for tests. Launch tests. Enjoy");
    }

    public static int getNumberOfPages(int summary) {
        int initialSummary = summary;
        int pages = 0;
        int i = 1;
        for (; summary > getMaxDigitsForPower(i); i++) {
            summary -= getMaxDigitsForPower(i);
            pages += (int) Math.pow(10, i) - (int) Math.pow(10, i - 1);
        }
        int mod = summary % i;
        if (mod > 0)
            throw new IllegalArgumentException(
                    "impossible number of digits: " + initialSummary +
                    ", maybe you meant " + (initialSummary - mod) + " or " + (initialSummary + i - mod) + '?'
            );
        return pages + summary/i;
    }

    private static int getMaxDigitsForPower(int power) {
        return ( (int)Math.pow(10, power) - (int)Math.pow(10, power-1) ) * power;
    }
}