/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 01:36:06 GMT 2019
 */

package com.saud_dev.technology_assessment.rest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saud_dev.technology_assessment.model.receipt.Receipt;
import com.saud_dev.technology_assessment.rest.TechnologyAssessmentRestController;
import com.saud_dev.technology_assessment.service.TechnologyAssessmentService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TechnologyAssessmentRestController_ESTest extends TechnologyAssessmentRestController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TechnologyAssessmentRestController technologyAssessmentRestController0 = new TechnologyAssessmentRestController();
      TechnologyAssessmentService technologyAssessmentService0 = new TechnologyAssessmentService();
      Injector.inject(technologyAssessmentRestController0, (Class<?>) TechnologyAssessmentRestController.class, "service", (Object) technologyAssessmentService0);
      Injector.validateBean(technologyAssessmentRestController0, (Class<?>) TechnologyAssessmentRestController.class);
      // Undeclared exception!
      try { 
        technologyAssessmentRestController0.getCustomerDiscountedReceipt((Receipt) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 400 BAD_REQUEST \"Invalid parameter, receipt cannot be empty\"
         //
         verifyException("com.saud_dev.technology_assessment.validators.ReceiptValidator", e);
      }
  }
}
