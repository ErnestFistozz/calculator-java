package za.ac.wits.calculator.console.app;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void TestAddition(){
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.add(2,3), 5.0, 0.1);
        Assert.assertEquals(cal.add(-2,-3), -5.0, 0.1);
    }
}   
