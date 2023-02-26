package za.ac.wits.calculator.console.app;

public class Calculator {
    
    public float add(float x, float y){
        return x + y;
    }

    public float Subract(float x, float y){
        return x - y;
    }
    
    public float multiple(float x, float y){
        return x * y;
    }
    public float divide(float x, float y) throws ArithmeticException {
        if (y == 0){
            throw new ArithmeticException();
        }
        return  x / y;
    }

    public float modulus(float x, float y) throws ArithmeticException {
        if (y == 0){
            throw new ArithmeticException();
        }
        return x % y;
    }
}
