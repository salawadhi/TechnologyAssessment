/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 03:28:29 GMT 2019
 */

package com.saud_dev.technology_assessment.validators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saud_dev.technology_assessment.model.item.Item;
import com.saud_dev.technology_assessment.model.receipt.Receipt;
import com.saud_dev.technology_assessment.validators.ReceiptValidator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReceiptValidator_ESTest extends ReceiptValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("YXb");
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      linkedList0.add((Item) null);
      receipt0.setItems(linkedList0);
      ReceiptValidator.validateReceipt(receipt0);
      assertNull(receipt0.getTimeAsCustomer());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("YXb");
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      receipt0.setItems(linkedList0);
      // Undeclared exception!
      try { 
        ReceiptValidator.validateReceipt(receipt0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 400 BAD_REQUEST \"Invalid parameter: items\"
         //
         verifyException("com.saud_dev.technology_assessment.validators.ReceiptValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("");
      // Undeclared exception!
      try { 
        ReceiptValidator.validateReceipt(receipt0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 400 BAD_REQUEST \"Invalid parameter, customer cannot be empty\"
         //
         verifyException("com.saud_dev.technology_assessment.validators.ReceiptValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("/");
      // Undeclared exception!
      try { 
        ReceiptValidator.validateReceipt(receipt0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 400 BAD_REQUEST \"Invalid parameter: items\"
         //
         verifyException("com.saud_dev.technology_assessment.validators.ReceiptValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReceiptValidator.validateReceipt((Receipt) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 400 BAD_REQUEST \"Invalid parameter, receipt cannot be empty\"
         //
         verifyException("com.saud_dev.technology_assessment.validators.ReceiptValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      // Undeclared exception!
      try { 
        ReceiptValidator.validateReceipt(receipt0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 400 BAD_REQUEST \"Invalid parameter, customer cannot be empty\"
         //
         verifyException("com.saud_dev.technology_assessment.validators.ReceiptValidator", e);
      }
  }
}