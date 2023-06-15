package selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationSample {

@BeforeSuite
	public void bs() {
	System.out.println("Before suit");
}
@BeforeTest

	public void bt() {
	System.out.println("Before test");
}
@BeforeClass
	public void bc() {
	System.out.println("Before class");
}	
@Test
@Parameters({"value1","value2"})

 public void methodTest(int num1 ,int num2 ) {
	 System.out.println("The Value is :" +(num1+ " "+ num2));
 }

@AfterClass
	public void afc() {
	System.out.println("After Class");
}
@AfterTest
	public void aft() {
	System.out.println("After test");
}
@AfterSuite
public void afs() {
	System.out.println("After suit");
}
	
}
