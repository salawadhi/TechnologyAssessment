/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 01:34:42 GMT 2019
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
      Affiliate affiliate0 = new Affiliate();
      affiliate0.getDiscount();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Affiliate affiliate0 = new Affiliate((-0.9704672160074356));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Affiliate affiliate0 = new Affiliate((-1.0));
  }
}
