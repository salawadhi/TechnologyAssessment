/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 13 01:39:22 GMT 2019
 */

package com.saud_dev.technology_assessment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.saud_dev.technology_assessment.ServletInitializer;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.boot.builder.SpringApplicationBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServletInitializer_ESTest extends ServletInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServletInitializer servletInitializer0 = new ServletInitializer();
      // Undeclared exception!
      try { 
        servletInitializer0.configure((SpringApplicationBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.saud_dev.technology_assessment.ServletInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServletInitializer servletInitializer0 = new ServletInitializer();
      Class[] classArray0 = (Class[]) Array.newInstance(Class.class, 7);
      SpringApplicationBuilder springApplicationBuilder0 = new SpringApplicationBuilder(classArray0);
      SpringApplicationBuilder springApplicationBuilder1 = servletInitializer0.configure(springApplicationBuilder0);
      assertSame(springApplicationBuilder0, springApplicationBuilder1);
  }
}
