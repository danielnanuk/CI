package cn.eggpain.test;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
	
	@Test
	public void one_plus_one_should_equal_to_two(){
		int a = 1;
		int b = 1;
		
		int c = a + b;
		
		Assert.assertEquals(2, c);
		
	}
}
