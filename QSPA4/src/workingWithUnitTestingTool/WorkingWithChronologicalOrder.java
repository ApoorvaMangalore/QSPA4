package workingWithUnitTestingTool;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithChronologicalOrder {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before suite");
		System.out.println("Data base connection start");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am after suite");
		System.out.println("Data base connection stop");
	}

	@Test // test case
	public void test1() {
		System.out.println("I am @test1");
	}

	@Test // test case
	public void test2() {
		System.out.println("I am @test2");
	}

	@Test
	public void test3() {
		System.out.println("I am @test3");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am after test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before classs");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("I am After classs");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}
}
