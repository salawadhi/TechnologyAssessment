/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 03:31:42 GMT 2019
 */

package com.saud_dev.technology_assessment.validators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saud_dev.technology_assessment.model.item.Item;
import com.saud_dev.technology_assessment.validators.ItemValidator;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemValidator_ESTest extends ItemValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      item0.setValue("8D");
      linkedList0.add(item0);
      ItemValidator.validateItems(linkedList0);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      item0.setValue("$VALUES");
      linkedList0.add(item0);
      // Undeclared exception!
      try { 
        ItemValidator.validateItems(linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 400 BAD_REQUEST \"Invalid Parameter item value for item : null,$VALUES\"; nested exception is java.lang.NumberFormatException: For input string: \"$VALUES\"
         //
         verifyException("com.saud_dev.technology_assessment.validators.ItemValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      List<Item> list0 = linkedList0.subList(0, 0);
      linkedList0.add(item0);
      // Undeclared exception!
      try { 
        ItemValidator.validateItems(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      linkedList0.add(item0);
      // Undeclared exception!
      try { 
        ItemValidator.validateItems(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
