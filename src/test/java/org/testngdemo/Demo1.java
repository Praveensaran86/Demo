package org.testngdemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {
@Test(invocationCount=3)
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
}

@Test
private void tc4() {
	System.out.println("method 5");
	String s = "Abcd";
	
	SoftAssert assert1 = new SoftAssert();
	assert1.assertEquals(s,"Abcd");
	System.out.println(s);
	

}

}
	
