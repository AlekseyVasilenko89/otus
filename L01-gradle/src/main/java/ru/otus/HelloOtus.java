package ru.otus;

import static com.google.common.base.MoreObjects.firstNonNull;

public class HelloOtus {

    public static String foo(String first, String second) {
        return firstNonNull(first, second);
    }
}
