

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestNG_Annotations {
		@BeforeSuite
		public void before_Suite() {
		System.out.println("Before all suite will get executed");
		}
		@BeforeTest
		public void before_test() {
		System.out.println("Before test to be executed");
		}
		@BeforeClass
		public void before_class() {
		System.out.println("Before class to be executed");
		}
		@BeforeMethod
		public void before_method() {
		System.out.println("before method ");
		}
		  @Test
		  public void Sample1() {
		 System.out.println("Hello");
		  }
		 
		  @Test
		  public void Sample2() {
		 System.out.println("World");
		  }
		 
		 
		  @AfterSuite
		public void after_Suite() {
		System.out.println("after all suite will get executed");
		}
		 
		  @AfterTest
		public void after_test() {
		System.out.println("after test to be executed");
		}
		 
		  @AfterClass
		public void after_class() {
		System.out.println("after class to be executed");
		}
		 
		  @AfterMethod
		public void after_method() {
		System.out.println("after method ");
		}
		}




