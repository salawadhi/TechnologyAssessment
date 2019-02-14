/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 14 17:39:38 GMT 2019
 */

package com.saud_dev.technology_assessment.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.LinkedList;

import org.junit.Test;

import com.saud_dev.technology_assessment.model.item.Item;
import com.saud_dev.technology_assessment.model.receipt.Receipt;

public class TechnologyAssessmentService_Test {

	 @Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
	      Receipt receipt0 = new Receipt();
	      receipt0.setCustomer("#5n52!qWIm");
	      LinkedList<Item> linkedList0 = new LinkedList<Item>();
	      Item item0 = new Item();
	      item0.setValue("-Infinity");
	      linkedList0.add(item0);
	      receipt0.setItems(linkedList0);
	      // Undeclared exception!
	      try { 
	        technologyAssessmentService0.calculateDiscount(receipt0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	      }
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
	      Receipt receipt0 = new Receipt();
	      receipt0.setCustomer("#5n52qWIm");
	      LinkedList<Item> linkedList0 = new LinkedList<Item>();
	      Item item0 = new Item();
	      receipt0.setItems(linkedList0);
	      item0.setType("i;9P8V");
	      item0.setValue("5");
	      linkedList0.add(item0);
	      receipt0.setTimeAsCustomer("5");
	      String string0 = technologyAssessmentService0.calculateDiscount(receipt0);
	      assertEquals("{\r\n  \"customer_type\" : \"#5n52qWIm\",\r\n  \"original_amount\" : \"5.00\",\r\n  \"discounted_amount\" : \"0.25\",\r\n  \"final_amount\" : \"4.75\"\r\n}", string0);
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
	      Receipt receipt0 = new Receipt();
	      receipt0.setTimeAsCustomer("");
	      receipt0.setCustomer("");
	      // Undeclared exception!
	      try { 
	        technologyAssessmentService0.calculateDiscount(receipt0);
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	      }
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
	      Receipt receipt0 = new Receipt();
	      LinkedList<Item> linkedList0 = new LinkedList<Item>();
	      Item item0 = new Item();
	      item0.setType("grocery");
	      item0.setValue("8");
	      receipt0.setCustomer("grocery");
	      linkedList0.add(item0);
	      receipt0.setItems(linkedList0);
	      String string0 = technologyAssessmentService0.calculateDiscount(receipt0);
	      assertEquals("{\r\n  \"customer_type\" : \"grocery\",\r\n  \"original_amount\" : \"8.00\",\r\n  \"discounted_amount\" : \"0.00\",\r\n  \"final_amount\" : \"8.00\"\r\n}", string0);
	  }
}