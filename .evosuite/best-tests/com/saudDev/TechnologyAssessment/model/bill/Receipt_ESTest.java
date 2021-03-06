/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 12 20:57:50 GMT 2019
 */

package com.saud_dev.technology_assessment.model.receipt;

import org.junit.Test;
import static org.junit.Assert.*;
import com.saud_dev.technology_assessment.model.receipt.Receipt;
import com.saud_dev.technology_assessment.model.item.Item;
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
      receipt0.setTimeAsCustomer("");
      String string0 = receipt0.getTimeAsCustomer();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      linkedList0.add(item0);
      receipt0.setItems(linkedList0);
      List<Item> list0 = receipt0.getItems();
      assertTrue(list0.contains(item0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("com.saud_dev.technology_assessment.model.receipt.Receipt");
      String string0 = receipt0.getCustomer();
      assertEquals("com.saud_dev.technology_assessment.model.receipt.Receipt", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("");
      String string0 = receipt0.getCustomer();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      receipt0.setTimeAsCustomer("sirb/^11ap52D>D*<");
      String string0 = receipt0.getTimeAsCustomer();
      assertEquals("sirb/^11ap52D>D*<", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      String string0 = receipt0.getCustomer();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      String string0 = receipt0.getTimeAsCustomer();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      receipt0.setItems(linkedList0);
      List<Item> list0 = receipt0.getItems();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      List<Item> list0 = receipt0.getItems();
      assertNull(list0);
  }
}
