/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Feb 13 01:36:06 GMT 2019
 */

package com.saud_dev.technology_assessment.rest;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TechnologyAssessmentRestController_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.saud_dev.technology_assessment.rest.TechnologyAssessmentRestController"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\d3v\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "D:\\Dev\\Eclipse-WS\\TechnologyAssessment"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\d3v"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "d3v"); 
    java.lang.System.setProperty("user.timezone", "GMT+03:00"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TechnologyAssessmentRestController_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.core.NestedRuntimeException",
      "org.springframework.web.server.ResponseStatusException",
      "org.springframework.web.bind.annotation.RequestMapping",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.beans.factory.annotation.Autowired",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.saud_dev.technology_assessment.service.TechnologyAssessmentService",
      "com.saud_dev.technology_assessment.model.receipt.Receipt",
      "org.springframework.stereotype.Controller",
      "org.springframework.web.bind.annotation.ResponseBody",
      "org.springframework.web.bind.annotation.RestController",
      "org.springframework.http.HttpStatus",
      "org.springframework.http.HttpEntity",
      "org.springframework.stereotype.Component",
      "com.saud_dev.technology_assessment.rest.TechnologyAssessmentRestController",
      "org.springframework.stereotype.Service",
      "org.springframework.http.ResponseEntity",
      "com.saud_dev.technology_assessment.validators.ReceiptValidator",
      "org.springframework.core.NestedExceptionUtils",
      "org.springframework.web.bind.annotation.Mapping",
      "org.springframework.util.Assert"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TechnologyAssessmentRestController_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.saud_dev.technology_assessment.rest.TechnologyAssessmentRestController",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.springframework.http.HttpStatus",
      "com.saud_dev.technology_assessment.service.TechnologyAssessmentService",
      "com.saud_dev.technology_assessment.validators.ReceiptValidator",
      "org.springframework.core.NestedRuntimeException",
      "org.springframework.web.server.ResponseStatusException",
      "org.springframework.util.Assert",
      "com.saud_dev.technology_assessment.model.receipt.Receipt"
    );
  }
}
