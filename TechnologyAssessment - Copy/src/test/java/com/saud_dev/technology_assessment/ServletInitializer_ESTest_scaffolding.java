/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Feb 13 01:39:22 GMT 2019
 */

package com.saud_dev.technology_assessment;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ServletInitializer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.saud_dev.technology_assessment.ServletInitializer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ServletInitializer_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.util.ReflectionUtils$FieldFilter",
      "org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener",
      "org.springframework.web.WebApplicationInitializer",
      "org.springframework.context.ApplicationContextException",
      "org.springframework.core.env.PropertyResolver",
      "org.springframework.context.ApplicationEventPublisher",
      "org.springframework.util.ConcurrentReferenceHashMap$Segment$1",
      "org.springframework.core.io.support.SpringFactoriesLoader",
      "org.springframework.core.io.Resource",
      "org.springframework.util.ClassUtils",
      "org.springframework.core.annotation.AnnotationConfigurationException",
      "org.springframework.boot.builder.SpringApplicationBuilder",
      "org.springframework.core.annotation.AnnotationUtils",
      "org.springframework.core.PriorityOrdered",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName$ElementsParser",
      "org.springframework.boot.context.event.ApplicationStartingEvent",
      "org.springframework.core.env.CompositePropertySource",
      "org.springframework.util.CollectionUtils",
      "org.springframework.beans.factory.support.BeanNameGenerator",
      "org.springframework.core.io.InputStreamSource",
      "org.springframework.util.ConcurrentReferenceHashMap$Task",
      "org.springframework.core.annotation.AnnotationAwareOrderComparator",
      "org.springframework.context.ApplicationContextAware",
      "org.springframework.beans.factory.ListableBeanFactory",
      "org.springframework.core.Ordered",
      "org.springframework.core.env.CommandLinePropertySource",
      "org.springframework.util.ConcurrentReferenceHashMap$Entry",
      "org.springframework.boot.ApplicationArguments",
      "org.springframework.core.env.PropertySource",
      "org.springframework.boot.context.config.DelegatingApplicationContextInitializer",
      "org.springframework.core.env.ConfigurablePropertyResolver",
      "org.springframework.core.env.EnumerablePropertySource",
      "org.springframework.util.ConcurrentReferenceHashMap$TaskOption",
      "org.springframework.boot.context.ConfigurationWarningsApplicationContextInitializer",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceManager",
      "org.springframework.context.event.ContextClosedEvent",
      "org.springframework.util.ConcurrentReferenceHashMap",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceType",
      "org.springframework.core.KotlinDetector",
      "org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent",
      "org.springframework.core.env.ConfigurableEnvironment",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName$Elements",
      "org.springframework.core.env.EnvironmentCapable",
      "org.springframework.boot.autoconfigure.BackgroundPreinitializer",
      "org.springframework.boot.context.FileEncodingApplicationListener",
      "org.springframework.boot.context.ContextIdApplicationContextInitializer",
      "org.springframework.core.ResolvableType$EmptyType",
      "org.springframework.context.MessageSource",
      "org.springframework.util.ConcurrentReferenceHashMap$1",
      "org.springframework.util.ConcurrentReferenceHashMap$2",
      "org.springframework.util.ConcurrentReferenceHashMap$3",
      "org.springframework.util.ConcurrentReferenceHashMap$4",
      "org.springframework.boot.ExitCodeEvent",
      "org.springframework.context.event.SmartApplicationListener",
      "org.springframework.beans.factory.config.BeanFactoryPostProcessor",
      "org.springframework.util.ObjectUtils",
      "org.springframework.util.MultiValueMap",
      "org.springframework.util.ConcurrentReferenceHashMap$Entries",
      "org.springframework.core.DecoratingProxy",
      "org.springframework.beans.BeansException",
      "org.springframework.boot.logging.LogLevel",
      "org.springframework.core.OrderComparator",
      "org.springframework.context.Lifecycle",
      "org.springframework.util.ResourceUtils",
      "org.springframework.context.ApplicationEvent",
      "org.springframework.util.ReflectionUtils$MethodFilter",
      "org.springframework.boot.context.properties.source.InvalidConfigurationPropertyNameException",
      "org.springframework.core.ResolvableType$1",
      "org.springframework.beans.factory.BeanFactory",
      "org.springframework.boot.WebApplicationType",
      "org.springframework.util.ConcurrentReferenceHashMap$5",
      "org.springframework.util.LinkedMultiValueMap",
      "org.springframework.beans.factory.HierarchicalBeanFactory",
      "org.springframework.util.ConcurrentReferenceHashMap$Reference",
      "org.springframework.boot.context.config.DelegatingApplicationListener",
      "org.springframework.boot.context.event.ApplicationPreparedEvent",
      "org.springframework.util.ConcurrentReferenceHashMap$Segment",
      "org.springframework.boot.Banner$Mode",
      "org.springframework.core.env.SimpleCommandLinePropertySource",
      "org.springframework.boot.SpringApplication",
      "org.springframework.core.io.support.PropertiesLoaderUtils",
      "org.springframework.boot.context.config.AnsiOutputApplicationListener",
      "org.springframework.context.ConfigurableApplicationContext",
      "org.springframework.core.ResolvableType$SyntheticParameterizedType",
      "org.springframework.boot.logging.DeferredLog",
      "org.springframework.core.ResolvableType",
      "org.springframework.core.annotation.SynthesizedAnnotation",
      "org.springframework.boot.env.EnvironmentPostProcessor",
      "com.saud_dev.technology_assessment.ServletInitializer",
      "org.springframework.boot.context.properties.bind.Bindable",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName$ElementType",
      "org.springframework.core.NestedRuntimeException",
      "org.springframework.core.io.ResourceLoader",
      "org.springframework.boot.web.context.ServerPortInfoApplicationContextInitializer",
      "org.springframework.web.context.WebApplicationContext",
      "org.springframework.context.ApplicationListener",
      "org.springframework.boot.context.event.ApplicationFailedEvent",
      "com.saud_dev.technology_assessment.TechnologyAssessmentApplication",
      "org.springframework.util.PropertiesPersister",
      "org.springframework.boot.web.servlet.support.SpringBootServletInitializer",
      "org.springframework.core.annotation.AnnotationAttributeExtractor",
      "org.springframework.boot.ClearCachesApplicationListener",
      "org.springframework.core.SerializableTypeWrapper$TypeProvider",
      "org.springframework.core.env.MapPropertySource",
      "org.springframework.core.env.Environment",
      "org.springframework.core.ResolvableType$VariableResolver",
      "org.springframework.util.ConcurrentReferenceHashMap$Restructure",
      "org.springframework.core.annotation.OrderUtils",
      "org.springframework.boot.context.logging.LoggingApplicationListener",
      "org.springframework.util.ConcurrentReferenceHashMap$SoftEntryReference",
      "org.springframework.beans.BeanUtils",
      "org.springframework.beans.BeanInstantiationException",
      "org.springframework.core.io.UrlResource",
      "org.springframework.boot.autoconfigure.SharedMetadataReaderFactoryContextInitializer",
      "org.springframework.beans.factory.Aware",
      "org.springframework.boot.builder.ParentContextCloserApplicationListener",
      "org.springframework.core.annotation.AnnotationUtils$AnnotationCacheKey",
      "org.springframework.core.io.AbstractFileResolvingResource",
      "org.springframework.core.annotation.AnnotationUtils$AliasDescriptor",
      "org.springframework.core.SerializableTypeWrapper$SerializableTypeProxy",
      "org.springframework.boot.context.config.ConfigFileApplicationListener",
      "org.springframework.boot.liquibase.LiquibaseServiceLocatorApplicationListener",
      "org.springframework.context.event.ApplicationContextEvent",
      "org.springframework.boot.context.logging.ClasspathLoggingApplicationListener",
      "org.springframework.core.annotation.Order",
      "org.springframework.context.event.GenericApplicationListener",
      "org.springframework.core.annotation.AliasFor",
      "org.springframework.beans.FatalBeanException",
      "org.springframework.boot.Banner",
      "org.springframework.core.NestedIOException",
      "org.springframework.context.ApplicationContext",
      "org.springframework.web.context.ConfigurableWebApplicationContext",
      "org.springframework.core.io.AbstractResource",
      "org.springframework.core.SerializableTypeWrapper",
      "org.springframework.core.ResolvableType$TypeVariablesVariableResolver",
      "org.springframework.boot.context.event.SpringApplicationEvent",
      "org.springframework.util.ReflectionUtils",
      "org.springframework.core.io.support.ResourcePatternResolver",
      "org.springframework.context.ApplicationContextInitializer",
      "org.springframework.util.Assert",
      "org.springframework.util.StringUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ServletInitializer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.boot.web.servlet.support.SpringBootServletInitializer",
      "com.saud_dev.technology_assessment.ServletInitializer",
      "org.springframework.boot.builder.SpringApplicationBuilder",
      "org.springframework.boot.SpringApplication",
      "org.springframework.boot.Banner$Mode",
      "org.springframework.util.Assert",
      "org.springframework.boot.WebApplicationType",
      "org.springframework.util.ClassUtils",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceType",
      "org.springframework.util.ConcurrentReferenceHashMap",
      "org.springframework.util.ConcurrentReferenceHashMap$Segment",
      "org.springframework.util.ConcurrentReferenceHashMap$ReferenceManager",
      "org.springframework.core.io.support.SpringFactoriesLoader",
      "org.springframework.util.ConcurrentReferenceHashMap$Restructure",
      "org.springframework.util.LinkedMultiValueMap",
      "org.springframework.core.io.AbstractResource",
      "org.springframework.core.io.AbstractFileResolvingResource",
      "org.springframework.core.io.UrlResource",
      "org.springframework.util.StringUtils",
      "org.springframework.util.CollectionUtils",
      "org.springframework.core.io.support.PropertiesLoaderUtils",
      "org.springframework.util.ResourceUtils",
      "org.springframework.util.ConcurrentReferenceHashMap$Task",
      "org.springframework.util.ConcurrentReferenceHashMap$1",
      "org.springframework.util.ConcurrentReferenceHashMap$TaskOption",
      "org.springframework.util.ConcurrentReferenceHashMap$Entries",
      "org.springframework.util.ConcurrentReferenceHashMap$Segment$1",
      "org.springframework.util.ConcurrentReferenceHashMap$Entry",
      "org.springframework.util.ConcurrentReferenceHashMap$SoftEntryReference",
      "org.springframework.beans.BeanUtils",
      "org.springframework.util.ReflectionUtils",
      "org.springframework.core.KotlinDetector",
      "org.springframework.boot.context.ConfigurationWarningsApplicationContextInitializer",
      "org.springframework.boot.context.ContextIdApplicationContextInitializer",
      "org.springframework.boot.context.config.DelegatingApplicationContextInitializer",
      "org.springframework.boot.web.context.ServerPortInfoApplicationContextInitializer",
      "org.springframework.boot.autoconfigure.SharedMetadataReaderFactoryContextInitializer",
      "org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener",
      "org.springframework.boot.logging.LogLevel",
      "org.springframework.core.OrderComparator",
      "org.springframework.core.annotation.AnnotationAwareOrderComparator",
      "org.springframework.core.annotation.OrderUtils",
      "org.springframework.core.annotation.AnnotationUtils",
      "org.springframework.core.annotation.AnnotationUtils$AnnotationCacheKey",
      "org.springframework.util.ObjectUtils",
      "org.springframework.boot.ClearCachesApplicationListener",
      "org.springframework.boot.builder.ParentContextCloserApplicationListener",
      "org.springframework.boot.context.FileEncodingApplicationListener",
      "org.springframework.boot.context.config.AnsiOutputApplicationListener",
      "org.springframework.boot.context.properties.bind.Bindable",
      "org.springframework.core.ResolvableType$EmptyType",
      "org.springframework.core.ResolvableType",
      "org.springframework.boot.context.config.ConfigFileApplicationListener",
      "org.springframework.boot.logging.DeferredLog",
      "org.springframework.boot.context.config.DelegatingApplicationListener",
      "org.springframework.boot.context.logging.ClasspathLoggingApplicationListener",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName$Elements",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName$ElementsParser",
      "org.springframework.boot.context.properties.source.ConfigurationPropertyName$ElementType",
      "org.springframework.core.SerializableTypeWrapper",
      "org.springframework.core.ResolvableType$SyntheticParameterizedType",
      "org.springframework.core.ResolvableType$TypeVariablesVariableResolver",
      "org.springframework.boot.context.logging.LoggingApplicationListener",
      "org.springframework.boot.liquibase.LiquibaseServiceLocatorApplicationListener",
      "org.springframework.boot.autoconfigure.BackgroundPreinitializer",
      "org.springframework.core.annotation.AnnotationUtils$AliasDescriptor",
      "org.springframework.web.context.WebApplicationContext",
      "org.springframework.boot.web.servlet.support.ServletContextApplicationContextInitializer",
      "org.springframework.boot.web.servlet.support.SpringBootServletInitializer$WebEnvironmentPropertySourceInitializer",
      "org.springframework.util.StopWatch",
      "org.springframework.boot.SpringApplicationRunListeners",
      "org.springframework.boot.context.event.EventPublishingRunListener",
      "org.springframework.context.event.AbstractApplicationEventMulticaster",
      "org.springframework.context.event.SimpleApplicationEventMulticaster",
      "org.springframework.context.event.AbstractApplicationEventMulticaster$ListenerRetriever",
      "org.springframework.aop.framework.AopProxyUtils",
      "org.springframework.context.ApplicationEvent",
      "org.springframework.boot.context.event.SpringApplicationEvent",
      "org.springframework.boot.context.event.ApplicationStartingEvent",
      "org.springframework.context.event.AbstractApplicationEventMulticaster$ListenerCacheKey",
      "org.springframework.context.event.GenericApplicationListenerAdapter",
      "org.springframework.core.ResolvableType$DefaultVariableResolver",
      "org.springframework.core.ResolvableType$WildcardBounds",
      "org.springframework.aop.support.AopUtils",
      "org.springframework.boot.logging.LoggingSystem",
      "org.springframework.boot.logging.LoggerConfigurationComparator",
      "org.springframework.boot.logging.AbstractLoggingSystem",
      "org.springframework.boot.logging.Slf4JLoggingSystem",
      "org.springframework.boot.logging.AbstractLoggingSystem$LogLevels",
      "org.springframework.boot.logging.logback.LogbackLoggingSystem$1",
      "org.springframework.boot.logging.logback.LogbackLoggingSystem",
      "org.springframework.boot.autoconfigure.BackgroundPreinitializer$1",
      "org.springframework.boot.DefaultApplicationArguments",
      "org.springframework.core.env.PropertySource",
      "org.springframework.core.env.EnumerablePropertySource",
      "org.springframework.core.env.CommandLinePropertySource",
      "org.springframework.core.env.SimpleCommandLinePropertySource",
      "org.springframework.boot.DefaultApplicationArguments$Source",
      "org.springframework.core.env.SimpleCommandLineArgsParser",
      "org.springframework.core.env.CommandLineArgs",
      "org.springframework.boot.SpringApplication$1",
      "org.springframework.core.env.AbstractEnvironment",
      "org.springframework.core.env.StandardEnvironment",
      "org.springframework.web.context.support.StandardServletEnvironment",
      "org.springframework.core.env.MutablePropertySources",
      "org.springframework.core.env.AbstractPropertyResolver",
      "org.springframework.core.env.PropertySourcesPropertyResolver",
      "org.springframework.core.env.PropertySource$StubPropertySource",
      "org.springframework.jndi.JndiAccessor",
      "org.springframework.jndi.JndiLocatorSupport",
      "org.springframework.core.SpringProperties",
      "org.springframework.jndi.JndiLocatorDelegate",
      "org.springframework.jndi.JndiPropertySource",
      "org.springframework.jndi.JndiTemplate",
      "org.springframework.core.env.MapPropertySource",
      "org.springframework.core.env.SystemEnvironmentPropertySource",
      "org.springframework.core.convert.support.GenericConversionService$NoOpConverter",
      "org.springframework.core.convert.support.GenericConversionService",
      "org.springframework.format.support.FormattingConversionService",
      "org.springframework.boot.convert.ApplicationConversionService",
      "org.springframework.core.convert.support.GenericConversionService$Converters",
      "org.springframework.core.convert.support.DefaultConversionService",
      "org.springframework.core.convert.support.NumberToNumberConverterFactory",
      "org.springframework.core.convert.support.GenericConversionService$ConverterFactoryAdapter",
      "org.springframework.core.convert.converter.GenericConverter$ConvertiblePair",
      "org.springframework.core.convert.support.GenericConversionService$ConvertersForPair",
      "org.springframework.core.convert.support.StringToNumberConverterFactory",
      "org.springframework.core.convert.support.ObjectToStringConverter",
      "org.springframework.core.convert.support.GenericConversionService$ConverterAdapter",
      "org.springframework.core.convert.support.StringToCharacterConverter",
      "org.springframework.core.convert.support.NumberToCharacterConverter",
      "org.springframework.core.convert.support.CharacterToNumberFactory",
      "org.springframework.core.convert.support.StringToBooleanConverter",
      "org.springframework.core.convert.support.StringToEnumConverterFactory",
      "org.springframework.core.convert.support.AbstractConditionalEnumConverter",
      "org.springframework.core.convert.support.EnumToStringConverter",
      "org.springframework.core.convert.support.IntegerToEnumConverterFactory",
      "org.springframework.core.convert.support.EnumToIntegerConverter",
      "org.springframework.core.convert.support.StringToLocaleConverter",
      "org.springframework.core.convert.support.StringToCharsetConverter",
      "org.springframework.core.convert.support.StringToCurrencyConverter",
      "org.springframework.core.convert.support.StringToPropertiesConverter",
      "org.springframework.core.convert.support.PropertiesToStringConverter",
      "org.springframework.core.convert.support.StringToUUIDConverter",
      "org.springframework.core.convert.support.ArrayToCollectionConverter",
      "org.springframework.core.convert.support.CollectionToArrayConverter",
      "org.springframework.core.convert.support.ArrayToArrayConverter",
      "org.springframework.core.convert.support.CollectionToCollectionConverter",
      "org.springframework.core.convert.support.MapToMapConverter",
      "org.springframework.core.convert.support.ArrayToStringConverter",
      "org.springframework.core.convert.support.CollectionToStringConverter",
      "org.springframework.core.convert.support.StringToArrayConverter",
      "org.springframework.core.convert.support.ArrayToObjectConverter",
      "org.springframework.core.convert.support.ObjectToArrayConverter",
      "org.springframework.core.convert.support.StringToCollectionConverter",
      "org.springframework.core.convert.support.CollectionToObjectConverter",
      "org.springframework.core.convert.support.ObjectToCollectionConverter",
      "org.springframework.core.convert.TypeDescriptor$AnnotatedElementAdapter",
      "org.springframework.core.convert.TypeDescriptor",
      "org.springframework.core.convert.support.StreamConverter",
      "org.springframework.core.convert.support.ByteBufferConverter",
      "org.springframework.core.convert.support.StringToTimeZoneConverter",
      "org.springframework.core.convert.support.ZoneIdToTimeZoneConverter",
      "org.springframework.core.convert.support.ZonedDateTimeToCalendarConverter",
      "org.springframework.core.convert.support.ObjectToObjectConverter",
      "org.springframework.core.convert.support.IdToEntityConverter",
      "org.springframework.core.convert.support.FallbackObjectToStringConverter",
      "org.springframework.core.convert.support.ObjectToOptionalConverter",
      "org.springframework.format.support.DefaultFormattingConversionService",
      "org.springframework.context.support.EmbeddedValueResolutionSupport",
      "org.springframework.format.number.NumberFormatAnnotationFormatterFactory",
      "org.springframework.core.GenericTypeResolver",
      "org.springframework.util.NumberUtils",
      "org.springframework.format.support.FormattingConversionService$AnnotationPrinterConverter",
      "org.springframework.format.support.FormattingConversionService$AnnotationParserConverter",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar$Type",
      "org.springframework.format.datetime.standard.DateTimeFormatterFactory",
      "org.springframework.format.datetime.standard.DateTimeConverters",
      "org.springframework.format.datetime.DateFormatterRegistrar",
      "org.springframework.format.datetime.DateFormatterRegistrar$DateToLongConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$DateToCalendarConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$CalendarToDateConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$CalendarToLongConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$LongToDateConverter",
      "org.springframework.format.datetime.DateFormatterRegistrar$LongToCalendarConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$LocalDateTimeToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$LocalDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToLocalDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToOffsetDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$ZonedDateTimeToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToLocalDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToZonedDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$OffsetDateTimeToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToZonedDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToOffsetDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalDateConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToLocalDateTimeConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$CalendarToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$LongToInstantConverter",
      "org.springframework.format.datetime.standard.DateTimeConverters$InstantToLongConverter",
      "org.springframework.format.datetime.standard.DateTimeFormatterRegistrar$1",
      "org.springframework.format.datetime.standard.TemporalAccessorPrinter",
      "org.springframework.format.datetime.standard.TemporalAccessorParser",
      "org.springframework.format.support.FormattingConversionService$PrinterConverter",
      "org.springframework.format.support.FormattingConversionService$ParserConverter",
      "org.springframework.format.datetime.standard.InstantFormatter",
      "org.springframework.format.datetime.standard.PeriodFormatter",
      "org.springframework.format.datetime.standard.DurationFormatter",
      "org.springframework.format.datetime.standard.YearFormatter",
      "org.springframework.format.datetime.standard.MonthFormatter",
      "org.springframework.format.datetime.standard.YearMonthFormatter",
      "org.springframework.format.datetime.standard.MonthDayFormatter",
      "org.springframework.format.datetime.standard.Jsr310DateTimeFormatAnnotationFormatterFactory",
      "org.springframework.format.datetime.DateTimeFormatAnnotationFormatterFactory",
      "org.springframework.boot.convert.CharArrayFormatter",
      "org.springframework.boot.convert.InetAddressFormatter",
      "org.springframework.boot.convert.IsoOffsetFormatter",
      "org.springframework.boot.convert.ArrayToDelimitedStringConverter",
      "org.springframework.boot.convert.CollectionToDelimitedStringConverter",
      "org.springframework.boot.convert.DelimitedStringToArrayConverter",
      "org.springframework.boot.convert.DelimitedStringToCollectionConverter",
      "org.springframework.boot.convert.StringToDurationConverter",
      "org.springframework.boot.convert.DurationToStringConverter",
      "org.springframework.boot.convert.NumberToDurationConverter",
      "org.springframework.boot.convert.DurationToNumberConverter",
      "org.springframework.boot.convert.StringToDataSizeConverter",
      "org.springframework.boot.convert.NumberToDataSizeConverter",
      "org.springframework.boot.convert.StringToEnumIgnoringCaseConverterFactory",
      "org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent",
      "org.springframework.web.context.support.WebApplicationContextUtils",
      "org.springframework.core.env.PropertySource$ComparisonPropertySource",
      "org.springframework.web.context.support.ServletContextPropertySource",
      "org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor",
      "org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor",
      "org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor",
      "org.springframework.boot.test.web.SpringBootTestRandomPortEnvironmentPostProcessor",
      "org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor$OriginAwareSystemEnvironmentPropertySource",
      "org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor$JsonPropertyValue",
      "org.springframework.boot.cloud.CloudPlatform",
      "org.springframework.boot.context.event.ApplicationFailedEvent",
      "org.springframework.boot.context.event.EventPublishingRunListener$LoggingErrorHandler"
    );
  }
}
