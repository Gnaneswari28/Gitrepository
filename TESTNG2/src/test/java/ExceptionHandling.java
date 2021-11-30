import org.testng.annotations.Test;

public class ExceptionHandling {
	@Test(expectedExceptions=Exception.class)
  // @Test
	public void test() {
int a=1;
int b=0;
int c;
c=a/b;
System.out.println(c);
}
}
