package org.example;

import org.openqa.selenium.StaleElementReferenceException;

public class ThreadSleep {
    public static void main(String[] args) throws StaleElementReferenceException, InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);

    }

}

