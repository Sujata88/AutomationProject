package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	String str1="Hellow";   //actual
	String str2="Hi";       //expected
	String str3=" ";
	
	@Test
	public void Test1() {
		Assert.assertEquals(str1, str2);
	}
	
	@Test
	public void Test2() {
		Assert.assertNotEquals(str1, str2);
	}
	
	@Test
	public void Test3() {
		Assert.assertNull(str1);
	}
	
	@Test
	public void Test4() {
		Assert.assertNotNull(str1);
	}
	
	@Test
	public void Test5() {
		Assert.fail();
	}
	
		
	
	
	
	

}
