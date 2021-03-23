package personal.selenium.framework.java.SeleniumWithJava;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationSequenceExecution {

	/*
	 * @BeforeSuite: The annotated method will be run before all tests in this suite
	 * have run.
	 * 
	 * @AfterSuite: The annotated method will be run after all tests in this suite
	 * have run.
	 * 
	 * @BeforeTest: The annotated method will be run before any test method
	 * belonging to the classes inside the <test> tag is run.
	 * 
	 * @AfterTest: The annotated method will be run after all the test methods
	 * belonging to the classes inside the <test> tag have run.
	 * 
	 * @BeforeGroups: The list of groups that this configuration method will run
	 * before. This method is guaranteed to run shortly before the first test method
	 * that belongs to any of these groups is invoked.
	 * 
	 * @AfterGroups: The list of groups that this configuration method will run
	 * after. This method is guaranteed to run shortly after the last test method
	 * that belongs to any of these groups is invoked.
	 * 
	 * @BeforeClass: The annotated method will be run before the first test method
	 * in the current class is invoked.
	 * 
	 * @AfterClass: The annotated method will be run after all the test methods in
	 * the current class have been run.
	 * 
	 * @BeforeMethod: The annotated method will be run before each test method.
	 * 
	 * @AfterMethod: The annotated method will be run after each test method.
	 * 
	 * Behaviour of annotations in superclass of a TestNG class: The annotations
	 * above will also be honored (inherited) when placed on a superclass of a
	 * TestNG class. This is useful for example to centralize test setup for
	 * multiple test classes in a common superclass. In that case, TestNG guarantees
	 * that the "@Before" methods are executed in inheritance order (highest
	 * superclass first, then going down the inheritance chain), and the "@After"
	 * methods in reverse order (going up the inheritance chain).
	 * 
	 */

	public static int count = 0;

	@BeforeSuite
	public void BeforeSuiteMethod() {
		count++;
		System.out.println("@BeforeSuite Annotation Called at position : " + count);
	}

	@BeforeTest
	public void BeforeTestMethod() {
		count++;
		System.out.println("@BeforeTest Annotation Called at position : " + count);

	}

	@Test
	public void TestMethod() {
		count++;
		System.out.println("@Test Annotation Called at position : " + count);

	}

	@AfterTest
	public void AfterTestMethod() {
		count++;
		System.out.println("@AfterTest Annotation Called at position : " + count);

	}

	@AfterSuite
	public void AfterSuiteMethod() {
		count++;
		System.out.println("@AfterSuite Annotation Called at position : " + count);
	}
}
