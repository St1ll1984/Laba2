import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTestSum {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumWorkOneCorrect(){
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testThatSumWorkSixCorrect(){
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testThatSumWorkExceptionCorrect(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            throw new IllegalArgumentException("error message");
        });
    }

}