package org.example;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReference {

    public static void main(String[] args) {

        // 정적 메서드 참조
        Function<Integer, String> asLamda = i -> Integer.toHexString(i);

        Function<Integer, String> asRef = Integer::toHexString;

        var now = LocalDate.now();

        // 기존 객체를 기반으로 한 람다
        Predicate<LocalDate> isAfterNowAsLamda = $ -> $.isAfter(now);

        // 바운드 미정적 메서드 참조
        Predicate<LocalDate> idAfterNowAsRef = now::isAfter;

        // 반환값 바인딩
        Predicate<LocalDate> isAfterNowAsRefBind = LocalDate.now()::isAfter;

        // 정적 필드 바인딩
        Function<Object, String> castToStr = String.class::cast;

    }

}
