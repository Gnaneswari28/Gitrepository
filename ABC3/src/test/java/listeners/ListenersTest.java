package listeners;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import objectrepository.Base;
public class ListenersTest {
	//static final Logger logger=Logger.getLogger(ListenersTest.class);

	/*public static void main(String[] args) {

// BasicConfigurator.configure();
//DOMConfigurator.configure("log4j.xml");
PropertyConfigurator.configure("Log4j.properties");

logger.debug("for debug");
logger.info("for info");
logger.warn("for warn");
  logger.error("for error");
logger.fatal("for fatal");

}*/
	@Test
	public void m1() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myhcl.com/bprhome/Home/Index");
		//logger.info("browser opened");
		driver.manage().window().maximize();
		//logger.info("window maximized");
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		PageFactory.initElements(driver,Base.class);
		Thread.sleep(7000);
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		Base.username.sendKeys("gnaneswari.onteddu@hcl.com");
		//logger.info("usernme entered");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Base.next.click();
		//logger.info("click on next");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Base.password.sendKeys( "ogsr@1432");
		//logger.info("password enterd");
		Thread.sleep(8000);
		Base.signin.click();
		//logger.info("click on signin");
		Thread.sleep(9000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		Base.yes.click();
		//logger.info("click on yes");
		Thread.sleep(5000);
		Base.text.sendKeys("iTime");
		//logger.info("search for iTime");
		Thread.sleep(5000);
		driver.findElement((By.xpath("/html/body/ul/li/table/tbody/tr/td[1]/a"))).click();
		//logger.info("select iTime from dropdown");
		//Thread.sleep(9000);
		//Base.mCSB_5_container.clear();
		//logger.info("clear the data");
		Thread.sleep(1000);
		Base.mCSB_5_container.sendKeys("09:00");
		//logger.info("enter timesheet");
		Thread.sleep(5000);
		Base.secondary_button.click();
		//logger.info("data saved");

	}
}

