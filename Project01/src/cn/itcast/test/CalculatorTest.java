package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(2, 3);
        System.out.println(result);
    }
}
