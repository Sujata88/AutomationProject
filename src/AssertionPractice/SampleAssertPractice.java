package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleAssertPractice {
	
//	@Test
//	public void Demo() {
		
//		String str1="Hellow";
//		Assert.assertEquals(str1, "Hii");
		
//		String str2="Hii";
//		Assert.assertEquals(str1, "Hii");
		
//	}
	
	@Test
	public void Demo2() {
		SoftAssert soft = new SoftAssert();
		String str1="Hellow";
		
		soft.assertEquals(str1,"hi");
		System.out.println("Hellow");
		
		soft.assertEquals(str1, "Hellow");
		System.out.println("Hii everyone");
		
		
		
		
		
		

		
	
	}

}
