import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MainTest {
    Calculator obj = new Calculator();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding the factor of true positive",120,obj.factorial(5));
        assertEquals("Finding the factor of true positive",24,obj.factorial(4));
    }

    @Test
    public void squareRootTruePositive() {
        assertEquals(3.0,obj.squareRoot(9),0.01);
        assertEquals(4.0,obj.squareRoot(16),0.01);
    }
    @Test
    public void powerTruePositive() {
        assertEquals("Finding the factor of true positive",8.0,obj.power(2,3),0.01);
        assertEquals("Finding the factor of true positive",16.0,obj.power(4,2),0.01);
    }
    @Test
    public void LogTruePositive() {
        assertEquals("Finding the factor of true positive",2.302585092994046,obj.log(10),0.01);
        assertEquals("Finding the factor of true positive",2.995732273553991,obj.log(20),0.01);
    }
}
