package testngBasics;

import org.testng.annotations.Test;

public class LearningGroupExecution {
	
	@Test(groups = "functional")
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	@Test(groups = "functional")
	public void registerTest() {
		System.out.println("Register Test");
	}
	
	@Test(groups = "integration")
	public void addToCartTest() {
		System.out.println("Add  product to cart");
	}
	
	@Test (groups = "integration")
	public void addToWishListTest() {
		System.out.println("Add product to wishlist");
	}

}
