/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 00:11:30 GMT 2019
 */

package com.saud_dev.technology_assessment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saud_dev.technology_assessment.TechnologyAssessmentApplication;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TechnologyAssessmentApplication_ESTest extends TechnologyAssessmentApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TechnologyAssessmentApplication technologyAssessmentApplication0 = new TechnologyAssessmentApplication();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "W?GYo[u]Yi=S|-8b";
      // Undeclared exception!
      try { 
        TechnologyAssessmentApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TechnologyAssessmentApplication technologyAssessmentApplication0 = new TechnologyAssessmentApplication();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "RS+Yq] ";
      stringArray0[2] = "";
      // Undeclared exception!
      try { 
        TechnologyAssessmentApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = "T`^D";
      stringArray0[0] = "T`^D";
      String string1 = "";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        TechnologyAssessmentApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TechnologyAssessmentApplication technologyAssessmentApplication0 = new TechnologyAssessmentApplication();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "]9fJyHj^YOQi7#2!<";
      stringArray0[2] = "";
      stringArray0[3] = "n";
      // Undeclared exception!
      try { 
        TechnologyAssessmentApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }
}
