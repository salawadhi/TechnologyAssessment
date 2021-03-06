/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 01:34:05 GMT 2019
 */

package com.saud_dev.technology_assessment.model.receipt;

import org.junit.Test;
import static org.junit.Assert.*;
import com.saud_dev.technology_assessment.model.item.Item;
import com.saud_dev.technology_assessment.model.receipt.Receipt;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Receipt_ESTest extends Receipt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.getItems();
      receipt0.setItems((List<Item>) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.getCustomer();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("X3y_kw3^\"m{UOd$,6");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.getTimeAsCustomer();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setTimeAsCustomer("}\"g_mVDGiRjFZ");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      receipt0.setItems(linkedList0);
      receipt0.getItems();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("");
      receipt0.getCustomer();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setTimeAsCustomer("com.saud_dev.technology_assessment.model.receipt.Receipt");
      receipt0.getTimeAsCustomer();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("User-Agent");
      receipt0.getTimeAsCustomer();
      receipt0.getCustomer();
      receipt0.setTimeAsCustomer("User-Agent");
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      linkedList0.add(item0);
      receipt0.setTimeAsCustomer("");
      receipt0.setCustomer("");
      receipt0.setItems(linkedList0);
      receipt0.getItems();
      receipt0.getTimeAsCustomer();
      receipt0.getItems();
      receipt0.setCustomer("");
  }
}
