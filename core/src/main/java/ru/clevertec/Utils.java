package ru.clevertec;

import java.util.stream.Stream;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        return Stream.of(str).allMatch(StringUtils::isPositiveNumber);
    }
}
