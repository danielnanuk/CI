package cn.eggpain.test;

import org.junit.Assert;
import org.junit.Test;

import cn.eggpain.PlusCalculator;

public class PlusCalculatorTest {

    @Test
    public void one_plus_one_should_equal_to_two() {
        int a = 1;
        int b = 1;

        int result = PlusCalculator.plus(a, b);

        Assert.assertEquals(2, result);

    }
}
