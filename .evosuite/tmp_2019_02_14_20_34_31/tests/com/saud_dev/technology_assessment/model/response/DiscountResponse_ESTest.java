/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 14 17:41:34 GMT 2019
 */

package com.saud_dev.technology_assessment.model.response;

import org.junit.Test;
import static org.junit.Assert.*;
import com.saud_dev.technology_assessment.model.response.DiscountResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscountResponse_ESTest extends DiscountResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      discountResponse0.setCustomerType("");
      String string0 = discountResponse0.getCustomerType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      discountResponse0.setOriginalAmount((-450.0));
      assertNull(discountResponse0.getCustomerType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      String string0 = discountResponse0.getFinalAmount();
      assertEquals("0.00", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      discountResponse0.setDiscountedAmount((-450.0));
      assertNull(discountResponse0.getCustomerType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      String string0 = discountResponse0.getCustomerType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      discountResponse0.setFinalAmount((-450.0));
      assertNull(discountResponse0.getCustomerType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      String string0 = discountResponse0.getOriginalAmount();
      assertEquals("0.00", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      String string0 = discountResponse0.getDiscountedAmount();
      assertEquals("0.00", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DiscountResponse discountResponse0 = new DiscountResponse();
      discountResponse0.setCustomerType("0.00");
      String string0 = discountResponse0.getCustomerType();
      assertEquals("0.00", string0);
  }
}
