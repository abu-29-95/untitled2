package org.example.Lesson4;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;



public class TriangleTest {
    Triangle triangle = new Triangle();

    @ParameterizedTest
    @CsvSource({"5, 3, 4","3, 6 , 7","4, 7, 2"})
    void correctAreaCalculationTest(int a, int b, int c){
        assertEquals(6,triangle.areaOfATriangle(a,b,c), "false");

    }

    @ParameterizedTest
    @CsvSource({"5, 3, 0"})
    void testTriangleSideISZero(int a, int b, int c){
        Assertions.assertThrows(SomeSideIsZeroException.class, ()-> getSideIsZeroException(a,b,c), "Нет исключения");
    }

    @ParameterizedTest
    @CsvSource({"-2, 3, 8"})
    void testTriangleSideIsNegative(int a, int b, int c){
        Assertions.assertThrows(SomeSideIsNegativeException.class, ()-> getSideIsNegativeException(a,b,c), "Нет исключения");
    }

    @ParameterizedTest
    @CsvSource({"2, 100, 8"})
    void testTriangleSideIsHundred(int a, int b, int c){
        Assertions.assertThrows(SomeSideIsHundredException.class, ()-> getSideIsHundredException(a,b,c), "Нет исключения");
    }


    private String getSideIsZeroException(int a, int b, int c) throws SomeSideIsZeroException {
        if (a ==0 |  b ==0 |  c == 0) throw new SomeSideIsZeroException();
        return "result";
    }

    private String getSideIsNegativeException (int a, int b, int c) throws SomeSideIsNegativeException {
        if (a < 0 |  b < 0 |  c < 0) throw new SomeSideIsNegativeException();
        return "result";
    }

    private String getSideIsHundredException(int a, int b, int c) throws SomeSideIsHundredException {
        if (a ==100 |  b ==100 |  c ==100) throw new SomeSideIsHundredException();
        return "result";
    }

}

