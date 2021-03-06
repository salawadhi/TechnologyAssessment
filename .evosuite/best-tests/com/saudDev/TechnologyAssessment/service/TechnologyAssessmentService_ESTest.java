/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 01:30:13 GMT 2019
 */

package com.saud_dev.technology_assessment.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saud_dev.technology_assessment.model.item.Item;
import com.saud_dev.technology_assessment.model.receipt.Receipt;
import com.saud_dev.technology_assessment.service.TechnologyAssessmentService;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TechnologyAssessmentService_ESTest extends TechnologyAssessmentService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      item0.setType("Crocery");
      linkedList0.add(item0);
      receipt0.setTimeAsCustomer("500");
      item0.setValue("500");
      receipt0.setItems(linkedList0);
      receipt0.setCustomer("500");
      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
      String string0 = technologyAssessmentService0.calculateDiscount(receipt0);
      assertEquals("{\r\n  \"discounted_amount\" : \"50.00\",\r\n  \"final_amount\" : \"450.00\",\r\n  \"original_amount\" : \"500.00\",\r\n  \"customer_type\" : \"500\"\r\n}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
      Receipt receipt0 = new Receipt();
      receipt0.setCustomer("6mdjjLT`%rek-5@");
      receipt0.setTimeAsCustomer("6mdjjLT`%rek-5@");
      // Undeclared exception!
      try { 
        technologyAssessmentService0.calculateDiscount(receipt0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      item0.setType("Crocery");
      linkedList0.add(item0);
      item0.setValue("500");
      receipt0.setItems(linkedList0);
      receipt0.setCustomer("500");
      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
      String string0 = technologyAssessmentService0.calculateDiscount(receipt0);
      assertEquals("{\r\n  \"discounted_amount\" : \"25.00\",\r\n  \"final_amount\" : \"475.00\",\r\n  \"original_amount\" : \"500.00\",\r\n  \"customer_type\" : \"500\"\r\n}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      item0.setType("grocery");
      item0.setValue("0.0");
      linkedList0.offerLast(item0);
      receipt0.setItems(linkedList0);
      receipt0.setCustomer("0.0");
      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
      String string0 = technologyAssessmentService0.calculateDiscount(receipt0);
      assertEquals("{\r\n  \"discounted_amount\" : \"0.00\",\r\n  \"final_amount\" : \"0.00\",\r\n  \"original_amount\" : \"0.00\",\r\n  \"customer_type\" : \"0.0\"\r\n}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Receipt receipt0 = new Receipt();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Item item0 = new Item();
      linkedList0.add(item0);
      item0.setValue("500");
      receipt0.setItems(linkedList0);
      receipt0.setCustomer("500");
      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
      // Undeclared exception!
      try { 
        technologyAssessmentService0.calculateDiscount(receipt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
