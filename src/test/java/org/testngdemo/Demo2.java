package org.testngdemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo2 {
@Test(invocationCount=2)
private void tc0() {
	System.out.println("method 1");
}
@Test(enabled=false)
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
}

@Test
private void tc4() {
	System.out.println("method 5");
	SoftAssert A1 = new SoftAssert();
	A1.assertAll();
	
}

}
	
