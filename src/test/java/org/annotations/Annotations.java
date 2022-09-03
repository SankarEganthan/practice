package org.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	@BeforeSuite
	private void test1() {
		System.out.println("Annotations test1 @BeforeSuite");
	}
	@AfterSuite
	private void test2() {
		System.out.println("Annotations test2 @AfterSuite");
	}
	@BeforeTest
	private void test3() {
		System.out.println("Annotations test3 @BeforeTest");
	}
	@AfterTest
	private void test4() {
		System.out.println("Annotations test4 @AfterSuite");
	}
	@BeforeClass
	private void test5() {
		System.out.println("Annotations test5 @BeforeSuite");
	}
	@AfterClass
	private void test6() {
		System.out.println("Annotations test6 @AfterSuite");
	}

}
