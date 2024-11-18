package lab4;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest {

	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5); // 1.5
		aPurchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment. 5
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50; //Expecting 3.5 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
	}

	
//	  YOUR TASKS ARE STATED HERE: 
	
	@Test
	public void testGetPurchases() {
		YourPurchases purchase = new YourPurchases();
		purchase.recordPurchase(2.3);
		double result = purchase.getPurchase();
		double expected = 2.3;
		Assert.assertEquals(result, expected, EPSILON);
		
	}
	
	@Test
	public void testGetPayment() {
		YourPurchases purchase1 = new YourPurchases();
		purchase1.receivePayment(8, 0, 0, 0, 0);
		double result = purchase1.getPayment();
		double expected = 8;
		Assert.assertEquals(result, expected, EPSILON);
	}
	
	@Test
	public void testRecordPurchases() {
		YourPurchases purchase1 = new YourPurchases();
		purchase1.recordPurchase(7.0);
		double result = purchase1.getPurchase();
		double expected = 7.0;
		Assert.assertEquals(result, expected, EPSILON);
	}
	
	@Test
	public void testRecievePayment() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(8, 0, 0, 0, 0);
		double result = purchase.getPayment();
		double expected = 8 ;
		Assert.assertEquals(result, expected, EPSILON);
	}
	
	@Test
	public void testGiveChange() {
		YourPurchases purchase = new YourPurchases();
		purchase.recordPurchase(1.5); // 1.5
		purchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment. 5
		double changeResult = purchase.giveChange();
		double expected = 3.50; //Expecting 3.5 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
	}
	
	
	
//	
	
	
	
	   // RUN THE TEST CASE IN YourPurchasesTest.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE individual TEST CASES 
		//  (NOT ALREADY STATED IN THIS CODE) TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
}
