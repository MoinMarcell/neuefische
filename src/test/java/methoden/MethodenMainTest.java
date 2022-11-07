package methoden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodenMainTest {

    @Test
    void add() {
        //GIVEN
        int x = 22;
        int y = 15;
        int result = x + y;
        //WHEN
        int actual = MethodenMain.add(x, y);
        //THEN
        assertEquals(result, actual);
    }

    @Test
    void greater100() {
        //GIVEN
        int x = 99;
        int y =  101;
        //WHEN
        boolean actual = MethodenMain.greater100(x, y);
        //THEN
        assertTrue(actual);
    }
}