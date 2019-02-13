/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 03:33:01 GMT 2019
 */

package com.saud_dev.technology_assessment.model.customer;

import org.junit.Test;
import static org.junit.Assert.*;
import com.saud_dev.technology_assessment.model.customer.Affiliate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Affiliate_ESTest extends Affiliate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Affiliate affiliate0 = new Affiliate(949.5309377765241);
      double double0 = affiliate0.getDiscount();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Affiliate affiliate0 = new Affiliate();
      assertEquals(0.1, affiliate0.getDiscount(), 0.01);
  }
}
