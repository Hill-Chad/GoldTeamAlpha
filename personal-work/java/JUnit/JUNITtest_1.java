/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;

                
/**
 * https://youtu.be/lYnMyi81hrs
 * @author Chad
 */
public class JUNITtest {
    @Test
    public void testMuliply() {
        
        double a = 5;
        double b = -4.0;
     
        double expected = -20.0;
        double result = MathUtils.multiply(a,b);
        
        assertEquals(expected, result, 0.00001);
    }
}
