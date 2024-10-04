package ru.netology.javaqa.mvn2qa96.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class HolidayServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/mouth.csv")


    public void RestMouthTest(int expected, int expenses, int threshold, int income) {

        HolidayService service = new HolidayService();

        int actual = service.calculate(expenses, threshold, income);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void RestMouthTest2() {
//
//        HolidayService service = new HolidayService();
//        int expected = 3;
//
//        int actual = service.calculate(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//    }

}









