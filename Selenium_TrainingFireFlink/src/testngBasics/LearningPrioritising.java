package testngBasics;

import org.testng.annotations.Test;

public class LearningPrioritising {

	@Test(priority = 2)
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	@Test(priority = 1)
	public void registerTest() {
		System.out.println("Register Test");
	}
	
	@Test(priority = 4)
	public void addToCartTest() {
		System.out.println("Add  product to cart");
	}
	
	@Test (priority = 3)
	public void addToWishListTest() {
		System.out.println("Add product to wishlist");
	}

}
