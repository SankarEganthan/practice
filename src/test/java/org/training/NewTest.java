package org.training;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
		System.out.println("GITAnnotations test1 @Test");
  }
  @BeforeMethod
  public void beforeMethod() {
		System.out.println("Annotations test1 @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
		System.out.println("Annotations test1 @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
		System.out.println("Annotations test1 @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
		System.out.println("Annotations test1 @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
		System.out.println("Annotations test1 @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
		System.out.println("Annotations test1 @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
		System.out.println("Annotations test1 @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
		System.out.println("Annotations test1 @AfterSuite");
  }

}
