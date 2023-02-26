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
    @Test
    public void TestSubstraction(){
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.Subract(8, 4), 4.0, 0.1);
        Assert.assertEquals(cal.Subract(1, 4), -3.0, 0.1);
    }
    @Test
    public void TestMultiplication(){
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.multiple(2, 4), 8.0, 0.1);
        Assert.assertEquals(cal.multiple(1, -4), -4.0, 0.1);
        Assert.assertEquals(cal.multiple(0, -4), 0.0, 0.0);
    }
    @Test
    public void TestDivisionArithmeticError(){
        Calculator cal = new Calculator();
        assertThrows(ArithmeticException.class ,
        () -> {
            cal.divide(8, 0);
        });
    }
    @Test
    public void TestModulusArithmeticError(){
        Calculator cal = new Calculator();
        assertThrows(ArithmeticException.class ,
        () -> {
            cal.modulus(8, 0);
        });
    }
    @Test
    public void TestModulusOperation(){
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.modulus(8, 4), 0.0, 0);
        Assert.assertEquals(cal.modulus(6, 5), 1.0,0.1);
    }
    @Test
    public void TestDivisionOperation(){
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.divide(-8, 4), -2.0, 0);
        Assert.assertEquals(cal.divide(6, 5), 1.2,0.1);
        Assert.assertEquals(cal.divide(-9, -3), 3.0,0.1);
        Assert.assertEquals(cal.divide(-2, 4), -0.5,0.1);
    }
}   
