package testngBasics;

import org.testng.annotations.Test;

public class LearningGroupExecutionCon {
	
	@Test(groups = "functional")
	public void searchProduct() {
		System.out.println("Search for Product");
	}
	
	@Test(groups = "system")
	public void logoutTest() {
		System.out.println("Logout Test");
	}
	
	@Test(groups = "integration")
	public void reviewProductTest() {
		System.out.println("Review a product");
	}
	
	@Test(groups = "system")
	public void productCheckoutTest() {
		System.out.println("Product Checkout Test");
	}


}
