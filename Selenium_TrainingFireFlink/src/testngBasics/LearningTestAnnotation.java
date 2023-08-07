package testngBasics;

import org.testng.annotations.Test;

public class LearningTestAnnotation {
	
	@Test
	public void systemTest() {
		
		System.out.println("Hello testng");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test Case 2");
	}
	
	@Test
	public void aftertest() {
		System.out.println("After test method");
	}

}
