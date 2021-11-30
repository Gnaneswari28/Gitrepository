import org.testng.annotations.Test;

public class Priority {
	@Test(priority=2)
	  public void second() {
	 System.out.println("p2");
	  }
	 
	  @Test(priority=1)
	  public void first() {
	 System.out.println("p1");
	  }
	  @Test(priority=-1)
	  public void third() {
	 System.out.println("p3");
	  }
	 
	  @Test
	  public void forth() {
	 System.out.println("p4");
	  }
	  @Test(priority=1)
	  public void fifth() {
	 System.out.println("p5");
	  }
	 
}

 