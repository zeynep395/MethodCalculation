import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMethodsTest {

    @Test
    public void ShouldMultiplyTwoNumbers() {
        float expectedResult = 10;
        float xValue = 5;
        float yValue = 2;


        float answer = CalculationMethods.Multiply(xValue, yValue);


        Assert.assertEquals(expectedResult, answer);


    }


    @Test
    public void ShouldDivideTwoNumbersByZero() {
        float expectedResult = 0;
        float xValue = 10;
        float yValue = 0;


        float answer = CalculationMethods.Divide(xValue, yValue);


        Assert.assertEquals(expectedResult, answer);


    }

}
