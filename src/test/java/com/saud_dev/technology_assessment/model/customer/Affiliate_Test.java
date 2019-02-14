package com.saud_dev.technology_assessment.model.customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Affiliate_Test {

	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      Affiliate affiliate0 = new Affiliate(0.0);
	      assertEquals(0.1, affiliate0.getDiscount(), 0.01);
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Affiliate affiliate0 = new Affiliate();
	      double double0 = affiliate0.getDiscount();
	      assertEquals(0.1, double0, 0.01);
	  }
	  
	  @Test(timeout = 4000)
	  public void test2() throws Throwable {
		  Affiliate affiliate0 = new Affiliate();
		  double double0 = affiliate0.getDiscount();
		  assertFalse(double0 < 0);
	  }
}
