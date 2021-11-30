import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	 
	Calculator calc=new Calculator();
    @Test(dataProvider="dpaddition")
    public void add1(int exp_value,int a, int b) {
    Assert.assertEquals(exp_value, calc.add1(a, a));
	}

	@Test
	public void sub1() {
	Assert.assertEquals(0, calc.sub1(5, 5));
	}
    @DataProvider(name="dpaddition")
	public Object[][] getdata(){
	return new Object[][] {{10,5,5},{20,10,10},{50,25,25},{45,25,25}};
	 }
}
