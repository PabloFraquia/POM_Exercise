import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	public static WebDriver driver;
	
	public Base (WebDriver driver) {
		Base.driver = driver;
	}
	public WebDriver ChromeDriverConection() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Desktop\\selenium\\documentos\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
		}
		return driver;
	}
	public void getPage(String ulr) {
		driver.get(ulr);
	}
	public void sendKeys(String str, By Locator) {
		driver.findElement(Locator).sendKeys(str);
	}
	public void click(By Locator) {
		driver.findElement(Locator).click();
	}
	public List<WebElement> findElements(By Locator){
		List<WebElement> listWe=driver.findElements(Locator);
		return listWe;
	}
	public void clear(By Locator) {
		driver.findElement(Locator).clear();
	}
	public String getText(By Locator) {
		return driver.findElement(Locator).getText();
	}
	public void getP(String str) {
		driver.get(str);
	}
	
}
