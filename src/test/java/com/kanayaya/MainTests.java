package com.kanayaya;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

public class MainTests {
    private static final Random random = new Random();
    @RepeatedTest(10)
    public void testProper() {
        int pages = random.nextInt(5, 200);
        Assertions.assertEquals(pages, Main.getNumberOfPages( digitsByPages(pages).length() ));
    }
    @RepeatedTest(10)
    public void testException() {
        int pages = random.nextInt(105, 200);
        int unexpectedDigits = digitsByPages(pages).length() - random.nextInt(1,2);
        Assertions.assertThrows(IllegalArgumentException.class , () -> Main.getNumberOfPages(unexpectedDigits));
    }
    private String digitsByPages(int pages) {
        StringBuilder stringBuilder = new StringBuilder();
        for (; pages > 0; pages --) {
            stringBuilder.append(pages);
        }
        return stringBuilder.toString();
    }
}
