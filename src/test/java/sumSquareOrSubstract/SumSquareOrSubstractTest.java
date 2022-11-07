package sumSquareOrSubstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSquareOrSubstractTest {

    @Test
    void whenXgreaterY() {
        int x = 10;
        int y = 9;
        int expected = x + y;

        int actual = SumSquareOrSubstract.sumSquareOrSubstract(x, y);

        assertEquals(expected, actual);
    }

    @Test
    void whenYgreaterX(){
        int x = 9;
        int y = 10;
        int expected = x * y;

        int actual = SumSquareOrSubstract.sumSquareOrSubstract(x, y);

        assertEquals(expected, actual);
    }

    @Test
    void whenXEqualsY(){
        int x = 10;
        int y = 10;
        int expected = x * y;

        int actual = SumSquareOrSubstract.sumSquareOrSubstract(x, y);

        assertEquals(x, y);
    }
}