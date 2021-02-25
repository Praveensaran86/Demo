package org.testngdemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author PRAVEEN
 *
 */
public class Demo4 {
@Test(invocationCount=2)
private void tc0() {
	System.out.println("method 1");
}
@Test
private void tc1() {
	System.out.println("method 2");
}
@Test(enabled=true)
private void tc2() {
	System.out.println("method 3");
}
@Test
private void tc3() {
	System.out.println("method 4");
	String B ="Assertmethod3";
	SoftAssert A1 = new SoftAssert();
	A1.assertEquals(B,"Assertmethod3");
	System.out.println(B);
	
	
	
}

}
	
