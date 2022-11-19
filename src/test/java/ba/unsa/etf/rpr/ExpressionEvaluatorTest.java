package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test za klasu ExpressionEvaluator
 */
public class ExpressionEvaluatorTest {
    /**
     * obican test za metodu evaluate
     */
    @Test
    void test1() {
        assertEquals(14, ExpressionEvaluator.evaluate("( ( ( 4 + 3 ) * 6 ) / ( 1 + 2 ) )"));
    }

    /**
     * Obican test za metodu evaluate
     */
    @Test
    void test2() {
        assertEquals(24, ExpressionEvaluator.evaluate("( 3 * ( ( 14 - 3 ) - ( 6 / 2 ) ) )"));
    }
    /**
     * obican test za metodu evaluate
     */
    @Test
    void test3() {
        assertEquals(12, ExpressionEvaluator.evaluate("( ( 4 * 3 ) * ( ( ( sqrt ( 4 ) * 4 ) / 8 ) )"));
    }
    /**
     * obican test za metodu evaluate
     */
    @Test
    void test4() {
        assertEquals(27, ExpressionEvaluator.evaluate("( ( ( 18 / 3 ) / 2 ) * ( 5 + 4 ) )"));
    }
    /**
     * obican test za metodu evaluate
     */
    @Test
    void test5() {
        assertEquals(3, ExpressionEvaluator.evaluate("( ( 4 / sqrt ( 16 ) ) + ( 4 / 2 ) )"));
    }
    /**
     * Test za bacanje izuzetka kada nema razmaka izmedju broja i zagrade
     */
    @Test
    void test6() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( 2 + 5)"); });
    }
    /**
     * Test za bacanje izuzetka kada nedostaje broj
     */
    @Test
    void test7() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( ( 2 + 5 ) * )"); });
    }

    /**
     * Test za bacanje izuzetka kada nedostaje operand
     */
    @Test
    void test8() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( ( 2 5 ) * 5 )"); });
    }

    /**
     * Test za bacanje izuzetka kada ima viska zagrada
     */
    @Test
    void test9() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( ( 2 + 5 ) )"); });
    }

    /**
     * Test za bacanje izuzetka kada nema razmaka izmedju broja i operanda
     */
    @Test
    void test10() {
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( 1 * 2* 2 )"); });
    }

}
