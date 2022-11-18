package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpressionEvaulatorTest {
    @Test
    void test1() {
        assertEquals(14,ExpressionEvaulator.evaluate("( ( ( 4 + 3 ) * 6 ) / ( 1 + 2 ) )"));
    }
    @Test
    void test2() {
        assertEquals(24,ExpressionEvaulator.evaluate("( 3 * ( ( 14 - 3 ) - ( 6 / 2 ) ) )"));
    }
    @Test
    void test3() {
        assertEquals(12,ExpressionEvaulator.evaluate("( ( 4 * 3 ) * ( ( ( sqrt ( 4 ) * 4 ) / 8 ) )"));
    }
    @Test
    void test4() {
        assertEquals(27,ExpressionEvaulator.evaluate("( ( ( 18 / 3 ) / 2 ) * ( 5 + 4 ) )"));
    }
    @Test
    void test5() {
        assertEquals(3,ExpressionEvaulator.evaluate("( ( 4 / sqrt ( 16 ) ) + ( 4 / 2 ) )"));
    }
    @Test
    void test6() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaulator.evaluate("( 2 + 5)"); });
    }
    @Test
    void test7() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaulator.evaluate("( ( 2 + 5 ) * )"); });
    }
    @Test
    void test8() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaulator.evaluate("( ( 2 5 ) * 5 )"); });
    }
    @Test
    void test9() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaulator.evaluate("( ( 2 + 5 ) )"); });
    }
    @Test
    void test10() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaulator.evaluate("( 1 * 2* 2 )"); });
    }

}
