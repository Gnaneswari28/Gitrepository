package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base {
	@FindBy(id="i0116")
	public static WebElement username;
	@FindBy(id="idSIButton9")
	public static WebElement next;
	@FindBy(name="passwd")
	public static WebElement password;
	@FindBy(id="idSIButton9")
	public static WebElement signin;
	@FindBy(id="idSIButton9")
	public static WebElement yes;
	@FindBy(id="txtSearch")
	public static WebElement text;
	@FindBy(xpath="//*[@id=\"mCSB_5_container\"]/span[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/input")
	//public static WebElement submittime;
	public static WebElement mCSB_5_container;
	@FindBy(id="le_apply")
	public static WebElement secondary_button;
	//#mCSB_5_container > span:nth-child(2) > div.levelsublevel > div > div > div > div > div > div:nth-child(6) > div > div > div > div > input
	}
	/*public static WebElement username(WebDriver driver) {
	return driver.findElement(By.name("loginfmt"));
	}
	public static WebElement submit1(WebDriver driver) {
	return driver.findElement(By.id("idSIButton9"));
	}
	public static WebElement password(WebDriver driver) {
	return driver.fi ndElement(By.name("passwd"));
	}
	public static WebElement signin(WebDriver driver) {
	return driver.findElement(By.id("idSIButton9"));
	}
	public static WebElement text(WebDriver driver) {
	return driver.findElement(By.id("txtSearch"));
	}
	public static WebElement submit2(WebDriver driver) {
	return driver.findElement(By.id("idSIButton9"));
	}
	public static WebElement text1(WebDriver driver) {
	return driver.findElement(By.id("txtSearch"));
	}
	public static WebElement time_entry(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[1]/div[2]/div/div/div/div/div/div[4]/div/div/div/div"));
	}
	public static WebElement button(WebDriver driver) {
	return driver.findElement(By.id("le_apply"));
	}*/


