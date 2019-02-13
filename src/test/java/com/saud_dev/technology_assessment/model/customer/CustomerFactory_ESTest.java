/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 03:30:30 GMT 2019
 */

package com.saud_dev.technology_assessment.model.customer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saud_dev.technology_assessment.model.customer.Customer;
import com.saud_dev.technology_assessment.model.customer.CustomerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomerFactory_ESTest extends CustomerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        CustomerFactory.createCustomer("s&zzOyCU4] Ac?`r", "");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        CustomerFactory.createCustomer((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Customer customer0 = CustomerFactory.createCustomer("enployee", (String) null);
      assertEquals(0.0, customer0.getDiscount(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Customer customer0 = CustomerFactory.createCustomer("affiliate", "affiliate");
      assertEquals(1L, customer0.getSerialversionuid());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Customer customer0 = CustomerFactory.createCustomer("employee", "employee");
      assertEquals(0.3, customer0.getDiscount(), 0.01);
  }
}