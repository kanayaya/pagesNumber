package com.kanayaya;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void testMain() {
        Assertions.assertEquals(17 , Main.getNumberOfPages(241));
    }

}
