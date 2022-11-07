package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzMainTest {

    @Test
    void fizzTest() {
        //GIVEN
        int number = 9;
        String expected = "fizz";
        //WHEN
        String actual = FizzBuzzMain.fizzBuzz(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void buzzTest(){
        //GIVEN
        int number = 10;
        String expected = "buzz";
        //WHEN
        String actual = FizzBuzzMain.fizzBuzz(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTest(){
        //GIVEN
        int number = 15;
        String expected = "fizzbuzz";
        //WHEN
        String actual = FizzBuzzMain.fizzBuzz(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTestReturnNumber(){
        //GIVEN
        int number = 13;
        String expected = String.valueOf(number);
        //WHEN
        String actual = FizzBuzzMain.fizzBuzz(number);
        //THEN
        assertEquals(expected, actual);
    }
}