import static org.junit.jupiter.api.Assertions.*;

import com.stjean.operation.OperationMathematique;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class TestOperationMathematique {

    @Nested
    class testOperationMathematique {

        @Test
        public void testEstPositif() {
            OperationMathematique R = new OperationMathematique();
            assertTrue(R.estPositif(4));
            assertFalse(R.estPositif(-3));
        }

        @Test
        public void testFactorial() {
            OperationMathematique F = new OperationMathematique();
            assertEquals(120, F.factorial(5));
            assertEquals(1, F.factorial(0));
        }
    }



}
