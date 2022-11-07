package smallerthanzero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallerThanZeroTest {

    @Test
    void smallerThanZero() {
        //GIVEN
        int number = -10;
        //WHEN
        boolean actual = SmallerThanZero.smallerThanZero(number);
        //THEN
        assertTrue(actual);
    }

    @Test
    void greaterThanZero(){
        //GIVEN
        int number = 1;
        //WHEN
        boolean actual = SmallerThanZero.smallerThanZero(number);
        //THEN
        assertFalse(actual);
    }

    @Test
    void equalsZero(){
        //GIVEN
        int number = 0;
        //WHEN
        boolean actual = SmallerThanZero.smallerThanZero(number);
        //THEN
        assertFalse(actual);
    }
}