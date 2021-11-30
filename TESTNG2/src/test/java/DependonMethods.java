import org.testng.annotations.Test;

public class DependonMethods {
	@Test
	public void second() {
	System.out.println("Hello");
	}
	@Test
	(dependsOnMethods="second")
	public void first() {
	System.out.println("World");
	}
}
